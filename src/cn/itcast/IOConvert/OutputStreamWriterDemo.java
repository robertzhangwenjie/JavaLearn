package cn.itcast.IOConvert;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *  转换流
 *      Java.io.OutputStreamWriter 继承Writer类
 *      就是一个字符输出流，写文本文件
 *      write()字符，字符数组，字符串
 *
 *      字符流通向字节流的桥梁，可以将字符流转换成字节流
 *
 *      OutputStreamWriter 使用方式
 *      构造方法:
 *          OutputStreamWriter(OuputStream out)接收所有的字节输出流
 *          但是: 字节输出流: FileOutputStream
 *          OutputStreamWriter(OutputStream out,String charsetName)
 *          String charsetName 传递编码表名字GBK UTF-8
 *
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException{
        writeGBK();
    }

    /**
     * 使用转换流对象OutputStreamWriter写文本
     * 文本采用GBK的形式写入
     *
     */
     private static void writeGBK() throws IOException {
        //创建字节流输出流，绑定数据文件
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");

        //创建转换流对象，构造方法，绑定字节输出流,使用GBK编码表
         // 使用GBK时，一个汉字占用两个字节，使用UTF-8时，一个汉字占用3个字节
         // 一个字符占用一个字节
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        //使用转换流写数据
        osw.write("文杰");
        osw.flush();
        osw.close();


    }
}
