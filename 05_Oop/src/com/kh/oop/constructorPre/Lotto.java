package com.kh.oop.constructorPre;

public class Lotto {
    //필드선언 배열도 가능
    private int[] lotto = new int[6];

    //기본생성자
    public Lotto() {}
    //로또 번호를 랜덤으로 생성해서 6자리 담는 메서드
    public void randonNumber() {
        //총 6개가 맞는지 갯수 세는 count
        int count = 0;
        // 0 1 2 3 4 5
        while (count < 6) {
            // 숫자를 랜덤으로 1~45자리 수를 만들어서
            // 총 6자리 출력
            // double -> int
            int num = (int)(Math.random() * 45)+1; // 시작이 0부터
            boolean 중복확인 = false; //아직 비교하지 않았기때문에 false로 시작

            //중복 확인
            for (int i = 0; i < count; i++) {
                if (num == lotto[i]) {
                    중복확인 = true;
                    break; // 기존에 있는 수와 랜덤으로 나온수가 동일하기 때문에, 다시 랜덤으로 숫자를 생성하라 돌려보내기

                }
            }
            //중복이 없을 경우 배열에 추가
            if(!중복확인){
                lotto[count] = num;
                count++;
            }
        }
    }
    //만약에 로또번호가 생성이 모두 다 됐다면 번호 확인
    public void info(){
        if(lotto == null) {// 아무것도 없거나 잘못된 값이 넘어옴 상태
            System.out.println("로또 번호가 생성되지 않았습니다.");
            return;
        }
        System.out.print("로또 번호 확인하기 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }

}
