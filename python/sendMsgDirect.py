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
pika.ConnectionParameters(host='192.168.56.11',credentials=credentials))
channel = connection.channel()
channel.confirm_delivery() # 设置为投递确认模式
#channel.queue_declare(queue="test", durable=True, exclusive=False, auto_delete=False)
corr_id = str(uuid.uuid4())
mac=str("max9911")
message_id=(mac+"@"+corr_id)

#channel.exchange_declare(exchange='order_exchange_name1', exchange_type='fanout')
echotext='''

{
	"boxNo":"smbox1",
	"ip":"192.168.1.100",
	"devType": "S9300", 
	"HeadInfo": "",
	"Cmd": "display  device",
	"Content": [{
			"Chassis": "Chassis 111  (Master  Switch)",
			"devinfo": [{
					"slot": "1",
					"Sub": "-",
					"Type": "LE1D2S16SX2S",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "2",
					"Sub": "-",
					"Type": "LE1D2S16SX2S",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "5",
					"Sub": "-",
					"Type": "LE1D2G48TX1C",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "7",
					"Sub": "1",
					"Type": "LE1D2SRUE000",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA",
					"subinfo": [{
						"slot": "",
						"Sub": "1",
						"Type": "LE1D2VS04000",
						"Online": "Present",
						"Power": "PowerOn",
						"Register": "Registered",
						"Status": "Normal",
						"Role": "Slave"
					}]
				},
				{
					"slot": "8",
					"Sub": "1",
					"Type": "LE1D2SRUE000",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA",
					"subinfo": [{
						"slot": "",
						"Sub": "1",
						"Type": "LE1D2VS04000",
						"Online": "Present",
						"Power": "PowerOn",
						"Register": "Registered",
						"Status": "Normal",
						"Role": "Master"
					}]
				},
				{
					"slot": "PWR1",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "PWR3",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "CMU1",
					"Sub": "-",
					"Type": "LE02CMUA",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "Master"
				},
				{
					"slot": "FAN1",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "FAN2",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				}
			]
		},
		{
			"Chassis": "Chassis 2 (Standby Switch)",
			"devinfo": [{
					"slot": "1",
					"Sub": "-",
					"Type": "LE1D2S16SX2S",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "2",
					"Sub": "-",
					"Type": "LE1D2S16SX2S",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "5",
					"Sub": "-",
					"Type": "LE1D2G48TX1C",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "7",
					"Sub": "1",
					"Type": "LE1D2SRUE000",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA",
					"subinfo": [{
						"slot": "",
						"Sub": "1",
						"Type": "LE1D2VS04000",
						"Online": "Present",
						"Power": "PowerOn",
						"Register": "Registered",
						"Status": "Normal",
						"Role": "Slave"
					}]
				},
				{
					"slot": "8",
					"Sub": "1",
					"Type": "LE1D2SRUE000",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA",
					"subinfo": [{
						"slot": "",
						"Sub": "1",
						"Type": "LE1D2VS04000",
						"Online": "Present",
						"Power": "PowerOn",
						"Register": "Registered",
						"Status": "Normal",
						"Role": "Master"
					}]
				},
				{
					"slot": "PWR1",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "PWR3",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "CMU1",
					"Sub": "-",
					"Type": "LE02CMUA",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "Master"
				},
				{
					"slot": "FAN1",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				},
				{
					"slot": "FAN2",
					"Sub": "-",
					"Type": "-",
					"Online": "Present",
					"Power": "PowerOn",
					"Register": "Registered",
					"Status": "Normal",
					"Role": "NA"
				}
			]
		}
	]
}
'''

