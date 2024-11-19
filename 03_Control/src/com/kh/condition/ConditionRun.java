package com.kh.condition;

public class ConditionRun {
    // main 기능으로 작성한 기능 불러오기 후 싱행하기 때문에,기능이 실행됨
    public static void main(String[] args) {
        ConditionEx c = new ConditionEx();

        //c.나이확인();
        //c.scannerAge();
        //c.methodAge();
        //c.methodMonth();
        c.switchMonth();
    }
}
