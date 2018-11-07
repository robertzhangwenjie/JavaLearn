package cn.itcast.IOConvert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  转换流
 *      java.io.InputStreamReader 继承 Reader
 *      字符出入流，读取文本文件
 *
 *      将字节流转字符流
 *
 *      读取的方法:
 *          Read() 读取1个字符，读取字符数组
 *
 *      技巧:
 *          OutputStreamWriter写文件
 *          InputStreamReader读取文件
 *       OutputStreamWriter(OutputStream out)
 *       InputStreamReader(InputStream in) 接收所有的字节输入流
 *       InputStreamReader(InputStream in,String charsetName) 传递编码表的名字
 *
 *
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException{
        reader();
    }
    private static void reader() throws IOException {
        //创建字节输入流，传递一个文本文件
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        int len = 0;
        char[] b = new char[1024];
        while ((len = isr.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }
        isr.close();

    }
}
