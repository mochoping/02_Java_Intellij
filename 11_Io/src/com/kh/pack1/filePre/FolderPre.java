package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre {

    // method1 :바탕화면에 profile img 라는 폴더가 존재하는지 확인하고
    // 없을경우 폴더생성, 존재하면 메세지 출력. "이미 존재하는 폴더입니다."
    public void method1 (){

        File folder = new File("C:/Users/user1/Desktop/profile img");

        if(folder.exists()) {
            System.out.println( "이미 존재하는 폴더입니다.");

        } else {
            folder.mkdir();
            System.out.println("profile img 폴더 생성 완료");
        }

    }

    // 바탕화면에 newFile.txt 생성
    public void method2(){
        File file = new File("C:/Users/user1/Desktop/newFile.txt");
        if(file.exists()) {
            System.out.println("이미 존재하는 파일입니다.");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("파일생성에 문제가 발생했습니다.");
            }
            System.out.println("파일 생성이 완료되었습니다.");
        }
    }

}
