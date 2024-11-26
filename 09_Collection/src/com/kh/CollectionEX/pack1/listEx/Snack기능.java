package com.kh.CollectionEX.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {

    //과자추가하기
    public void addSnack(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과자이름을 입력해주세요 : ");
        String snackName = sc.nextLine();

        System.out.print("Enter the price of the snack: ");
        double snackPrice = sc.nextDouble();

        System.out.print("Enter the quantity: ");
        int snackQuantity = sc.nextInt();

        sc.nextLine();
        sc.close();
        //정보 저장을 위한 클래스 소환
        Snack snack1 = new Snack(snackName, snackPrice, snackQuantity);
        Snack snack2 = new Snack("오맛나과자", 5000, 3);
        Snack snack3 = new Snack("양파맛나과자", 8000, 5);

        //배열리스트소환
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(snack1);
        snacks.add(snack2);
        snacks.add(snack3);
        System.out.println(" ***** 과자 목록 리스트 출력 *****");
        for (int i = 0; i < snacks.size(); i++) {
            System.out.println(snacks.get(i).toString());
        }
        /*for (Snack snack : snacks) {
            System.out.println(snack);
        }*/


    }
}
