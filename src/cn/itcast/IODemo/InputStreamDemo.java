package cn.itcast.IODemo;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        //FileInputStream 构造方法可以为File对象或者pathname
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        int len = 0;
        //read访问返回一个int范围为(-1,255)，当读取到-1时代表文件已经读取完毕
        //read方法没执行一次后指针都会指向下一个字节，因此不能使用
        //while (fis.read != -1)
        while( (len = fis.read()) !=-1){
            System.out.print((char)len);

        }
        //每一个FileStream在最后都要关闭
        fis.close();
    }
}

