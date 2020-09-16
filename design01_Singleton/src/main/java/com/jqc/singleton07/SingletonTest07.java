package com.jqc.singleton07;


public class SingletonTest07 {
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

//懒汉式（静态内部类）推荐使用
 class Singleton {
    //1.构造器私有化
    private Singleton() {
    }

    //2.静态内部类，该类中有个静态的属性
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getSingleton() {
        return SingletonInstance.INSTANCE;
    }
}
