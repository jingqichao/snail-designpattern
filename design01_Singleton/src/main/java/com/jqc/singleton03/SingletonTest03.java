package com.jqc.singleton03;


public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);//true
        System.out.println(singleton1);//com.jqc.singleton.Singleton@1b6d3586
        System.out.println(singleton2);//com.jqc.singleton.Singleton@1b6d3586
        System.out.println(singleton1.hashCode());//460141958
        System.out.println(singleton2.hashCode());//460141958
    }
}

//懒汉式（线程不安全）
 class Singleton {
    //1.构造器私有化
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private static Singleton singleton;

    //3.提供一个静态的公有方法，当使用到该方法的时候，才去创建instance
    public static Singleton getSingleton() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
