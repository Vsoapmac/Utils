package smg.Vsoapmac.Design_pattern.Factory_Pattern;

/**
 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 */
public class ShapeFactory {

    //创建一个工厂，生成基于给定信息的实体类的对象。使用 getShape 方法获取形状类型的对象
    public static Shape getShape(String shapeType){
        switch (shapeType){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
        }
        return null;
    }

    public static void main(String[] args) {
        //在创建对象时只需要获取类型即可，不会暴露创建逻辑，一个工厂类可以创建多个不同的对象
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("Rectangle");
        shape2.draw();
    }
}
