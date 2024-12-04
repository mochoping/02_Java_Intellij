package com.kh.pre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaPre {
    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("배열을 입력해주세요. : ");

        int[] arr = {1, 2, 3, 4, 5,};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                total += arr[i];
            }
        }
        System.out.println(total);
    }

    /* for (String name : names) {
                if (name.startsWith("A")) {
                       System.out.print(name + " ");
                }
      }
    */
    public void method2() {
        ArrayList<String> list = new ArrayList();
        list.add("Alice");
        list.add("Bob");
        list.add("Andrew");
        list.add("Eve");
        /*
        String 참조 자료형에 들어있는 기능
        맨앞 변수명으로는 boolean을 쓸 수 있음
        startwith(String perfix) = prefix 시작하는 글자가 있는지 확인
        예제) boolean startWord = String으로들어있는변수명.startWith("시작하는단어글자")
        endwith(String suffix) = suffix 로 끝나는 글자가 있는지 확인
        예제) boolean endWord = String으로들어있는변수명.endWith("끝나는단어글자")
         */
        System.out.println("A로 시작하는 이름은");
        for (String name : list) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }


        }


    }
    public void method3() {
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        try{
            int c = a / b;

        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }

    public void method5() {
        String path = System.getProperty("user.home")+"/Desktop/";
        String readFile = "numbers.txt";

        File file = new File(path+readFile);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            int sum = 0;
            String line;
            while((line = br.readLine())!=null){
                sum += Integer.parseInt(line); // window zjavbxjd
            }
        }catch (Exception e){
            System.out.println("에상치 못한 문제로 파일을 읽을 수 없습니다. "+ e);
        }
        //숫자를 다 더해주는 기능
        try(FileWriter fw = new FileWriter(path +"results.txt")){
            String total ="";
            fw.write(total);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}