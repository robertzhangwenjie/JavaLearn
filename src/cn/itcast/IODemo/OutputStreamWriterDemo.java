package cn.itcast.IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


/**
 * 转换流
 * java.io.OutputStreamWriter 继承Writer类
 * 就是一个字符输出流，写文本文件
 * write()字符，字符数组，字符串
*/
public class OutputStreamWriterDemo {
    public static void main(String args[]){
        System.out.println("robert");
    }
    /**
     *
     *
     */
    public static void writeGBK() throws FileNotFoundException {
        //创建字节输出流，绑定数据文件
        FileOutputStream fos = new FileOutputStream("D:\\gbk.txt");
        //创建转换流对象，构造方法，绑定字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos);

    }

}
