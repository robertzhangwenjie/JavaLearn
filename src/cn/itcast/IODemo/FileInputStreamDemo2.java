package cn.itcast.IODemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        //创建字节array
        byte[] b = new byte[10];
        int len = 0;
        while (( len = fis.read(b) ) != -1){
            System.out.print(new String(b,0,len));
        };
        int i = fis.read(b);
        for (byte j:b
             ) {
            System.out.println(j);
        }
        System.out.println(new String(b));
        System.out.println(i);
        fis.close();
        byte[] bytess = {'1','2','3','4','5'};
        System.out.println(new String(bytess));
    }
}
