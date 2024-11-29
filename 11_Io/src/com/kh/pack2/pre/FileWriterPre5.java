package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPre5 {

    /*
    * createfile(String 경로, String 파일이름)
    * 파일 생성 기능
    *
    * @param path 파일 경로// 파라미터 줄임말
    * @param fileName 파일이름
    * @return 파일 생성을 실패했을 경우 사용
    * */

    public void createFile(String path, String fileName){
        File file = new File(path+fileName);
        if(!file.exists()){
            System.out.println("File already exists : " + fileName);
            return;
        } else {
            try {
                file.createNewFile();
                System.out.println("File created : " + fileName);
            } catch (IOException e) {
                System.out.println("File could not be created : " + fileName);
                return;
            }

        }

    }

    public void writeFile(String path, String fileName){
        File file = new File(path+fileName);

        if(file.exists()){
            System.out.println("File already exists : " + fileName);
            return;
        } else {
            try {
            file.createNewFile();
            System.out.println("File created : " + fileName);
            } catch (IOException e) {
            System.out.println("File could not be created : " + fileName);
            return;
        }

        }
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(file, true);
            System.out.println("작성할 내용을 입력해주세요");
            String input = sc.nextLine();
            fw.write(input);
            fw.close();
        } catch (IOException e) {
            System.out.println("File could not be created : " + fileName);
        } finally {
            sc.close();
            System.out.println("File Writtne : " + fileName);
        }


    }


}
