package cn.itcast.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        //定义两个流的对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\宁智商城-V2.1.zip");
            fos = new FileOutputStream("D:\\aaa.zip");
            //字节输入流，读取1个字节，输出流写入1个字节
            byte[] b = new byte[4096];
            int len = 0;
            while ((len = fis.read(b)) != -1){
                fos.write(b,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("file copy failed!");
        } finally {
            try {
                if (fos!=null) fos.close();

            }catch (IOException e){
                throw new RuntimeException("release asset failed");
            }finally {
                try {
                    if (fis!=null) fis.close();
                } catch (IOException e) {
                    throw new RuntimeException("release fis failed");
                }
            }
        }
    }
}
