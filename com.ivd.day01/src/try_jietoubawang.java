import java.util.Scanner;

public class try_jietoubawang {
    public  static void main(String args[]){

        int attack1=456;
        double health1=1235.5;
        int defence1=456;
        //技能加成
        double skill1=1.6;

        //对方数值
        int attack2=211;
        double health2=1256.5;
        int defence2=222;
        double skill2=1.5;

        //我方普通攻击一次，造成多少伤害，对方还剩多少血量
        //攻击力-对方防御力
        double damage1=attack1-defence2;
        health2= health2-damage1;
        System.out.println("对方还剩"+ health2);

        //我方进行技能攻击，造成多少伤害，对方还剩多少血量
        //攻击力*技能加成-对方防御力
        double damage2=attack1*skill1-defence2;
        health2 = health2-damage2;
        System.out.println("对方还剩"+ health2);

    }
}
