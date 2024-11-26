package com.kh.CollectionEX.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre2 {

    public void method1(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.remove(Integer.valueOf(30));
        // 정수중에서 값을 지정해 제거하고 싶을때, 정수를 쓰면 index로 인식되니,
        // Integer.valueOf() 작성
    }

}
