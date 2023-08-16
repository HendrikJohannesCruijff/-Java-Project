package Mypage;

import java.util.Scanner;

public class infoChange {
    static Scanner scan;

    static {
        scan = new Scanner(System.in);
    }

    public void changeMyInfo() {
        User user = new User();
        System.out.println();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("                  회원 정보 수정");
        System.out.println("이름 : " + user.getName());

        select();

    }

    public void select() {
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("            [마이 페이지 활동을 선택하세요]           ");
        System.out.println("     1. 회원 정보 수정                                 ");
        System.out.println("     2. 구매/판매 기록                             ");
        System.out.println("     3. 상품 거래 후기                             ");
        System.out.println("     4. 키워드 알림 확인                           ");
        System.out.println("     5. 회원 탈퇴                                 ");
        System.out.println("     6. 나가기            `                      ");
        System.out.println("     0. 돌아가기                                     ");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        System.out.print("     > 번호 입력:");
        String input = scan.nextLine();

        if (input.equals("1")) {
            infoChange infoChange = new infoChange();
            infoChange.changeMyInfo();
        } else if (input.equals("2")) {
            //구/판매 기록
        } else if (input.equals("3")) {
            // 상품 거래 후기
        } else if (input.equals("4")) {
            // 키워드 알림 확인
        } else if (input.equals("5")) {
            // 회원 탈퇴
        } else if (input.equals("6")) {
            // 나가기
        } else if (input.equals("0")) {
            // 돌아가기
        } else {
            System.out.println("1~6의 번호를 입력해주세요");

        }
    }
}