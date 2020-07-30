package smg.Vsoapmac.Design_pattern;

/**
 * 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 */
public class Singleton {

    //创建singleton对象
    private static Singleton singleton = new Singleton();

    //将该类的构造函数私有化，这样此类不能被实例化
    private Singleton(){}

    //获取唯一可用的对象
    //是否线程安全取决于这里，只需要在获取唯一对象方法加synchronized即可
    public static synchronized Singleton getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("singleton");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();//获取唯一对象

        singleton.showMessage();
    }
}
