#!/usr/bin/env python
# coding: utf-8
#先安装pika
#python -m pip install pika --upgrade

import pika
import sys
import json

import base64
import uuid


import locale
print(locale.getdefaultlocale())

import urllib
#word=urllib.parse.unquote("%E8%95%BE%E5%A7%86")
#print(word)



credentials = pika.PlainCredentials("boxuser", "smboxQAZDR!@#$")
connection = pika.BlockingConnection(
pika.ConnectionParameters(host='39.100.149.97',credentials=credentials))
channel = connection.channel()
channel.confirm_delivery() # 设置为投递确认模式
#channel.queue_declare(queue="test", durable=True, exclusive=False, auto_delete=False)
corr_id = str(uuid.uuid4())
mac=str("max9911")
message_id=(mac+"@"+corr_id)

#channel.exchange_declare(exchange='order_exchange_name1', exchange_type='fanout')

echotext="就安静安静安静爱打架"
print('========原文本=============')	
print(echotext)

#echotext=echotext.encode('utf-8')

#echotext1=urllib.parse.quote(echotext)

#print(echotext1)
#encodestr=echotext

#异或加密

key='bbooyez'							  #密钥
message=echotext		  #明文
ml=len(message)					  #分别得到密钥和明文的长度
kl=len(key)
key=ml//kl*key+key[:ml%kl]		  #因为要一对一的异或，所以key要变化
pwd=[]						      #通过取整，求余的方法重新得到key
for i in range(len(key)):
	pwd.append(chr(ord(key[i])^ord(message[i]))) #一对一异或操作，得到结果,其中,"ord(char)"得到该字符对应的ASCII码,"chr(int)"刚好相反
#输出异或后
print('========XOR加密之后=============')	
print("".join(pwd))


#encodestr=''.join(pwd)

#print(pwd)
#BASE64加密
encodestr=base64.b64encode("".join(pwd).encode()).decode()
print('========BASE64加密之后=============')	
print(encodestr)

pwd1 = base64.b64decode(encodestr.encode('utf-8')).decode()
print('========BASE64解密之后=============')	
print(pwd1)
#

#XOR解密
result=[]
#pwd为密文
for j in range(len(key)):

    result.append(chr(ord(pwd1[j])^ord(key[j]))) #跟KEY异或回去就是原明文

result=''.join(result)
print('========XOR解密之后=============')
print(result)


#进行bases64加密
#encodestr1 = base64.b64encode(encodestr.encode('utf-8'))
#print(str(encodestr1,'utf8'))

#encodestr1=str(encodestr1,'utf8')

old = '{ "boxNo": "'+mac+'", "devType": "S9300", "echoType": "echo1", "remark": ""}'

new1 = json.dumps({**json.loads(old), **{"msgId": (message_id) }})

new = json.dumps({**json.loads(new1), **{"uploadCode": (encodestr) }})

try:
 #message = ' '.join(sys.argv[1:]) or "info: Hello World!"
    channel.basic_publish(exchange='collector_exchange',
    properties=pika.BasicProperties(message_id=message_id,delivery_mode=1,priority=0,content_encoding="utf-8",content_type="application/json",correlation_id=corr_id),
    routing_key='',
    body=str(new), 
    )
    print('Message publish was confirmed')
    print(" [x] Sent %r" % new)
except pika.exceptions.UnroutableError:   
    print('Message could not be confirmed')
    
#重试一次
    channel.basic_publish(exchange='collector_exchange',
    properties=pika.BasicProperties(message_id=message_id,delivery_mode=1,priority=0,content_encoding="utf-8",content_type="application/json",correlation_id=corr_id),
    routing_key='',
    body=str(new), 
    )

connection.close()