echotext1='''
{
	"boxNo":"smbox1",
	"ip":"192.168.1.100",
	"devType": "S9300", 
	"HeadInfo": "",
	"Cmd": "display  version",
	"Content": [{
			"Chassis": "Chassis  1  (Master  Switch)",
			"product": "Quidway  S9306  Terabit  Routing  Switch",
			"version": "V200R013C00SPC500",
			"uptime": "14  weeks,  6  days,  16  hours,  10  minutes",
			"boardinfo": [{
					"boardname": "MPU  7(Slave)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "MPU  8(Master)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "LPU  1",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  2",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  5",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"boardType": "LE1D2G48TX1C",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "CMU  9(Master)",
					"uptime": "4  weeks,  6  days,  16  hours,  8  minutes",
					"SDRAMMemorySize": "",
					"PCB": "",
					"subboardinfo": []
				}
			]
		},
		{
			"Chassis": "Chassis  2  (Master  Switch)",
			"product": "Quidway  S9306  Terabit  Routing  Switch",
			"version": "V200R013C00SPC500",
			"uptime": "14  weeks,  6  days,  16  hours,  10  minutes",
			"boardinfo": [{
					"boardname": "MPU  7(Slave)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "MPU  8(Master)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "LPU  1",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  2",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  5",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"boardType": "LE1D2G48TX1C",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "CMU 9(Master)",
					"uptime": "4 weeks, 6 days, 16 hours, 8 minutes",
					"SDRAMMemorySize": "",
					"PCB": "",
					"subboardinfo": []
				}
			]
		}
	]
}
'''
echotext=echotext1
#echotext="就安静安静安静爱打架"




print('========原文本=============')	
print(echotext)

#echotext=echotext.encode('utf-8')

#echotext1=urllib.parse.quote(echotext)

#print(echotext1)
#encodestr=echotext

def encodeXor(echotext):
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

        return encodestr;

def decodeXor(encodestr):
        key='bbooyez'
        pwd1 = base64.b64decode(encodestr.encode('utf-8')).decode()
        print('========BASE64解密之后=============')	
        print(pwd1)
        
        #XOR解密
        result=[]
        #pwd为密文
        for j in range(len(key)):

            result.append(chr(ord(pwd1[j])^ord(key[j]))) #跟KEY异或回去就是原明文

        result=''.join(result)
        print('========XOR解密之后=============')
        print(result)
        return result;

#进行bases64加密
#encodestr1 = base64.b64encode(encodestr.encode('utf-8'))
#print(str(encodestr1,'utf8'))

#encodestr1=str(encodestr1,'utf8')


def sendMsg(encodestr,message_id,corr_id,priority):
        try:
         #message = ' '.join(sys.argv[1:]) or "info: Hello World!"
            channel.basic_publish(exchange='collector_exchange',
            properties=pika.BasicProperties(message_id=message_id,delivery_mode=1,priority=priority,content_encoding="utf-8",content_type="application/json",correlation_id=corr_id),
            routing_key='',
            body=str(encodestr), 
            )
            print('Message publish was confirmed')
            print(" [x] Sent %r" % encodestr)
        except pika.exceptions.UnroutableError:   
            print('Message could not be confirmed')
            
        #重试一次
            channel.basic_publish(exchange='collector_exchange',
            properties=pika.BasicProperties(message_id=message_id,delivery_mode=1,priority=priority,content_encoding="utf-8",content_type="application/json",correlation_id=corr_id),
            routing_key='',
            body=str(encodestr), 
            )
        return;

#发送初始化命令
echotext_int=''
echotext_int='''
{
	"boxNo":"smbox1",
	"ip":"192.168.1.100",
	"devType": "S9300", 
	"HeadInfo": "dev1299434131",
	"Cmd": "init"
}
'''

echotext1='''
{
	"boxNo":"smbox1",
	"ip":"192.168.1.100",
	"devType": "S9300", 
	"HeadInfo": "dev1299434131",
	"Cmd": "display  version",
	"Content": [{
			"Chassis": "Chassis  1  (Master  Switch)",
			"product": "Quidway  S9306  Terabit  Routing  Switch",
			"devIp":"192.168.1.101",
			"version": "V200R013C00SPC500",
			"uptime": "14  weeks,  6  days,  16  hours,  10  minutes",
			"boardinfo": [{
					"boardname": "MPU  7(Slave)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "MPU  8(Master)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "LPU  1",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  2",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  5",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"boardType": "LE1D2G48TX1C",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "CMU  9(Master)",
					"uptime": "4  weeks,  6  days,  16  hours,  8  minutes",
					"SDRAMMemorySize": "",
					"PCB": "",
					"subboardinfo": []
				}
			]
		},
		{
			"Chassis": "Chassis  2  (Master  Switch)",
			"product": "Quidway  S9306  Terabit  Routing  Switch",
			"devIp":"192.168.1.102",
			"version": "V200R013C00SPC500",
			"uptime": "14  weeks,  6  days,  16  hours,  10  minutes",
			"boardinfo": [{
					"boardname": "MPU  7(Slave)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "MPU  8(Master)",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": [{
						"picname": "LE1D2VS04000",
						"picslot":"1",
						"PCB": "SWC02VS04000  VER.A"
					}]
				},
				{
					"boardname": "LPU  1",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  2",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "LPU  5",
					"uptime": "14  weeks,  6  days,  3  hours,  32  minutes",
					"SDRAMMemorySize": "4096  M  bytes",
					"boardType": "LE1D2G48TX1C",
					"PCB": "SWC02MFUD000  VER.B",
					"subboardinfo": []
				},
				{
					"boardname": "CMU 9(Master)",
					"uptime": "4 weeks, 6 days, 16 hours, 8 minutes",
					"SDRAMMemorySize": "",
					"PCB": "",
					"subboardinfo": []
				}
			]
		}
	]
}
'''


