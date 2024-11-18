package com.variable.practice;

//import java.util.Scanner;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


                int iNum1 = 10;
                int iNum2 = 4;
                float fNum = 3.0f;
                double dNum = 2.5;
                char ch = 'A';


                System.out.println( iNum1 % iNum2 ); // 2

                int dnum = (int) dNum;
                System.out.println( dNum ); // 2


                System.out.println( iNum2*dNum ); // 10.0

                float inum1 = (float) iNum1;
                System.out.println( iNum1 ); // 10.0

                System.out.println( iNum1 iNum2 ); // 2.5

                System.out.println( dNum ); // 2.5

                System.out.println( fNum ); // 3

                int fnum = (int) fNum;
                int result0 = inum1/int fnum;
                System.out.println( iNum1/fNum ); // 3

                System.out.println( iNum1 fNum );// 3.3333333 f

                System.out.println( iNum1 fNum ); // 3.3333333333333335 d

                System.out.println( ch ); // 'A'

                System.out.println( ch ); // 65

                System.out.println( ch iNum1 ); // 75

                System.out.println( (ch iNum1) ); // 'K'




    }
}
