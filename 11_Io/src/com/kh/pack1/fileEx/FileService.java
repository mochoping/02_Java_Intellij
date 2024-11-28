package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService {
    //method1 File 클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성
    public void method1(){
        //C:/Users/user1/Desktop>
        File 폴더 = new File("/newFolder");

        System.out.println("폴더 위치               : "+ 폴더.getPath());
        System.out.println("폴더 절대경로           : "+ 폴더.getAbsolutePath());
        // C:\newFolder
        System.out.println("폴더 이름               : "+ 폴더.getName());
        System.out.println("폴더가 존재하는지 확인  : "+ 폴더.exists());
        //폴더생성
        폴더.mkdir();

    }

    // 파일이 존재하는지 확인하고 존재하지 않으면 파일 생성
    public void method2(){
        File file = new File(System.getProperty("user.home")+"/Desktop/내파일.txt");

        if(file.exists()){
            System.out.println("이미 바탕화면에 존재하는 파일입니다.");
        } else {
            try { //폴더만들기와 다르게 파일 만들기는 문제가 생길 가능성이 높기 때문에,
                // try-catch 나 throw 같은 에러방지 구문 추가가 필요합니다.
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("파일을 생성하는데 문제가 발생했습니다.");
            }
            System.out.println("파일이 성공적으로 생성되었습니다.");
        }
    }
}
