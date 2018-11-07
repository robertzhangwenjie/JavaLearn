package cn.itcast.IOBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  字符输入流缓冲流
 *      java.io.BufferedReader 集成Reader
 *      读取功能reade() 读取单个字符，字符数组
 *      构造方法:
 *          BufferedReader(Reader r)
 *          可以读取的字符输入流:
 *              FileReader
 *              InputStreamReader
 *
 *        BufferedReader 自己特有的功能
 *        String readLine() 读取文本行 根据\r\n来判断
 *        如果读取到流的末尾，会返回null
 *
 *
 */
public class BufferedReaderDemo{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\a.txt");
        BufferedReader br = new BufferedReader(fr);
//        System.out.println(br.lines());
        String s = null;
        while ((s = br.readLine()) !=  null) {
            System.out.println(s);
        }
        br.close();
    }
}
