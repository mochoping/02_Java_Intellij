package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {
        // hello.txt 만들고
        // 안녕하세요 Hello Hi
        // 작성 후 파일 닫고 프로그램 종료
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home") + "/Desktop/hello.txt");
        try {
            if (file.exists()) {
                System.out.println("파일이 이미 존재합니다.");
                return; // 파일이 이미 존재하고 덮어쓰기가 돼서
                //글이 작성되는것을 방지하기 위해 return으로 돌려보내기 추가
            } else {
                file.createNewFile();
                System.out.println("파일 생성 완료.");
            }
        } catch (IOException e) {
            System.out.println("파일생성중 문제가 발생했습니다" + e);
        }
        try{
            FileWriter fw = new FileWriter(file);
            String content = "작성하고싶은 내용을 작성해봅시다. \n 투명드래곤이 울부짖었따. 크아아아앙.";

            fw.write(content);
            fw.close();

            System.out.println("파일에 내용이 작성되었습니다.");

        }catch (IOException e){
            System.out.println("파일내부에 내용작성에 실패했습니다. 다시시도해주세요.");
        }finally {
            System.out.println("작업을 종료합니다.");
        }

    }
}
