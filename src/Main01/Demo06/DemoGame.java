package Main01.Demo06;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
        //设置英雄的技能
        hero.setSkill(new SkillImpl());
        hero.attack();

        //使用匿名内部类：
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("Pia ~ Pia ~Pia ~");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        //同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill(){
            @Override
            public void use(){
                System.out.println("Biu~Pia~Biu");
            }
        });
        hero.attack();
    }
}
