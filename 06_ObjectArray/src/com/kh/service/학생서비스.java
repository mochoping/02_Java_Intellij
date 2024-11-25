package com.kh.service;

import com.kh.dto.학생;

// service 클래스 : 기능제공 클래스
// -> 입출력 뺴고 나머지 모두 작성
// if ,for문을 이용해서 데이터를 가공 저장
// run에서 작성했던 사람을 저장하고 추가하고 삭제하고 수정하는 기능을
// 서비스라는 폴더로 따로 빼서 작성
// 기능 모음 폴더
public class 학생서비스 {

    private 학생 s1; // dto이 만든 학생을 참조 자료형으로 사용해서 착생에 등록된 정보를 저장

    //학생 정보 추가
    public void 학생추가하기(String studentNumber, String studentName, char gender){
        s1 = new 학생(studentNumber, studentName, gender);
    }

    //학생 정보 반환
    public 학생 getS1() {
        return s1;
    }
}
