package com.kh.pack2.pre4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTrue {
    String extend = ".txt";
    public void writeTxt() {
        String path = System.getProperty("user.home") + "/Desktop/";
        Scanner scanner = new Scanner(System.in);
        System.out.print("내용을 이어서 작성할 파일명을 입력하세요");
        String fileName = scanner.nextLine();
        //파일이 존재하지 않으면, 알림
        // 생성을 위해서는 yes 입력
        //생성하기를 원치 않는다면 no 혹은 아무글자나 입력하세요.

        File file = new File(path + fileName + extend);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            System.out.println(fileName + "파일을 생성하시겠습니까? Yes = 생성 , No = 생성 안함 ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Yes")) {
                try {
                    file.createNewFile();
                    System.out.println(fileName + "파일이 생성 완료되었습니다." +file.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println("파일생성에 문제가 발생했습니다. : " + e.getMessage());
                }
            } else {
                System.out.println("파일 생성을 종료합니다.");
                return;
            }

            // 파일 생성이 되었다면 글을 작성할 수 있게
            /* try() 안에 1가지 코드만 작성할 경우 ;생략 가능*/
            try (FileWriter fw = new FileWriter(file, true);
                 Scanner sc = new Scanner(System.in);) {
                System.out.println("파일에 작성하실 내용을 입력해주세요.");
                System.out.println("종료를 원하실경우 'exit' 를 입력해주세요");
                while (true) {
                    String inputtext = sc.nextLine();
                    if (inputtext.equalsIgnoreCase("exit")) {
                        System.out.println("글 작성을 종료합니다.");
                        return;
                    }
                    fw.write(inputtext+"\r\n");//\r 키보드 커서를 현재 줄의 맨 앞으로 이동시키는 역활
                    // \naver와 같은 상황이 발생할 경우를 방지하기 위해 커서를 기본적으로 맨 앞으로 보냄
                    // 윈도우 컴퓨터에서는  사용자들이 글을 작성하며 줄바꿈을 할때 마다 \r\n 함께 이용중
                    System.out.println(inputtext + " 내용이 추가되었습니다!");

                }

            } catch (IOException e) {
                System.out.println("파일에 글을 이어서 작성하던 도중 문제가 발생했습니다. : " + e.getMessage());
            } finally {
                System.out.println("파일에 이어서 글 작성하기 모드를 종료합니다. ");
            }

        }
    }
}
