import Service.MemberService;
import commonVariables.CommonVariables;

import java.util.Scanner;

public class menuMain {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int num = 0;

        while (run){
            System.out.println(" ");
            System.out.println("OOO 여행사 홈페이지를 접속해주셔서 감사합니다. 원하시는 서비스의 번호를 입력해 주세요.");
            System.out.println("------------------------------------------------------------------");
            System.out.println("         | 1. 회원가입 | 2. 로그인 | 3. 로그아웃 | 4. 종료 |");
            System.out.println("------------------------------------------------------------------");
            num = sc.nextInt();

            if(num == 1){
                memberService.save();
            }else if(num == 2){
                if(CommonVariables.longinEmail != null) {
                    memberService.login();
                }else{
                    System.out.println("현재 로그인이 되어있는 상태입니다.");
                    System.out.println("다른계정으로 로그인하시려면 로그아웃을 먼저 해주시길 바랍니다.");
                }
            }else if(num == 3){
                memberService.logout();
            }else if(num == 4){
                run = false;
            }



        }

    }

}
