package com.hz.design.singleton;

/**
 * 测试单例模式
 *
 * 经验之谈：
 *  一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
 *  只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 *  如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
 *  如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestSingleton {

    public static void main(String[] args) {

        Singleton1.getInstance().showMessage();
        Singleton2.getInstance().showMessage();
        Singleton3.getInstance().showMessage();
        Singleton4.getInstance().showMessage();
        Singleton5.getInstance().showMessage();
        Singleton6.INSTANCE.showMessage();

    }

}