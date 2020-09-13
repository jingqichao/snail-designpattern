package com.jqc.singleton01;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1==singleton2);//true
        System.out.println(singleton1);//com.jqc.singleton.Singleton@1b6d3586
        System.out.println(singleton2);//com.jqc.singleton.Singleton@1b6d3586
        System.out.println(singleton1.hashCode());//460141958
        System.out.println(singleton2.hashCode());//460141958
    }

    //饿汉式（静态常量）
    static class Singleton {
        //1.构造器私有化
        private Singleton() {}
        //2.本类内部创建对象实例
        private final static Singleton singleton = new Singleton();
        //3.提供一个公有的静态方法，返回实例对象
        public static Singleton getSingleton() {
            return singleton;
        }
    }
}
