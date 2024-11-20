package com.kh.Loop;

public class LoopRun {
    public static void main(String[] args) {
        // 외부 클래스명은 void, main,return 메서드 안에 작성해주어야함.
        LoopEx l = new LoopEx();
        //l.method1();
        //l.method2();
       // l.method3();
       // l.method4();

        LoopEx2 l2 = new LoopEx2();
        //l2.while1();
        //l2.while2();
        //l2.while3();
        //l2.while4();

        Menu m = new Menu();
        //m.order();

        LoopDoWhile ld = new LoopDoWhile();
        ld.method1();
    }

    /*
     LoopEx l = new LoopEx();
        l.method1();
        매서드(기능)안에 존재하지 않기 떄문에 error 발생


     */


}
