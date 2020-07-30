package smg.Vsoapmac.Design_pattern.Proxy_Pattern;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。为其他对象提供一种代理以控制对这个对象的访问。
 */
public class ProxyImage implements Image{
    private ImageImpl imageImpl;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 代理模式中，用一个类去代理另外一个类的创建
     * 也就是，这个类没创建，那我帮你创建。如果创建完了，我帮你运行
     */
    public void display() {
        if(imageImpl == null){
            imageImpl = new ImageImpl(fileName);
        }
        imageImpl.display();
    }

    public static void main(String[] args) {
        Image image = new ProxyImage("h.jpeg");
        image.display();
        System.out.println("从磁盘加载完毕,本地运行-------");
        image.display();
    }
}
