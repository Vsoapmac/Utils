package smg.Vsoapmac.base;

public class StringPratice {
    private static String string;
    private static StringBuffer stringBuffer = new StringBuffer();
    private static StringBuilder stringBuilder = new StringBuilder();

    /**
     * StringBuffer是线程安全、可变的字符序列。
     *
     * StringBuilder是一个可变的字符序列。此类提供与StringBuffer的API，但不保证同步。
     * 此类设计用作简易替换为StringBuffer在正在使用由单个线程字符串缓冲区的地方（如通常是这种情况）。
     * 在可能的情况下，建议使用这个类别优先于StringBuffer ，因为它在大多数实现中将更快。
     */

    public static String StringBufferPRA() {
        stringBuffer.append('V');//添加一个int,byte等类型
        String str = stringBuffer.toString();
        return str;
    }

    /**
     * 比较
     */
    public static void intstringequels(){
        int ii = 1;
        int ji = 2;
        System.out.println(ii == ji);

        System.out.println("分割线" + "---------------------------------");
        String is = "1";
        String js = "1";
        System.out.println("==" + is == js);
        System.out.println(".equels" + "  " + is.equals(js));
        System.out.println("hashCode" + "  " + (is.hashCode() == js.hashCode()));

        System.out.println("分割线" + "---------------------------------");
        String i = new String("1");
        System.out.println("==" + is == i);
        System.out.println(".equels" + "  " + is.equals(i));
        System.out.println("hashCode" + "  " + (is.hashCode() == i.hashCode()));

        System.out.println("分割线" + "---------------------------------");
        String j = new String("1");
        System.out.println("==" + j == i);
        System.out.println(".equels" + "  " + j.equals(i));
        System.out.println("hashCode" + "  " + (j.hashCode() == i.hashCode()));
    }

    public static void main(String[] args) {
        String str = StringPratice.StringBufferPRA();
        System.out.println(str);
        StringPratice.intstringequels();
    }
}
