package com.kh.oop.methodPre;

public class ReturnPre2 {

    //1. 이름과 나이를 입력받아 소개 메세지 반환
    // 안녕하세요! 제이름은 홍길동이고, 나이는 40세 입니다.
    public String intro(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }

    //2. 두 숫자를 입력받아 가장 큰 숫자 반환
    // num1 과 num2 를 비교해서 큰값의 숫자를 출력
    // 000 보다 0000이 큰 숫자입니다.
    public String compare(int num1, int num2) {

        if (num1 > num2) {
            return num1 + " 보다 " + num2 + "이 큰 숫자 입니다.";
        } else if (num1 < num2) {
            return num2 + " 보다 " + num1 + "이 큰 숫자 입니다.";
        } else
            return num1 + " 와 " + num2 + "이 같습니다.";
    }

    public char rating(int score) {
        switch (score / 10) {
            case 9:
            case 10:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }

    public String abcdef(int score) {
        char grade;
        switch (score / 10) {
            case 9:
            case 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        return "입력한 점수 : " + score + " 등급 : " + grade;

    }
    //4. 상품 가격과 할인율을 입력받아 최종 금액 반환
    //(가격 - 가격 * 할인률 / 100)
    //문제: 상품 가격과 할인율을 입력받아 할인된 금액을 계산하여 출력하세요.
    //출력 결과: 원래 가격: 100000원 할인율: 20% 최종 금액: 80000원
    public String method4(int price, double discount){
        double result = price - (price*(discount/100));
        return "원래 가격: " + price+ "원 할인율: "+ discount +"% 최종 금액: "+result+"원";
    }
    //5. 배열의 평균값 반환
    //(향상된 for문과 +=문     sum / numbers.length 활용)
    //문제: 주어진 배열의 평균값을 아래와 같이 출력하세요.
    //출력 결과: 배열: [10, 20, 30, 40, 50] 평균값: 30.0

    public String method5(int[] arr){
            int sum = 0;
            String total ="";
            double even = sum/(arr.length);
        for(int i = 0; i<arr.length; i++){
                sum += arr[i];
                total += String.valueOf(arr[i])+" ";
        }

        return "배열: "+total+ " 평균값: "+ even;
    }

    //6. 주어진 나이가 성인인지 확인하고 메시지 반환
    //(삼항연산자나 if문 활용)
    //문제: 나이를 입력받아 성인 여부를 판단하고 메시지를 출력하세요.
    //출력 결과: 나이: 17 결과: 미성년자입니다.
    public String method6(int age){
        String result = "";
        if(age > 18){
            result = "성인";
        } else {
            result = "미성년자";
        }
        return "나이: "+age+" 결과: "+result+"입니다.";

    }
    //7. 두 문자열을 연결한 뒤 반환
    //(문자열 + 로 이어붙이기)
    //문제: 문자열 두 개를 입력받아 연결된 결과를 아래와 같이 출력하세요.
    //출력 결과: 입력된 문자열: "Hello", "World" 연결된 문자열: "Hello World"
    public String method7(String a, String b){
        return "입력된 문자열: \""+ a+ "\", \""+ b +"\" 연결된 문자열: \"" + a+b+"\"";
    }
    //8. 특정 문자열이 배열에 존재하는지 확인 후 결과 반환
    //(향상된 for문과 if문 조합)
    //문제: 주어진 배열에서 특정 문자열이 존재하는지 확인하고 결과를 출력하세요.
    //출력 결과:배열: ["apple", "banana", "cherry"] 찾는 문자열: "banana" 결과: 배열에 banana이(가) 존재합니다.
    public String method8(String[] a, String b){
        for (String find : a){
            if(find.equals(b)){
                return find;
            }
        }
        return "배열: "+ a + " 찾는 문자열: "+ b +" 결과: 배열에 "+b+"이(가) 존재합니다.";
    }

    /*
    * boolean found = false;
    *
    *for(String str : arr){
    * if(str.equals(target)){
    *       found = true;
    *       break;
    *   }
    * }
    * if (found) {
    *  return "배열에 " + target +"이(가) 존재합니다.;
    * } else {
    *  return "배열에 " + target +"이(가) 존재하지 않습니다.;
    * }
    *
    * */
    //9. 반지름을 입력받아 원의 넓이 반환
    //(반지름을 입력받아 원의 넓이를 구하는 공식:  Math.PI * radius * radius)
    //문제: 원의 반지름을 입력받아 원의 넓이를 계산하여 출력하세요.
    //출력 결과: 반지름: 7 원의 넓이: 153.93804002589985
    /*
    public String method9(){

    }

*/

}


