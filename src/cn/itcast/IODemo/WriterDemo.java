package cn.itcast.IODemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  字符传输流
 *   java.io.Writer 所有字符输出流的超类
 *   写文件，写文本文件
 *
 *   写的方法write
 *      write(int c) 写一个字符
 *      write(char[] c) 写字符数组
 *      write(char[],int,int)字符数组一部分
 *      write(String s) 写入字符串
 *
 *     writer类的子类对象FileWriter
 *
 *     构造方法: 写入的数据目的
 *          File 类型对象
 *          String 文件名
 *
 *      字符输出流写入到数据的时候，必须要运行刷新功能
 *      flush()
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("D:\\a.txt",true);
        // 写1个字符
        char[] c = {'c','b'};
        fw.write(c);
        fw.write("sting");
        fw.write(100);
        fw.flush();

        //写入数组的一部分
        fw.write(c,1,1);
        fw.flush();


    }
}
