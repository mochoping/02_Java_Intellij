package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre3 {
    /*
    메인
    바탕화면에 menu.txt
    파일이 존재한다면 이미 존재하는 파일입니다. 종료.
    없다면 생성

    FileWriter 만약에 파일이 존재할 경우를 대비하여
    이어쓰기 모드작성
    양식 한식 중식 일식 줄바꿈으로 작성
    생성


     */

    public static void main(String[] args) {
        String path =  System.getProperty("user.home");
        String fileName = "menu.txt";
        File file = new File(path + fileName);
        //다른방법으로 작성
        if (!file.exists()) { // 파일이 존재하지 않는게 맞다면,
            try{
                file.createNewFile();
                System.out.println("파일 만들기 성공했습니다. : " +fileName);
            } catch (IOException e) {
                System.out.println("파일 만들기에 실패했습니다. : " + e.getMessage());
                return;
            }
        } else {//파일이 이미 존재한다면
            System.out.println("이미 존재하는 파일입니다. : " +file.getAbsolutePath());
            return;
        }


        // System.getProperty("user.home");
       // File file = new File(System.getProperty("user.home")+"/Desktop/menu.txt");
       /* String path =  System.getProperty("user.home");
        String fileName = "menu.txt";
        File file = new File(path + fileName);
        try {
            if(file.exists()){
              System.out.println("이미 존재하는 파일입니다." +file.getAbsolutePath());
              return;
            } else {
                file.createNewFile();
                System.out.println("파일 생성을 완료했습니다." + fileName);
            }
        } catch (IOException e) {
            System.out.println("문제가 생겨 파일이 생성되지 않았습니다. 다시시도해주세요.");
        }*/
        try {
            FileWriter fw = new FileWriter(file, true);
            String content ="양식 \n한식 \n중식 \n일식";
            fw.write(content);
            fw.close();
            System.out.println("컨탠츠 작성 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("문제가 생겨 작성이 중단되었습니다.");
        } finally {
            System.out.println(fileName + "작성을 종료합니다.");
        }


    }
}
