package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    // main() 메서드 생성
    public static void main(String[] args) {
        //main() 메서드 안애 Scanner 활용
        //scanner 이용해서
        //주문받고 주문받은 내용을 출력하는 기능 생성
        Scanner sc = new Scanner(System.in);
        Cafe c = new Cafe();

        System.out.print(" 상품명을 입력해주세요 : ");
        String name = sc.nextLine();
        if (name.trim().length() == 0) {
            System.out.println("상품이름은 공백이 될 수 없습니다.");
        } else {
            c.setName(name);
        }
        System.out.print(" 희망가격을 입력해주세요(개당) : ");
        int price = sc.nextInt();
        if (price <= 0) {
            System.out.println("가격은 음수나 0이 될 수 없습니다.");
        } else {
            c.setPrice(price);
        }
        System.out.print(" 주문 수량을 입력해주세요 : ");
        int quantity = sc.nextInt();
        if (quantity <= 0) {
            System.out.println("최소 1개 이상의 주문접수가 필요합니다.");
        } else {
            c.setQuantity(quantity);
        }

        //3. Scanner 로 작성한 입력값을 모두 받아
        //필수 생성자로 만들어진 객체에 변수명으로 저장


        //4. 주문 출력
        if (c.getName().trim().length() == 0||c.getPrice() <=0 || c.getQuantity() <=0) {
            System.out.println("주문 조건이 맞지 않습니다. 상품명, 회망가격, 주문수량을 확인해주세요.");
        } else {
            System.out.println("주문하신 물품의 총 가격은 : "+ c.totalPrice());
            System.out.println("선택하신 총 주문내역은 다음과 같습니다. "+ c.toString());
        }

    }
}
