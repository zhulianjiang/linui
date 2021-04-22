package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;

/**
 * @description: Card
 * @author: leozhu
 * @create: 2020-09-16 16:35
 **/
public class Card implements ISkill {

    private String name;
    private String age;

    public Card() {

    }

    public Card(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + ";" + this.age);
    }

    @Override
    public void q() {
        System.out.println("Card Q");
    }

    @Override
    public void w() {
        System.out.println("Card W");
    }

    @Override
    public void e() {
        System.out.println("Card E");
    }

    @Override
    public void r() {
        System.out.println("Card R");
    }
}
