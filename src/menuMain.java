
import DTO.Member.MemberDTO;
import Repository.National.RepublicOfKoreaRepository;
import Service.Member.MemberService;
import Service.Member.ReservationService;
import Service.National.JAPANService;
import Service.National.RepublicOfKoreaService;
import Service.National.USAService;
import commonVariables.CommonVariables;

import java.sql.Struct;
import java.util.List;
import java.util.Scanner;

public class menuMain {
    public static void main(String[] args) {


        MemberService memberService = new MemberService();
        RepublicOfKoreaService republicOfKorea = new RepublicOfKoreaService();
        ReservationService reservationService = new ReservationService();
        USAService usa = new USAService();
        JAPANService japan = new JAPANService();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int num = 0;

        while (run) {
            System.out.println(" ");
            System.out.println("OOO 여행사 홈페이지를 접속해주셔서 감사합니다. 원하시는 서비스의 번호를 입력해 주세요.");
            System.out.println(" 로그인을 하시면 여행사 메인 메뉴로 접속 됩니다. ");
            System.out.println("------------------------------------------------------------------");
            System.out.println("         | 1. 회원가입 | 2. 로그인 | 3. 로그아웃 | 4. 종료 |");
            System.out.println("------------------------------------------------------------------");
            num = sc.nextInt();

            if (num == 1) {
                memberService.save();
            } else if (num == 2) {
                if (CommonVariables.longinEmail == null) {
                    memberService.login();
                    if (CommonVariables.longinEmail != null) {
                        boolean run1 = true;
                        while (run1) {
                            System.out.println("---------------------------------------------------------------------------------------------------");
                            System.out.println("| 1.도착 국가 결정 | 2. 입금기능 | 3. 나의 정보 및 예약 정보 | 4.예약 취소 | 0. 메인메뉴로 돌아가기 | ");
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.print("서비스 선택 > ");
                            num = sc.nextInt();

                            boolean run2 = true;

                            if (num == 1) {
                                    while (run2) {
                                        System.out.println("------------------------------------------------------");
                                        System.out.println(" | 1. 대한민국 | 2. 일본 | 3. 미국 | 0. 전 메뉴 돌아가기 | ");
                                        System.out.println("------------------------------------------------------");
                                        num = sc.nextInt();
                                        if (num == 1) {
                                            System.out.println("선택하신 국가는 대한민국 입니다. ");
                                            republicOfKorea.RepublicOfKorea();
                                            run2 = false;
                                        } else if (num == 2) {
                                            System.out.println("선택하신 국가는 일본 입니다. ");
                                            japan.JAPAN();
                                            run2 = false;
                                        } else if (num == 3) {
                                            System.out.println("선택하신 국가는 미국 입니다. ");
                                            usa.USA();
                                            run2 = false;
                                        } else if (num == 0) {
                                            System.out.println("전 메뉴로 돌아가겠습니다.");
                                            run2 = false;
                                        }
                                    }

                            } else if (num == 2) {
                                reservationService.deposit();
                            } else if (num == 3) {
                                memberService.Mypage();
                            } else if (num == 4) {
                                memberService.reserveCancle();
                            } else if (num == 0) {
                                System.out.println("메인메뉴로 돌아가겠습니다.");
                                run1 = false;
                            }
                        }

                    } else {
                        System.out.println("현재 로그인이 되어있는 상태입니다.");
                        System.out.println("다른계정으로 로그인하시려면 로그아웃을 먼저 해주시길 바랍니다.");
                    }
                }
            } else if (num == 3) {
                memberService.logout();
            } else if (num == 4) {
                run = false;
            }
        }


    }

}


