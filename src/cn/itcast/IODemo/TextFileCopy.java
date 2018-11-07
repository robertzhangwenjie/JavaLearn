package cn.itcast.IODemo;

import jdk.nashorn.internal.ir.TryNode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  字符流复制文本文件，必须文本文件
 *  字符流查询本机默认的编码表，简体中文GBK
 *  FileReader读取数据源
 *  FileWriter写入到数据目的
 *
 *
 */
public class TextFileCopy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("D:\\a.txt");
            fw = new FileWriter("D:\\aaaaa.txt");
            //一个char占用两个字节，因此申请1024时相当于一次性读写2kb
            char[] cbuf = new char[1024];
            int len = 0;
            while ((len = fr.read(cbuf)) !=-1) {
                fw.write(cbuf,0,len);
                fw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("copy failed");

        }finally {
            try {
                if (fr != null) fr.close();
            }catch (IOException e){
                e.printStackTrace();
                throw new RuntimeException("释放资源失败");
            }finally {
                try {
                    if (fw != null) fw.close();
                } catch (IOException e){
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
