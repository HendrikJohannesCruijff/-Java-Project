package Mypage;

import java.util.Scanner;

public class MyPageList {

    //1,남승승,4chyz,iltxz3meo,010-2109-7033,580418-2907053,v6ztl78f@nate.com,광진구,사아-8689959395814,219000,2등급
    static Scanner scan;

    static {
        scan = new Scanner(System.in);
    }
    public MyPageList(){
    }

    public void myPageScreen(){
        User user = new User();
        infoChange infoChange = new infoChange();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━마이페이지━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("  이름 : %s\n", user.getName());
        System.out.printf("  나이 : %s\n", user.getAge());
        System.out.printf("  성별 : %s\n", user.getGender());
        System.out.printf("  아이디 : %s\n", user.getId());
        System.out.printf("  비밀번호 : %s\n", user.getPw());
        System.out.printf("  연락처 : %s\n", user.getTel());
        System.out.printf("  이메일 : %s\n", user.getEmail());
        System.out.printf("  주소 : %s\n", user.getAddress());
        select();
        infoChange.changeMyInfo();


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
        System.out.println("     0. 돌아가기                                     "  );
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
            myPageScreen();
        }
    }



    private void TradeReview(){


    }

}
