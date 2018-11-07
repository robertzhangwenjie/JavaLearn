package cn.itcast.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {
    //采用属组缓冲提高效率
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\宁智商城-V2.0.zip");
            fos = new FileOutputStream("D:\\宁智商城-V2.1.zip");
            //定义一个字节数组用来提高缓冲
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1){
                fos.write(b,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("file read failed");
        }finally {
            try {
                if (fis !=null) fis.close();
                if (fos !=null) fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                long e = System.currentTimeMillis();
                System.out.println(e-s);
            }
        }

    }
}
