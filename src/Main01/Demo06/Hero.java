package Main01.Demo06;

import Main01.Demo05.Weapon;

//游戏当中的英雄类
public class Hero {
    private String name;//英雄名称
    private Skill skill;//英雄技能
    public void attack(){
        System.out.println("我叫"+name+"开始释放技能：");
        skill.use();//调用接口当中的抽象方法。
        System.out.println("技能释放完成");
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
