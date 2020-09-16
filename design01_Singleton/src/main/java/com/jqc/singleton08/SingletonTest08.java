package com.jqc.singleton08;


public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);//true
        System.out.println(singleton1);//com.jqc.singleton.Singleton@1b6d3586
        System.out.println(singleton2);//com.jqc.singleton.Singleton@1b6d3586
        System.out.println(singleton1.hashCode());//460141958
        System.out.println(singleton2.hashCode());//460141958
        singleton1.sayOK();
        singleton2.sayOK();
    }
}

//使用枚举，可以实现单例,推荐使用
enum Singleton{
    INSTANCE;//属性
    public void sayOK() {
        System.out.println("枚举实现单例");
    }
}
