package cn.itcast.IOBuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  字符输出流缓冲区流
 *      java.io.BufferedWriter 继承Writer
 *      写入方法write() 可以写入单个字符，字符数组，字符串
 *
 *      构造方法:
 *          BufferedWriter(Writer w)传递任意字符输出流
 *          传递谁，就高效谁
 *              能传递的字符输出流:
 *                  FileWriter
 *                  OutputStreamWriter
 *       BufferedWriter 具有自己特有的方法
 *       void newLine() 写入时换行
 *       具有平台无关性
 *       Windows \r\n
 *       linux \n
 *
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流，封装文件
        FileWriter fw = new FileWriter("D:\\a.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write(100);
        bfw.newLine();
        bfw.flush();
        bfw.write("test文杰".toCharArray());
        bfw.newLine();
        bfw.flush();
        bfw.write("测试换行");
        bfw.newLine();
        bfw.flush();
        bfw.close();
        System.out.println();
    }
}