echotext2='''
{
	"boxNo":"smbox1",
	"ip":"192.168.1.100",
	"devIp":"192.168.1.102",
	"devType": "S9300", 
	"HeadInfo": "",
	"Cmd": "display interface brief",
	"Content": [
		{
			"interaface":"Eth-Trunk1",
			"PHY":"up",
			"Protocol":"up",
			"InUti":"0%",
			"OutUti":"0%",
			"inErrors":"0",
			"outErrors":"0",
			"infaceInfo": [{
				"interaface":"XGigabitEthernet1/2/0/8",
				"PHY":"up",
				"Protocol":"up",
				"InUti":"0%",
				"OutUti":"0%",
				"inErrors":"0",
				"outErrors":"0"
			}]
		},
		{
			"interaface":"Eth-Trunk2",
			"PHY":"up",
			"Protocol":"up",
			"InUti":"0%",
			"OutUti":"0%",
			"inErrors":"0",
			"outErrors":"0",
			"infaceInfo": [{
				"interaface":"XGigabitEthernet2/2/0/9",
				"PHY":"up",
				"Protocol":"up",
				"InUti":"0%",
				"OutUti":"0%",
				"inErrors":"0",
				"outErrors":"0"
			}]
		},
		{
			"interaface":"Eth-Trunk3",
			"PHY":"up",
			"Protocol":"up",
			"InUti":"0%",
			"OutUti":"0%",
			"inErrors":"0",
			"outErrors":"0",
			"infaceInfo": [{
				"interaface":"XGigabitEthernet1/2/0/6",
				"PHY":"up",
				"Protocol":"up",
				"InUti":"0%",
				"OutUti":"0%",
				"inErrors":"0",
				"outErrors":"0"
			},
			{
				"interaface":"XGigabitEthernet2/2/0/6",
				"PHY":"up",
				"Protocol":"up",
				"InUti":"0%",
				"OutUti":"0%",
				"inErrors":"0",
				"outErrors":"0" 
			}]
		}
	]
}
'''

echotext3='''
{
	"boxNo":"smbox1",
	"ip":"192.168.1.100",
	"devIp":"192.168.1.102",
	"devType": "S9300", 
	"HeadInfo": "",
	"Cmd": "display cpu-usage",
	"Content": 
		{
                    "CPU-Usage-Stat-Cycle":"60 (Second)",
                    "CPU-Usage":"19% Max: 95%",
                    "CPU-Usage-Stat-Time":"2019-08-21  18:13:45",
                    "CPU-utilization-for-five-seconds":" 19%: one minute: 19%: five minutes: 13%",
                    "Max-CPU-Usage-Stat-Time":"2019-05-09 02:04:33"
		}
}
'''

#发送命令报文命令-初始化-必须最先执行
encodestr=encodeXor(echotext_int);
decodeXor(encodestr);
sendMsg(encodestr,message_id,corr_id,9);

#发送命令报文命令-version-必须第二次执行
encodestr=encodeXor(echotext1);
decodeXor(encodestr);
sendMsg(encodestr,message_id,corr_id,8);

#发送命令报文命令-interface brief
#encodestr=encodeXor(echotext2);
#decodeXor(encodestr);
#sendMsg(encodestr,message_id,corr_id,1);


connection.close()
