package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

/**
 * @description: Diana
 * @author: leozhu
 * @create: 2020-09-16 15:59
 **/
//@Component
public class Diana implements ISkill {

    private String name;
    private int age;

    public Diana() {
    }

    public Diana(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + ";" + this.age);
    }

    @Override
    public void q() {
        System.out.println("Diana Q");
    }

    @Override
    public void w() {
        System.out.println("Diana W");
    }

    @Override
    public void e() {
        System.out.println("Diana E");
    }

    @Override
    public void r() {
        System.out.println("Diana R");
    }

}
