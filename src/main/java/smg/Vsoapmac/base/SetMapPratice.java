package smg.Vsoapmac.base;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SetMapPratice {

    /* Map */
    private static Map map;
    private static HashMap hashMap;
    private static LinkedHashMap linkedHashMap;
    private static TreeMap treeMap;
    private static ConcurrentHashMap concurrentHashMap;

    /* Set */
    private static Set set;
    private static HashSet hashSet;
    private static LinkedHashSet linkedHashSet;
    private static TreeSet treeSet;

    /**
     * 不包含重复元素的集合。
     * 更正式地，集合不包含一对元素e1和e2 ，使得e1.equals(e2) ，并且最多一个空元素。
     */
    public static void setRPA(){
        /**
         * 此类实现Set接口，由哈希表（实际为HashMap实例）支持。
         * 对集合的迭代次序不作任何保证;
         * 这个类允许null元素。
         */
        hashSet = new HashSet();
        hashSet.add("hashSet");
        System.out.println(hashSet.contains("hashSet"));

        /**
         * 哈希表和链表实现了Set接口，具有可预测的迭代次序。
         * 这种实现不同于HashSet，它维持于所有条目的运行双向链表。
         * 该链表定义了迭代排序，它是将元素插入集合（插入顺序）的顺序。
         *
         * 请注意，此实现不同步。
         */
        linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("linkedHashSet");
        System.out.println(linkedHashSet.contains("linkedHashSet"));

        /**
         * A NavigableSet实现基于TreeMap。的元件使用其有序natural ordering
         * 或由Comparator集合创建时提供，这取决于所使用的构造方法。
         *
         * 请注意，此实现不同步。
         */
        treeSet = new TreeSet();
        treeSet.add("treeSet");
        System.out.println(linkedHashSet.contains("treeSet"));
    }
    /**
     *  将键映射到值的对象。 地图不能包含重复的键; 每个键可以映射到最多一个值。
     */
    public static void mapPRA(){
        /**
         * 基于哈希表的实现的Map接口。 此实现提供了所有可选的地图操作，并允许null的值和null键。
         *
         * HashMap类大致相当于Hashtable ，除了它是不同步的，并允许null）。这个类不能保证地图的顺序;
         * 特别是，它不能保证订单在一段时间内保持不变。
         */
        hashMap = new HashMap();
        hashMap.put("string" , "hashMap");
        System.out.println(hashMap.get("string"));

        /**
         * 哈希表和链表实现的Map接口，具有可预测的迭代次序。
         * 这种实现不同于HashMap，它维持于所有条目的运行双向链表。
         * 此链接列表定义迭代排序，通常是将键插入到地图（插入顺序）中的顺序 。
         */
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("string" , "linkedHashMap");
        System.out.println(linkedHashMap.get("string"));

        /**
         * 一个红黑树基于NavigableMap实现。
         *
         * 请注意，如果这个排序的映射要正确地实现Map接口，那么由树映射维护的排序（如任何排序的映射）
         * 以及是否提供显式比较器都必须与equals Map一致。
         *
         * 请注意，此实现不同步。 如果多个线程同时访问映射，并且至少一个线程在结构上修改映射，则必须在外部进行同步。
         */
        treeMap = new TreeMap();
        treeMap.put("string" , "treeMap");
        System.out.println(treeMap.get("string"));

        /**
         * 支持检索的完全并发性和更新的高预期并发性的哈希表。
         * 不过，尽管所有操作都是线程安全的，检索操作并不意味着锁定，并没有为防止所有访问的方式锁定整个表的任何支持。
         *
         * ConcurrentHashMaps支持一组顺序和并行批量操作，
         * 与大多数Stream方法不同，它们被设计为安全并且经常明智地应用，即使是由其他线程同时更新的映射;
         *
         * 有三种操作，每种具有四种形式，接受键，值，条目和（键，值）参数和/或返回值的函数。
         */
        concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("string" , "concurrentHashMap");
        System.out.println(concurrentHashMap.get("string"));
    }

    public static void main(String[] args){
        mapPRA();
        System.out.println("分割线" + "--------------------");
        setRPA();
    }
}
