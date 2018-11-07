package cn.itcast.IOBuffer;

import java.io.*;

/**
 *  文件复制方式
 *      1.字节流读写单个字节
 *      2.字节流读写字节数组
 *      3.字节流缓冲区流读写单个字节
 *      4.字节流缓冲区流读写字节数组
 *
 *
 *
 */
public class Copy {
    public static void main(String[] args) throws IOException{
        long s = System.currentTimeMillis();
        copy_1(new File("D:\\aaa.zip"),new File("D:\\bbb.zip"));
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
    /**
     *  3.字节流缓冲流读写单个字节 200ms
     */
    static void copy_3(File src,File desc) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        while ((len = bis.read()) !=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }
    /**
     *  2.字节流缓冲流读写数组 30ms
     */
    static void copy_2(File src,File desc) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) !=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
    /**
     *  方法，实现文件复制
     *      1.字节流读写单个字节 100ms
     */
    static  void copy_1(File src, File desc) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
            fos.flush();
        }
        fos.close();
        fis.close();
    }
}
