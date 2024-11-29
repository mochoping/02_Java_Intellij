package com.kh.pack2.pre3;

import java.io.FileReader;

public class FileReaderPreRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName ="happylunch.txt";

        FileReaderPre frp = new FileReaderPre();

        System.out.println("["+ fileName +"] 읽기모드를 시작합니다.");
        frp.readTxt(path,fileName);
    }
}
