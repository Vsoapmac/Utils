package smg.Vsoapmac.base.classes;

public class abstractChild extends abstractClass{
    /**
     * 抽象类可以被继承
     * 重写是子类对父类的允许访问的方法的实现过程进行重新编写，返回值和形参都不能改变。
     * 外壳不变，核心重写
     */
    @Override
    public void readBook(){
        System.out.println("childReadBook");
        super.readBook();//调用父类的方法
    }

    public static void main(String[] args) {
        abstractClass ac = new abstractChild();
        ac.readBook();//编译时看右边，调用的是子类的方法
    }

    /**
     * 重载是在一个类中实现的，有多个同名方法
     * 但参数不一样，包括参数类型、参数个数、还可以没有参数，总之每个重载的方法的参数必须不一样。
     */
    public void readBook(String str){
        System.out.println("overload");
    }
}
