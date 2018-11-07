package cn.itcast.IOBuffer;

import java.io.*;

/**
 *  使用缓冲区流对象，复制文本文件
 *  数据源BufferedReader + FileReader 读取
 *  数据目的BufferedWriter + FileWriter 写入
 *  读取问本行，读取一行，写入一行，写时换行
 *
 *
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\a.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("D:\\atest.txt"));
        String line = null;
        while ((line = bfr.readLine()) != null){
            bfw.write(line);
            bfw.newLine();
            bfw.flush();
        }
        bfw.close();
        bfr.close();
    }
}
