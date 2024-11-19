package com.variable.practice;

public class Practice3 {
    public static void main(String[] args) {

                int iNum1 = 10;
                int iNum2 = 4;
                float fNum = 3.0f;
                double dNum = 2.5;
                char ch = 'A';


                System.out.println( iNum1 % iNum2 ); // 2

                int n0 = (int) dNum;
                System.out.println( n0 ); // 2
                //System.out.println( (int)dNum );
                System.out.println( iNum2*dNum ); // 10.0

                float n1 = (float) iNum1;
                System.out.println( n1 ); // 10.0
                //System.out.println( (float)iNum1 );

                double n2 = (double) iNum2;
                double result1 = iNum1 / n2;
                System.out.println( result1 ); // 2.5
                //System.out.println( iNum1/(double)iNum2 );

                System.out.println( dNum ); // 2.5

                int n3 = (int) fNum;
                System.out.println( n3 ); // 3

                int n4 = (int) fNum;
                System.out.println( iNum1/n4 ); // 3
                //나머지 연산 System.out.println( iNum1%(int)fNum );
                float n5 = iNum1 /fNum;
                System.out.println( n5 );// 3.3333333 f

                double n6 = (double)(iNum1 /fNum);
                System.out.println( n6 ); // 3.3333333333333335 d

                System.out.println( ch ); // 'A'

                int uni = (int)ch;
                System.out.println( uni ); // 65

                System.out.println( uni+iNum1 ); // 75

                int n7= uni+iNum1;
                char C1 = (char)(n7); // 숫자는 변경되는데, int는 안됨
                System.out.println( C1 ); // 'K'
            // System.out.println( (char) (ch + iNum1) ); // 'K'




    }
}
