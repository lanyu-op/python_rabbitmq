package com.microservice.rabbitmq.analysis.impl;
/*
public class Zhuangshi {

}
//Component 英雄接口 
public interface Hero {
  //学习技能
  void learnSkills();
}
//ConcreteComponent 具体英雄盲僧
public class BlindMonk implements Hero {
  
  private String name;
  
  public BlindMonk(String name) {
      this.name = name;
  }

  @Override
  public void learnSkills() {
      System.out.println(name + "学习了以上技能！");
  }
}
//Decorator 技能栏
public class Skills implements Hero{
  
  //持有一个英雄对象接口
  private Hero hero;
  
  public Skills(Hero hero) {
      this.hero = hero;
  }

  @Override
  public void learnSkills() {
      if(hero != null)
          hero.learnSkills();
  }    
}
//ConreteDecorator 技能：Q
public class Skill_Q extends Skills{
  
  private String skillName;

  public Skill_Q(Hero hero,String skillName) {
      super(hero);
      this.skillName = skillName;
  }

  @Override
  public void learnSkills() {
      System.out.println("学习了技能Q:" +skillName);
      super.learnSkills();
  }
}
//ConreteDecorator 技能：W
public class Skill_W extends Skills{

  private String skillName;

  public Skill_W(Hero hero,String skillName) {
      super(hero);
      this.skillName = skillName;
  }

  @Override
  public void learnSkills() {
      System.out.println("学习了技能W:" + skillName);
      super.learnSkills();
  }
}
//ConreteDecorator 技能：E
public class Skill_E extends Skills{
  
  private String skillName;
  
  public Skill_E(Hero hero,String skillName) {
      super(hero);
      this.skillName = skillName;
  }

  @Override
  public void learnSkills() {
      System.out.println("学习了技能E:"+skillName);
      super.learnSkills();
  }
}
//ConreteDecorator 技能：R
public class Skill_R extends Skills{    
  
  private String skillName;
  
  public Skill_R(Hero hero,String skillName) {
      super(hero);
      this.skillName = skillName;
  }
  
  @Override
  public void learnSkills() {
      System.out.println("学习了技能R:" +skillName );
      super.learnSkills();
  }
}
//客户端：召唤师
public class Player {
  public static void main(String[] args) {
      //选择英雄
      Hero hero = new BlindMonk("李青");
      
      Skills skills = new Skills(hero);
      Skills r = new Skill_R(skills,"猛龙摆尾");
      Skills e = new Skill_E(r,"天雷破/摧筋断骨");
      Skills w = new Skill_W(e,"金钟罩/铁布衫");
      Skills q = new Skill_Q(w,"天音波/回音击");
      //学习技能
      q.learnSkills();
  }
}
*/