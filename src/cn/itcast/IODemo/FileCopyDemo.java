package cn.itcast.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("D:\\宁智商城-V2.0.zip");
            fos = new FileOutputStream("D:\\宁智商城-V2.3.zip");
            //字节输入流,读取一个字节，输出流写一个字节
            int len =0;
            while ( ( len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("file copy failed");
        }finally {
            try {
                if (fos!=null){
                    fos.close();
                }
            }catch ( IOException e){
                throw new RuntimeException("release resource fialed");
            }finally {
                try {
                    if (fis!=null){
                        fis.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            }
        }

}
