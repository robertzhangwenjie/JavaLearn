package cn.itcast.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO stream error handle
 *
 */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) {
        /* need to declare var fos */
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\a.txt");
            fos.write(100);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("file write out failed,please retry");
        } finally {
            try {
                if (fos !=null)
                fos.close();
            } catch (IOException e) {
//                e.printStackTrace();
                throw new RuntimeException("file write out failed,please retry");
            }
        }

    }
}
