package com.kh.CollectionEX.pack2.setPre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPre1 {
    /*
    set (집합, 주머니)
    -기본적으로 순서를 유지하지 않은 (index가 없음, get메서드도 없음)

    -중복데이터 저장하지 않음. 같은값은 덮어쓰기가 됨

    set 인터페이스의 자식 클래스
        1. HashSet(대표) : 처리 속도가 빠른 Set
        2. LinkedHashSet :순서유지
        3. TreeSet :자동정렬
        2,3번은 ArrayList를 쓰는게 더 좋다고 함.


     */

    /*
    method1() 아무값이나 넣고 중복 허용되는지 확인
     */
    public void method1(){
        HashSet set = new HashSet(); // 자료형 제한이 없음.
        set.add("점심");
        set.add(100);
        set.add(true);
        set.add(3.14);

        set.add("점심");
        set.add("저녁");
        set.add("점심2");
        System.out.println(set); //set.toString 생략되어있음

        ArrayList list = new ArrayList();
        list.add(1);
        list.add("점심");
        list.add("점심");
        list.add("점심");
        list.add("저녁");
        list.add("저녁2");
        System.out.println(list);



    }

    // HashSet 을 이용해서 자료형이 String 과일 추가
    public void method2(){
        HashSet<String> set = new HashSet<String>();
        set.add("사과");
        set.add("바나나");
        set.add("포도");
        set.add("사과 ");
        set.add(" 사과");
        set.add(" 사과 "); //공백도 글자로 포함.
        System.out.println("set에 저장된 모든 리스트 출력 : "+ set);
        System.out.println("개수 확인 : " + set.size());
        set.remove("포도");
        System.out.println("포도를 제외한 모든 리스트 출력 : "+ set);
        // 바나나가 안에 들어있는지 확인
        set.contains("바나나"); //결과는 boolean으로
        System.out.println("바나나가 들어있는지 확인 : " + set.contains("바나나"));
        set.clear();
        System.out.println("삭제확인 : " + set.isEmpty());
        System.out.println("set에 저장된 모든 리스트 출력 : "+ set);
    }

    // 자료형 int 10 200 3000 500 40 추가
    // 3000지우고 확인
    // 500 존재여부 채그
    // 모두 비우기  비웠는지 확인
    // int -> Integer
    public void method3(){
        HashSet<Integer> intset  = new HashSet<Integer>();
        intset.add(10); // set 에는 index가 없어서 정수도 Integer.valueOf() 없이그냥 값을 넣으면 됨
        intset.add(200);
        intset.add(3000);
        intset.add(500);
        intset.add(40);
        System.out.println("전체 추가 확인 : "+intset);
        intset.remove(3000);
        System.out.println("3000 제거 확인 : "+intset);
        intset.contains(500);
        System.out.println("500 존재여부 확인 : "+intset.contains(500));
        intset.clear();
        System.out.println("삭제로인한 값 없음 확인 : "+intset.isEmpty());
        System.out.println("전체 확인 : "+intset);

    }

    // set 을 향상된 for문으로 출력하기
    // 일반 for문은 index가 존재하지않는 set으로는 사용에 제한이 있음
    // 대신 Iterator 라는 반복문으로 출력
    public void method4(){
        HashSet<String> strList = new HashSet<String>();
        strList.add("참외");
        strList.add("토마토");
        strList.add("수박");

        for(String s:strList){
            System.out.println(s);// 하나씩 꺼낸다음 s 변수명에 값을 담고 출력
        }

    }

    // Iterator를 이용한 set출력
    public void method5(){
        HashSet<String> strList = new HashSet<String>();
        strList.add("딸기");
        strList.add("사과");
        strList.add("바나나");
        strList.add("포도");


        Iterator<String> iterator = strList.iterator(); // 목록을 담고있는 str 변수명을 가져와서 반복하겠다고 설정
        while(iterator.hasNext()){ // 만약에 hasNexr() = 다음값이 존재한다면 true.
            System.out.println(iterator.next());// it에는 현재 str에서 꺼내온 값이 들어있음 값을 꺼냈으면 next다음값을 준비해서 넣는것.
        }
        /*
        Iterator = 컬렉션을 순차적으로 회전하는 객체
        arraylist 나 collection 등의 객체에도 사용가능
        .Iterator() = 반복을 원하는 변수명 뒤에 작성한 후 반복을 하겠다는 설정. 값에다 순자척으로 접근

        .hasNext() = 반복할 수 있는 값이 남아있는지 확인
                    결과 : ture = 아직 반복요소가 남아있음.()리스트 목록안에 들어있는 값.
                           false =반복요소 없음

        it.next() = 현재 Iterator 가 가리키고 있는 현재의 값을 보여주고, 그다음에 자동으로 다음 값으로 이동 설정

        // set의 경우 대표적으로 로또번호 생성시 사용 (중복이 안되서)

         */


    }
    public void iterLotto(){
        //1.HashSet을 이용한 로또 번호 저장
        HashSet<Integer> lottoNumbers = new HashSet<>();

        //2. 중복없이 6개의 번호 생성 for문
        for(int i =0; lottoNumbers.size() <6; i++){
            //Math.random() = 0.00~1.0사이의 소수를 출력.
            //정수형 int로 소수들을 버림.
            //(Math.random()*45)+1;
            int num = (int)(Math.random()*45)+1;
            lottoNumbers.add(num);
        }
        System.out.println(lottoNumbers);
        /*
        Iterator<Integer> it = lottoNumbers.iterator();
        System.out.println("=== 로또 번호 ===")
        while(it.hasNext()){
            System.out.println(it.next()); //번호가 순차적으로 나옴
            }
         */
    }

    // for-each 이용해서 로또생성 for는 읽기전용

    public void forLotto() {
        HashSet<Integer> lottoNumbers = new HashSet<>();

        //2. 중복없이 6개의 번호 생성 for문
        for (int i = 0; lottoNumbers.size() < 6; i++) {
            //Math.random() = 0.00~1.0사이의 소수를 출력.
            //정수형 int로 소수들을 버림.
            //(Math.random()*45)+1;
            int num = (int) (Math.random() * 45) + 1;
            lottoNumbers.add(num);
        }
        System.out.println(lottoNumbers);
    }


}
