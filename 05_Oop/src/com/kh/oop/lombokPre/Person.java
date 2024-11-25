package com.kh.oop.lombokPre;
/*
 종속화 설정이 필요한데, 아직은 진행 할 수 없음
 */



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//alt shift enter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Person {


    private String name;
    private int age;
    /*
    import lombok.NoArgsConstructor;
    @NoArgsConstructor

    기본생성자 = 넣어야하는 매개변수가 없어서 No Args Constructor
    () -> 넣어야 하는 값이 없어서 매개변수명도 존재하지 않음.
    public Person(){} 을 대체한다.
     */
    /*
    import lombok.AllArgsConstructor; -> 패키지에서 매개변수 생성자 기능 가져오기
    @AllArgsConstructor -> 기능 가져와서 사용하기
    모든 파라미터 값을 넣어야하는 생성자 -> 필드에 작성된 모든 값 가져오기
    All Args = 모든 전달인자 (Arguments)

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
     */
    /*
    Setter

    import lombok.Setter; -> 기능 가져오기 lombok 폴더아래에 있음

    @Setter 클래스 밑에 작성된 필드명에 걸맏는 get 메서드들을 @Setter 이름을 활용해서 대신 모두 생성
     */
    /*
    나중에 롬복이라는 회사를 이용해서 @getter로만 표기를 할것

    import lombok.Getter; -> 기능 가져오기 lombok 폴더아래에 있음

    @Getter 클래스 밑에 작성된 필드명에 걸맏는 get 메서드들을 @Getter 이름을 활용해서 대신 모두 생성

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

     */



}
