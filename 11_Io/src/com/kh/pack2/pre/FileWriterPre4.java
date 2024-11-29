package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {
    public static void main(String[] args) {
        String filename = "menu.txt";
        String path = System.getProperty("user.home") + "/Desktop/";
        File file = new File(path + filename);
        try{
        if (file.exists()) {
            FileWriter fw = new FileWriter(file, true);
            String content= "떡복이 ,\n 순대 ,\n 마라탕";
            fw.write(content);
            fw.close();
            System.out.println("이어쓰기에 성공했습니다.");
        } else {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            String content= "떡복이 ,\n 순대 ,\n 마라탕";
            fw.write(content);
            fw.close();
            System.out.println("파일생성후 컨텐츠작성에 성공했습니다.");
        }
        } catch (IOException e) {
            System.out.println("작성에 문제가 발생했습니다.");
        } finally {
            System.out.println(filename+ "작성을 종료합니다.");
        }







    }
}
