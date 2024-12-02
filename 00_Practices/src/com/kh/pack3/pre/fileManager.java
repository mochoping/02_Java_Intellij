package com.kh.pack3.pre;

import java.io.*;

public class fileManager {
    /*
1. 파일 읽기 - Scanner로 파일을 읽습니다.
2. 파일 생성하기 - 파일이 없을 경우 파일을 생성합니다.
3. 파일 이어쓰기 - 파일에 내용을 추가합니다.
4. 종료 모드 - 사용자가 'exit'을 입력하면 프로그램 종료.
5. 파일이 이미 존재하는 경우 처리 - 동일한 이름의 파일이 이미 존재하면 출력하기
6. 종료 프로그램을 종료합니다 출력
     */

    public void createFile(String path, String createFileName) {
        System.getProperty("user.home");
        File file = new File(path + createFileName);
        try {
            if (file.exists()) {
                System.out.println("파일이 이미 존재합니다.");
                return;
            } else {
                file.createNewFile();
                System.out.println("파일 생성 완료.");
            }
        } catch (IOException e) {
            System.out.println("파일생성중 문제가 발생했습니다" + e);

        }
    }

    public void readFile(String path, String readFileName){
        String file = path + readFileName;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는데 문제가 발생했습니다.");
        } finally {
            System.out.println("파일 읽기를 종료합니다.");
        }
    }


    public void writeToFile(String path, String writeFileName){
        String file = path + writeFileName;
        try {
            FileWriter writer = new FileWriter(file, true);

            String content = "\n 알로 알로";
            writer.write(content);
            writer.close();
            System.out.println("파일 이어서 작성하기를 완료했습니다.");
        } catch (IOException e) {
            System.out.println("파일을 작성하는데 문제가 발생했습니다.");
        } finally {
            System.out.println("작성을 종료합니다.");
        }

    }
}
