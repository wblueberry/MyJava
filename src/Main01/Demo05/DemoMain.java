package Main01.Demo05;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄起一个名字，并且设置名字
        hero.setAge(20);
        hero.setName("盖伦");

        //创建一个武器对象
        Weapon weapon = new Weapon("霜之哀伤");
        //为英雄配备武器：
        hero.setWeapon(weapon);

        hero.attack();
    }
}
