package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {
    // 바탕화면 lunch.txt
    // 먹고 싶은 점심메뉴 리스트를 줄바꿈을 이용해서 작성하고
    // 파일이 이미 존재하면 알림과 동시에 프로그램 return으로 종료
    // main()메서드 작성
    // 작동을 위한 메인함수,
    // 경로 확인후 바탕화면에 파일생성
    // if로 파일존재확인, 이미존재시 리턴
    // 파일생성후 넣을 컨탠츠 지정, 쓰기기능 불러서 넣은후 종료
    // 파일생성, 글자넣기는 모두 각각 try-catch 로 감싸서 예외처리, 메세지출력
    public static void main(String[] args){
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home")+"/Desktop/lunch.txt");

        try {
            if(file.exists()){
                System.out.println("파일이 이미 존재합니다.");
                return;
            } else {
                file.createNewFile();
                System.out.println("파일 생성이 성공적으로 완료되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일 생성에 문제가 발생했습니다. 다시시도해 주세요."+e);
        }

        try {
            FileWriter fw = new FileWriter(file);
            String content = "춘천닭갈비, 버섯크림파스타, 야채새러드, 파래김자반, 도토리묵무침, 감자튀김, 폴드포크바베큐버거";
            fw.write(content);
            fw.close();
            System.out.println("내용 입력이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("내용 입력에 문제가 발생했습니다. 다시시도해 주세요."+e);
        } finally {
            System.out.println("작업을 종료합니다.");
        }

    }


}
