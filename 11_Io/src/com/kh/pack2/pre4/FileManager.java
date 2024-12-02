package com.kh.pack2.pre4;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    String path;

    /**
     * 파일을 생성하는 기능
     *
     * @param path           파일경로
     * @param createFileName 만들고자 하는 파일 이름
     */
    public void createFile(String path, String createFileName) {
        File file = new File(path, createFileName);
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


    /**
     * 파일을 읽는 기능
     *
     * @param path         파일 경로
     * @param readFileName 파일을 읽는 기능
     */

    public void readFile(String path, String readFileName) {
        File file = new File(path, readFileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다." + " 다른파일을 선택하시거나 파일명칭을 재대로 입력했는지 확인하세요.: " + file.getAbsolutePath());
            return;   // 기능종료

        } else {

            try (FileReader fr = new FileReader(file);
                 BufferedReader br = new BufferedReader(fr);) {


                String line;
                System.out.println("파일내용 : ");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("읽기가 종료되었습니다.");
            }

        }
    }


    /**
     * 파일에 내용 이어쓰는 기능
     *
     * @param path          파일경로
     * @param writeFileName 쓰기를 할 파일 이름
     */
    public void writeToFile(String path, String writeFileName) {
        File file = new File(path, writeFileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다." + " 다른파일을 선택하시거나 파일명칭을 재대로 입력했는지 확인하세요.: " + file.getAbsolutePath());
            return;   // 기능종료


        }
        try (FileWriter fw = new FileWriter(file, true);
             Scanner sc = new Scanner(System.in);) { // 이 경우에는 close가 필요없음. try에서 알아서 종료를 진행하기 때문.
             // 파일에 작성할 글을 위해 스캐너 사용
            System.out.println("파일에 작성할 내용을 입력해주세요.: ");
            System.out.println("작성하기를 원하지 않는다면 'exit' 입력 ");
            System.out.print("파일 내용 : ");

            while (true) {
                String input = sc.nextLine();
            /*switch (input) {
                case "exit":
                    break;
                default:
                    fw.write("\n" + input);
            }*/

                if (input.equalsIgnoreCase("exit")) {//대소문자 상관없이
                    System.out.println("글 작성을 완료했습니다.");
                    return;
                }
                fw.write("\n" + input);

            }


            // fw.close();
            /*
            try()안에 close가 필요한 객채를 작성한다면 close 기능을 추가적으로 작성하지 않아도 됨. try자체적으로 종료를 진행하기 때문.
             */
        } catch (IOException e) {
            System.out.println("파일에 글을 이어서 작성하던 도중 문제가 발생했습니다. : " + e.getMessage());
        } finally {
            System.out.println("파일에 이어서 글 작성하기 모드를 종료합니다. ");
        }
    }
}
