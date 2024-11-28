package com.kh.CollectionEX.pack3.mapPre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapService {





    //1. HashMAp 을 이용해서 값 추가하고 확인하기
    public void method1(){
        HashMap<String, String> 나라들 = new HashMap<>();

        //데이터 추가
        나라들.put("KR", "Korea");
        나라들.put("US", "United States");
        나라들.put("EU", "European Union");

        System.out.println("각 국가들의 약칭 확인하기"+ 나라들);
        // 작성한 순서 상관없이 나열


        //2. Key에 해당되는 Value 를 반환
        System.out.println("----------------------------------------");
        System.out.println(나라들.get("EU"));
        System.out.println(나라들.get("CN")); // 존재하지 않은 키의 null값 출력

        //3. size() 이용해서 Map에 저장된 Entry(K : V) 의 개수 출력 size는 int 값으로
        System.out.println("저장된 나라 종류 수 : " + 나라들.size());

        //4. V remove(K V) : Key 가 일치하는 Entry 제거 Entry (K : V)
        // 있다면 value 없다면 null반환

        나라들.remove("KR ");
        나라들.remove("EU ");
        System.out.println("제거후 나라들 출력 : " + 나라들);
        System.out.println("[EU ] 지우기 " + 나라들.remove("EU "));

        // 5. clear() : 모든 Entry 삭제
        // 6. boolean isEmpty() : 비어있는지 확인

    }


    //2. 향상된 for문을 이용해서 순차적으로 접근해서 출력하기
    // 2-1. Map의 경우 index 가 없기 때문에 Map.keySet()을 이용해서 접근
    public void method2(){
        Map<String ,String> map = new HashMap<>();
        map.put("학원", "서울시 강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");
        //key만 set으로 만들기
        Set<String> set = map.keySet();
        System.out.println("keyset() 확인하기 : "+set);
        for(String key : set){
            //set에 저장된, 키값[ 집, 63빌딩, 학원, 롯데타워] 를
            //순차적으로 key저장 저장된 키에 해당하는 값을
            // map.get(key) 를 이용해서 키에 해당하는 value 값을 get 하겠다 작성
            System.out.println(key + ":"+map.get(key));

        }


    }

    // 2-2. map의 경우 index가 없기 떄문에 Map.entrySet()을 이용해서 접근
    public void method3(){
        Map<String ,String> map = new HashMap<>();
        map.put("학원", "서울시 강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        System.out.println("keyset() 확인하기 : "+entrySet);

        for(Map.Entry<String, String> key : entrySet){
            //key - value 한쌍씩 가져온 값에서 하나씩 출력
            System.out.println(key + ":"+key.getValue());

        }


    }




}
