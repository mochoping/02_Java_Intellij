package com.kh.pre;

import java.io.*;
import java.util.Scanner;

public class toDoList {

    public void readList(String filepath) {
        File file = new File(filepath);
        if (!file.exists()){
            try{
            file.createNewFile();
            System.out.println(filepath + "생성이 완료되었습니다.");
        } catch (IOException e) {
                System.out.println("파일 생성중 문제가 발생했습니다. : "+e);
            }
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("파일을 불러오는중 문제가 발생했습니다. : "+e);
        }
    }

    public void writeList(String filepath){
        File file = new File(filepath);
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(filepath + "생성이 완료되었습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성중 문제가 발생했습니다. : "+e);
            }
        }
        try (FileWriter fw = new FileWriter(file, true);
             Scanner sc = new Scanner(file);){
            System.out.println("파일에 작성하실 내용을 입력해주세요.");
            System.out.println("종료를 원하실경우 'exit' 를 입력해주세요");
            while(true) {
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("exit")) {
                    System.out.println("글쓰기가 종료되었습니다.");
                    break;
                }
                fw.write(input+"\r\n");
                System.out.println(input + " 입력되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일을 작성하는중 문제가 발생했습니다. : "+e);
        }



    }


}
