package smg.Vsoapmac.base.invoke;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射是框架设计的灵魂
 *
 * JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法
 * 对于任意一个对象，都能够调用它的任意一个方法和属性
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制
 *
 * 要想解剖一个类,必须先要获取到该类的字节码文件对象。而解剖使用的就是Class类中的方法.所以先要获取到每一个字节码文件对应的Class类型的对象
 * 反射就是把java类中的各种成分映射成一个个的Java对象
 */
public class invokeClass {
    /**
     * 获取Class对象的三种方式
     *  * 1 Object ——> getClass();
     *  * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
     *  * 3 通过Class类的静态方法：forName（String  className）(常用)
     */
    public static void getClassPRT(){
        //第一种获取方式
        city city1 = new city();
        Class cityClass = city1.getClass();
        System.out.println(cityClass.getName());

            System.out.println("Line : --------------------------");

            //第二种
            Class cityClass1 = city.class;
            System.out.println(cityClass1.getName());
            //hashCode是用来在散列存储结构中确定对象的存储地址的；如果两个对象相同，就是适用于equals(java.lang.Object) 方法，那么这两个对象的hashCode一定要相同；
            System.out.println(cityClass.hashCode() == cityClass1.hashCode());

            System.out.println("Line : --------------------------");

            try {
                Class cityClass2 = Class.forName("smg.Vsoapmac.base.invoke.city");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
                System.out.println(cityClass2.getName());
                System.out.println(cityClass1.hashCode() == cityClass2.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * class常用api
     */
    public static void classAPI(){
        Class cityClass = city.class;

        String name = cityClass.getName();//返回由 类对象表示的实体（类，接口，数组类，原始类型或空白）的名称，作为 String。
        System.out.println("class name:" + name);

        Package classPackage = cityClass.getPackage();//获取此类的包。
        System.out.println("package name:" + classPackage.getName());//返回此包的名称。

        try {
            Field id = cityClass.getField("ID");//返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
            System.out.println(id.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            Method method = cityClass.getMethod("getName" , null);
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        invokeClass.getClassPRT();
        invokeClass.classAPI();
    }
}
