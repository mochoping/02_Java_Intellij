package com.kh.CollectionEX.pack3.mapEX;

import java.util.HashMap;
import java.util.Scanner;

public class SubwayService {

    public void method2() {
        HashMap<String, Integer> menu = new HashMap();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the subway: ");
        String menuName = sc.nextLine();
        System.out.println(" 샌드위치 이름에 대한 가격 : ");
        int menuPrice = sc.nextInt();
        sc.nextLine();

        menu.put(menuName, menuPrice);


    }
}
