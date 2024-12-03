package com.kh.pre;

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

    public void method2() {

    }



}
