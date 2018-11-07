package cn.itcast.IODemo;

import java.io.FileReader;
import java.io.IOException;

/**
 *  字符输入流读取文本文件,所有字符出入流的超类
 *  java.io.Reader
 *  专门读取文本文件
 *
 *  读取的方法:read()
 *  read() 读取1个字符
 *  read(char[] c)  读取字符数组
 *
 *  Reader类是抽象类，找到子类对象  FileReader
 *
 *  构造方法: 绑定数据源
 *      参数:
 *          File 类型对象
 *          String 文件名
 *
 *
 *
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\a.txt");
        int len = 0;
//        while ((len = fr.read()) != -1 ) {
//            System.out.println((char)len);
//
//        }
        //缓冲读取，
        char[] c = new char[1024];
        while ((len = fr.read(c)) != -1){
            System.out.println((new String(c,2,len)));
        }
        fr.close();
    }
}
