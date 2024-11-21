package com.kh.oop.methodPre;

public class ReturnRun1 {
    public static void main(String[] args) {

        ReturnPre1 r1 = new ReturnPre1();
        //System.out.println(r1.findID("감길식",5678));
       // System.out.println(r1.findID("홍길동",1234));

        int x = 1;
        int y = 2;

        // r1.add(x,y);
        //r1.sub(x,y);
        //r1.mul(x,y);
        //r1.div(y,x);

        //System.out.println(r1.add(x,y));
        //System.out.println(r1.sub(x,y));
        //System.out.println(r1.mul(x,y));
        //System.out.println(r1.div(y,x));
        //int[] a={10, 20, 30, 40, 50};
        String[] z={"apple", "banana", "cherry"};
        ReturnPre2 r2 = new ReturnPre2();
        //r2.method5(a);
        r2.intro("홍길동",40);
        r2.compare(123,456);
        r2.abcdef(85);
        r2.rating(85);
        r2.method4(100000,20);

        r2.method6(17);
        r2.method7("Hello","world");
        r2.method8(z,"banana");




        System.out.println(r2.intro("홍길동",40));
        System.out.println(r2.compare(123,456));
        System.out.println(r2.abcdef(85));
        System.out.println(r2.rating(85));
        System.out.println(r2.method4(100000,20));
        System.out.println(r2.method6(17));
        System.out.println(r2.method7("Hello","world"));
        System.out.println(r2.method8(z,"banana"));
    }
}
