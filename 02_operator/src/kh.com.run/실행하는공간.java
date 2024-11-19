package kh.com.run;

import kh.com.ex.OperatorEx;

public class 실행하는공간 {
    //OperatorEx 로 만든 기능들 중에서 원하는 기능만 선택해서 실행하는 공간
    public static void main(String[] args) {
        // kh.com.ex.OperatorEx 파일을 가져와서 파일안에 public void(){}로 작성된 기능들 중에서 원하는 기능만 선택해서
        //최종으로 사용하겠다는 의미.
        //원하는 기능은 개발자가 원하는 만큼 사용할 수 있고, 사용을 안해도 무관함.
        OperatorEx ex = new OperatorEx();
        //new OperatorEx()를 매번 붙여주는것은 가독성이 떨어지기 때문에,
        //ex 라는 변수명에 담아서 사용.
        ex.삼의배수가맞는지확인하는기능();
        ex.이의배수가맞는지확인하는기능();
    }
}
