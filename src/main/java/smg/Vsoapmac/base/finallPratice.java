package smg.Vsoapmac.base;

// final 类不能被继承（不能有 abstract final class）（final 类内的 method 自动为 final，但不包括属性）
public final class finallPratice {
    /**
     * final 属性不能被重新赋值（可以被继承，但不可以修改）定义时可以初始化，
     * 也可以不初始化，而在语句块中初始化或者构造函数中初始化（最晚要在构造函数中初始化，只能初始化一次），
     * final 定义的成员变量可以在代码块 (类变量则静态代码块，实例变量普通代码块) 里初始化
     */
    private final String str = "final";

    // final 方法可以被继承但不能被 override 不能有 abstract final method
    public final void finalMethod(){
        // finally作为异常处理的一部分，它只能用在try/catch语句中，并且附带一个语句块，表示这段语句最终一定会被执行
        try{
            //finalize();
            /**
             * finalize()是在java.lang.Object里定义的，也就是说每一个对象都有这么个方法。
             * 这个方法在gc启动，该对象被回收的时候被调用。
             * 一般不需要程序员去实现finalize
             */
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println("This is finally");
        }
    }
}
