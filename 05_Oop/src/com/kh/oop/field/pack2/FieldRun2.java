package com.kh.oop.field.pack2;

import com.kh.oop.field.pack1.FieldEx1;
// 프로텍트를 사용하기 위해 FieldEx1 을 상속한다 라는 표기
// 프로텍트 필드를 상속 하더라도 Static main() 기능에 바로 올라올 순 없음.
// public return method(){} public voic method(){}
// method{} 내부에서 작성해서 사용하기만 가능
public class FieldRun2 extends FieldEx1{
    public static void main(String[] args) {

        FieldEx1 f1 = new FieldEx1();

        System.out.println(f1.퍼블릭필드); // 어디서든 접근이 가능
        //System.out.println(f1.프로텍트필드); // 같은 패키지 혹은 다른 패키지 상속
        //System.out.println(f1.디폴트필드); // only 갘은 패키지에서만 가능
        //System.out.println(f1.프라이빗필드); // 같은 클래스만

    }
    public void method(){
        //다른 패키지지만 상속 상태이기 때문에
        //기능 내부에 호출해서 사용
        System.out.println(프로텍트필드);
    }
}
