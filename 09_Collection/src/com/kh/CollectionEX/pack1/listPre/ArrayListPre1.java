package com.kh.CollectionEX.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
    //메서드 1 새우깡 맛동산 포카칩 고구마칩 고래밥
    //추가하고 출력하기
    //총 갯수 확인
    public void method1(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("새우깡");
        list1.add("맛동산");
        list1.add("포카칩");
        list1.add("고구마칩");
        list1.add("고래밥");

        System.out.println(list1);
        System.out.println(list1.size());

        //특정위치에 값 추가시 (뒤쪽 값은 밀림)
        list1.add(1,"허니버터칩");
        System.out.println("list에서 허니버터칩 추가 확인 : "+list1);
        //특정위치 값 가져오기 get(int index 자리넘버)
        System.out.println("3번째 인덱스에 저장된 값 : "+list1.get(3));
        // 2번째 저장된 값을 망고과자로 변경 set(index자리넘버, 변경할 값)
        list1.set(2,"망고과자");
        System.out.println("망고과자로 변경됬는지 확인 : "+list1);

        // 특정위치의 값을 삭제 remove("삭제할값") 혹은 remove(index자리값)
        list1.remove(1);
        System.out.println("index 1번 자리 값 삭제 : "+list1);

        list1.remove("포카칩");
        System.out.println("포카칩이 무사히 사라졌는지 확인 : " + list1);

        //6. contains("값")or contains(index 자리값) 리스트에 찾는 값이 들어있는지 확인
        System.out.println("망고과자가 존재하나요? : " + list1.contains("망고과자"));

        //7. clear(); list안에 들어있는 모든 값 삭제
        list1.clear();
        System.out.println("리스트 안에 값이 깨끗하게 지웠졌나요? : "+list1.isEmpty());

        // contains, isEmpty는 값이 boolean 값으로 나옴



    }

    /*
    method2
     */

    public void method2(){
        //ArrayList를 생성하여사과, 포도, 바나나, 망고를 저장하세요.
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("사과");
        list1.add("포도");
        list1.add("바나나");
        list1.add("망고");
        System.out.println(list1);
        //과일 리스트의 두 번째 위치에 오렌지를 추가하세요.
        list1.add(1,"오렌지");
        System.out.println("두번째 위치에 오렌지 추가 : "+list1);
        //리스트에서 바나나 -> 파인애플로 변경하세요.
        list1.set(3,"파인애플");
        System.out.println("바나나 -> 파인애플로 변경 : "+list1);
        //리스트에서 첫 번째 과일을 삭제하세요.
        list1.remove(0);
        System.out.println("첫번째 과일 삭제 : "+list1);
        //리스트에서 망고를 삭제하세요.
        list1.remove("망고");
        System.out.println("망고 삭제 : "+list1);
        //리스트에 사과가 남아있는지 확인하고 사과가 만약에 있다면 사과를 없애고 출력하세요.
        System.out.println("사과포함 확인 : "+list1.contains("사과"));
        if(list1.contains("사과")) {
            list1.remove("사과");
            System.out.println(list1);
        } else {
            System.out.println("사과가 리스트에 없습니다.");
        }
        //리스트를 비우고, 리스트가 비어 있는지 확인하고 결과를 출력 세요.
        list1.clear();
        System.out.println("리스트 삭제후 출력 : "+list1);

    }
}
