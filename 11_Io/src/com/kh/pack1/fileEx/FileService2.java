package com.kh.pack1.fileEx;

public class FileService2 {

    //1. System.getProperty() 알아보기
    public void method1(){
        /*
        System.getProperty() 자바에서 현재 실행중인 특정 시스템의 속성 정보를 가져오는데 사용하는 기능
        시스템에 대한 환경 정보나 설정값을 얻는데 유용

        변수 이름으로 값을 담길 원한다면 변수명 맨 앞에 자료형으로 String사용!
        String 변수명 = System.getProperty("String 키");

        키 종류                    키에 해당하는 값
        java.version               java version 확인
        java.home                  java 가 설치된 경로
        os.name                    windows / liunex / macOs 확인 가능
        user.name                  현재 컴퓨터를 사용하는 사용자 이름
        user.home                  현재 사용자 홈 폴더 경로
        user.dir                   현재 작업하고 있는 폴더

        위와 같은 내용을 확인하기 위해서는 별도의 명령어를 통해 출력 가능
        System.out.println()
         */



        String a = System.getProperty("user.home");
        // 유저 홈에 대한 정보를 가져오기만 한 상태
        System.out.println(System.getProperty("user.home"));

        // 운영체제 정보 출력
        String osConfig = System.getProperty("os.name");
        System.out.println(osConfig);
        // 사용자 정보
        String userInfo = System.getProperty("user.name");
        System.out.println(userInfo);


    }
}
