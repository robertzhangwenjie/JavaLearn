package cn.itcast;


import java.util.Map;
import java.util.Properties;

/**
 *  集合对象Properties类，继承Hashtable,线程安全，实现了Map接口
 *  特性:可以和IO对象结合使用，实现数据的持久存储
 *
 *
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        function();
    }
    /**
     *  使用Properties集合，存储键值对
     *  setProperty等同于Map接口中的Put
     *  setProperty(String key,String value)
     *  通过key获取值，getProperty(String key)
     */
    public static void function(){
        Properties prop = new Properties();
        prop.setProperty("a","1");
        prop.setProperty("b","2");
        prop.setProperty("c","3");
        prop.setProperty("d","4");
        System.out.println(prop);

        String value = prop.getProperty("a");
        System.out.println(value);
        for (Map.Entry<Object, Object> entry : prop.entrySet()
             ) {
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        for (Object key:prop.keySet()
             ) {
            System.out.println("key="+key);
        }
        for (Object v :prop.values()
             ) {
            System.out.println("value="+v);
        }
    }


}
