package cn.itcast.IOBuffer;

import java.io.File;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        Copy.copy_1(new File("D:\\aaa.zip"),new File("D:\\bbb.zip"));
    }
}
