package com.lin.missyou.sample.hero;


import com.lin.missyou.sample.ISkill;

/**
 * @description: Yase
 * @author: leozhu
 * @create: 2020-09-16 16:09
 **/
//@Component
public class Yase implements ISkill {

    private String name;

    private int age;

    public Yase() {
    }

    public Yase(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + ";" + this.age);
    }

    @Override
    public void q() {
        System.out.println("Yase Q");
    }

    @Override
    public void w() {
        System.out.println("Yase W");
    }

    @Override
    public void e() {
        System.out.println("Yase E");
    }

    @Override
    public void r() {
        System.out.println("Yase R");
    }
}
