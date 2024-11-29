package com.kh.pack2.pre2;

import java.io.*;
import java.util.Scanner;

public class FileWritePre {
    /**
     * createTxt(path, fileName)
     * @param path
     * @param fileName
     */
    public void createTxt(String path, String fileName/*path, fileName*/){
        File file = new File(path, fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("다음 파일을 생성했습니다. " +fileName);
            } catch (IOException e) {
                System.out.println(fileName + "파일 생성을 실패했습니다. " + e.getMessage());
                return;
            }
        } else {
            System.out.println("파일이 이미 존재합니다. : " + fileName);
            return;

        }
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter(file,true);
            System.out.print("작성하실 내용을 입력해 주세요 . : ");
            String input = sc.nextLine();
            fw.write(input);
            fw.close();

        } catch (IOException e){
            System.out.println("File could not be created : " + fileName);

        } finally {
            sc.close();
            System.out.println("File Writtne : " + fileName);
        }

    }
    /**
     * writeTxt(String path, String fileName)
     * @param path
     * @param fileName
     */
    public void writeTxt(String path, String fileName){
        File file = new File(path, fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("다음 파일을 생성했습니다. " +fileName);
            } catch (IOException e) {
                System.out.println(fileName + "파일 생성을 실패했습니다. " + e.getMessage());
                return;
            }
        } else {
            System.out.println("파일이 이미 존재합니다. : " + fileName);
            return;

        }
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter(file,true);
            System.out.print("이름(성함)을 작성해주세요 : ");
            String inputName = sc.nextLine();
            System.out.print("연락처 작성해주세요 : ");
            String inputNumber = sc.nextLine();
            String input = inputName + " : " + inputNumber;
            System.out.println("작성해주신 성함과 연락처는 다음과 같습니다. : " +input);
            fw.write(input);
            fw.close();

        } catch (IOException e){
            System.out.println("File could not be created : " + fileName);

        } finally {
            sc.close();
            System.out.println("File Writtne : " + fileName);
        }


    }

    //만들어진 파일을 읽기
    //FileReader   : 파일로부터 문자를 읽어들이는 클래스    -> 한글자씩 읽음
    //BufferedReader : FileReader 버퍼링 기능 추가한 클래스 -> 줄단위로 읽음
    //                   줄 단위로 데이터를 읽을 수 있어 빠르고 성능 좋음
    public void method3(){
        String path = System.getProperty("user.home") + "/Desktop/ex1.txt";
        try{
            FileReader file = new FileReader(System.getProperty("user.home") + "/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file);
            String line ; // 한줄씩 읽어노는 readline()기능 설정
            //반복문을 이용해서 읽는것이 끝날때 까지 계속 반복
            while ((line = br.readLine()) != null){ //null 더이상 읽을게 없을 때 까지
                System.out.println(line);
            }
            br.close(); //한줄씩 종료
            file.close(); // 한글자씩 가져오는 객체 종료
            /*FileReader 가 느려서 BufferedReader 가 보조해주는중이기 때문에.
            *
            * */
        } catch (IOException e) {
            System.out.println("File could not be created : " + path);
        }




    }

    public  void method4(){
        String path = System.getProperty("user.home") + "/Desktop/ex1.txt";
        try{
            FileReader file = new FileReader(System.getProperty("user.home") + "/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file);
            String line ;//= br.readLine();// 문장이 값을 보관하고 있기 때문에 무한루프가 돔. / 글자를 담고 출력할 공간 생성
            while ((line = br.readLine()) != null){// while문 안에는 자료형을 넣지 못함. 바구니를 미리 만들고 한줄읽고 넣고 반복. 줄이 바뀌는 효과
                System.out.println(line);
            }
            br.close();
            file.close();
        } catch (IOException e) {
            System.out.println("File could not be created : " + path);
        }
    }
}
