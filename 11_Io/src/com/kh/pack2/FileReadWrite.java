package com.kh.pack2;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    // 파일을 바탕화면에 만들고 파일안에 가사를 작성하기
    public void method1(){
        System.getProperty("user.home"); // +/바탕화면

        File file = new File(System.getProperty("user.home")+"/Desktop/ex1.txt");
        // 기존에는 creatNewFile()생성

        try{
            if(file.exists()){
                System.out.println("파일이 존재합니다.");
            } else {
                file.createNewFile();
                System.out.println("파일 생성 완료.");
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }

        //생성된 파일 글자를 작성하기
        // 글자를 작성할때 BufferedWriter Filewriter를 사용해서 작성
        try {// 파일안 글자생성은 오류가 많아 try 구문작성이 권장됨
            FileWriter writer = new FileWriter(file); //
            String content = "안녕하세요. 반갑습니다. 환영해요";

            writer.write(content);// 파일쓰기 기능으로 파일안에 글자를 쓸 기능 호출() 안에 내용넣기. 넣은내용을 저장시키는 추가작업 필요
            writer.close(); // 파일에 글자를 작성후 저장을 위해 닫기가 필요
            System.out.println("파일에 내용이 작성되었습니다.");

        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다. 다시시도해주세요.");
        } finally {
            System.out.println("글쓰기 작업을 종료합니다.");
        }
    }

    // 만들어진 파일에 이어서 글자 작성하기 (Feat. FileWriter)
    // true 를 작성하지 않으면 기본적으로 false 상태로 파일이 존재할 경우 덮어쓰기 진행
    // FileWriter fw = new FileWriter("파일명, true)  ture 파일 이어쓰기 모드 활성화
    public void method2(){
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home") + "/Desktop/hello.txt");

        try {
            FileWriter writer = new FileWriter(file, true);// 파일이 존재할 경우 이어쓰기 모드

            String content2 = "\n 알로 알로"; // 새로운 내용 추가
            writer.write(content2);
            writer.close();
            System.out.println("파일 이어서 작성하기를 완료했습니다.");
        } catch (IOException e) {
            System.out.println("문제가 생겨 작성이 진행되지 못했습니다.");
        } finally {
            System.out.println("작성을 종료합니다.");
        }



    }
}
