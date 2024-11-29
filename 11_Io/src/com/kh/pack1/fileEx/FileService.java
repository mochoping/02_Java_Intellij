package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileService {
    //method1 File 클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성
    public void method1(){
        //C:/Users/user1/Desktop>
        File 폴더 = new File("/newFolder");

        System.out.println("폴더 위치               : "+ 폴더.getPath());
        System.out.println("폴더 절대경로           : "+ 폴더.getAbsolutePath());
        // C:/newFolder
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

    // 특정위치 폴더에 있는 모든 파일과 폴더를 배열형태로 가져오기
    public void method3(){
        System.out.println("확인하고자 하는 폴더 경로 : "+ System.getProperty("user.home")+"/Downloads");
        // file 에서 C:/Users/user1/Downloads 위치까지 설정해준것 \를 /로 꼭 변환 특수문자규칙으로 인식될 가능성이 있음.
        File file = new File(System.getProperty("user.home")+"/Downloads");
        // 특정 폴더 위치에 있는 파일과 폴더들을 배열 형태로 가져올 것

        File[] files = file.listFiles(); // C:/Users/user1/Downloads 에 있는 것들 모두 목록형태로 가져오기

        //향상된 for문을 이용해서 출력
        for (File f : files) {// 향상된 for문을 사용하는 이유 = 기존 for문은 갯수새는데 시간이 오래 걸림.
            System.out.println("파일이름" + f.getName()); // 파일이름들 가져올 수 있음
            System.out.println("파일크기 : " + f.length() + " bytes");
            System.out.println("마지막 수정날짜 : " + f.lastModified());
            // 마지막 수정 날짜. 1732783364422 -> 1970년 1월 1일부터 지난일자
            // 마지막 수정 날짜를 사람들이 눈으로 확인하기 좋은 날짜 형식으로 변환
            // SimpleDateFormat 간단히 날짜 형식을 지정할 수 있는 객체

            long lastModified = f.lastModified();
            Date date = new Date(lastModified);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // 날짜형식을 문자열 형태로 변환
            String formatDate = sdf.format(date); // 1732783364422 -> sdf 형식으로 변경해서 문자열로 전달
            String formatDate2 = sdf.format(f.lastModified()); // 1732783364422 -> sdf 형식으로 변경해서 문자열로 전달/ f에 할당되어 있는 게 많아서
            //Cannot format given Object as a Date 파일의 마지막 수정 날짜를 최대한 큰 공간으로 가져온 뒤 Date로 변경하라는 것,
            //long으로 가져와서 변환 -> 날짜의 끝을 제대로 담으라는 의미
            System.out.println("사람이 읽기 편한 날짜 형식 변경 : " + date);
            System.out.println("사람이 읽기 편한 날짜 형식 변경 : " + formatDate);
            System.out.println("사람이 읽기 편한 날짜 형식 변경 : " + formatDate2);
        }




    }
}
