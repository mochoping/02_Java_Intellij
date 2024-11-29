package com.kh.pack2.pre;

import java.io.FileWriter;

public class FileWriterRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home")+ "/Desktop/";
        String fileName = "food.txt";
        FileWriterPre5 fw5 = new FileWriterPre5();

        //파일 생성 기능
        //파일생성기능(pathm filename);
        fw5.writeFile(path, fileName);// 기능을 가져와서 경로 파일명 호출



    }
}
