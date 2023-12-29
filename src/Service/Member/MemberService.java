package Service.Member;

import DTO.Member.MemberDTO;
import DTO.Member.ReservationDTO;
import DTO.Member.SeatReserveDTO;
import Repository.Member.MemberRepository;
import Repository.Member.ReservationRepository;
import commonVariables.CommonVariables;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberService {

    ReservationRepository reservationRepository = new ReservationRepository();
    MemberRepository memberRepository = new MemberRepository();
    Scanner sc = new Scanner(System.in);

    public void save() {
        System.out.println("----------------------------------------------");
        System.out.println("고객님의 회원가입을 위해 몇가지 정보를 입력해 주세요.");
        System.out.println("-----------------------------------------------");
        System.out.print("Eamil > ");
        String memberEmail = sc.next();
        boolean emailCheck = memberRepository.emailCheck(memberEmail);
        if (emailCheck) {
            System.out.print("PW > ");
            String memberPw = sc.next();
            System.out.print("이름 > ");
            String memberName = sc.next();
            System.out.print("핸드폰 번호 > ");
            String memberMobile = sc.next();

            MemberDTO memberDTO = new MemberDTO(memberEmail, memberPw, memberName, memberMobile);
            boolean SignUp = memberRepository.save(memberDTO);
            if (SignUp) {
                System.out.println("회원가입이 완료되었습니다.");
                System.out.println("저희 OOO여행사에 회원가입 해주셔서 감사합니다.");
            } else {
                System.out.println("회원가입에 실패하였습니다. 다시 회원가입 해주시길 바랍니다.");
            }
        } else {
            System.out.println("중복된 Eamil입니다 다른 Eamil을 입력해 주세요.");
        }
    }


    public void login() {
        System.out.println("--------------------------------------------");
        System.out.println("    로그인을 위하여 Eamil 과 Pw를 입력해주세요.   ");
        System.out.println("--------------------------------------------");
        System.out.print("Eamil > ");
        String loginEamil = sc.next();
        System.out.print("Pw > ");
        String loginPw = sc.next();

        MemberDTO login = memberRepository.login(loginEamil, loginPw);
        if (login != null) {
            System.out.println("로그인 되었습니다.");
            CommonVariables.longinEmail = loginEamil;
            System.out.println(loginEamil + " 님 환영합니다!! ");

        } else {
            System.out.println("로그인에 실패하였습니다.");
            System.out.println("Eamil 또는 Pw를 다시 확인하여주시기 바랍니다.");
        }
    }


    public void logout() {
      boolean logout = memberRepository.logout(CommonVariables.longinEmail);
        if(logout){
            System.out.println("로그아웃 되었습니다.");
        } else {
            System.out.println("로그인 상태가 아닙니다.");
            System.out.println("로그인 해주시길 바랍니다.");
        }
    }


    public void Mypage() {
        if (CommonVariables.longinEmail != null) {
            System.out.println("---------------------------------------------");
            System.out.println("   1. 회원정보 출력 | 2. 예약 정보 출력 | ");
            System.out.println("----------------------------------------------");
            System.out.println("번호 입력 > ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("본인확인을 위해 한번더 이메일을 입력해주세요.");
                System.out.print(" E mail > ");
                String memEmail = sc.next();
                if (memEmail.equals(CommonVariables.longinEmail)) {
                    memberRepository.memList(memEmail);
                }else{
                    System.out.println("로그인된 이메일과 입력한 이메일이 다릅니다.");
                }
            } else if (num == 2) {
                System.out.println("본인확인을 위해 한번더 이메일을 입력해주세요.");
                System.out.print(" E mail > ");
                String memEmail = sc.next();
                if (memEmail.equals(CommonVariables.longinEmail)) {
                    if (CommonVariables.Reserving != null) {
                        if (CommonVariables.deposit != null) {
                            String DepositAT = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                           SeatReserveDTO seatReserveDTO1 = reservationRepository.reserveprint(memEmail);
                           ReservationDTO reservationDTO1 = reservationRepository.reserveprintDTO(memEmail);
                            if (seatReserveDTO1 != null) {
                                System.out.println(reservationDTO1 + " 입금 시간 = " + DepositAT);
                            } else {
                                System.out.println("입력 정보 x");
                            }
                        } else {
                            System.out.println("입금을 먼저 해주시길 바랍니다.");
                        }
                    } else {
                        System.out.println("좌석배정예약이 없습니다.");
                        System.out.println("좌석배정을 하셨으면 입금을 해주시기 바랍니다.");
                    }
                }else{
                    System.out.println("로그인된 이메일과 입력한 이메일이 다릅니다.");
                }
            }
        }
    }



    public void reserveCancle() {
        System.out.println("본인 확인을 위해 이메일을 입력해주세요.");
        System.out.print("Eamil > ");
        String memEamil = sc.next();

        boolean emailCheck = memberRepository.emailCheck(memEamil);
        if(CommonVariables.longinEmail.equals(memEamil)) {
            if (!emailCheck) {
                reservationRepository.reserveCancle(memEamil);

                System.out.println("예약이 취소 되었습니다.");
            } else {
                System.out.println("예약 취소에 실패하였습니다. 이메일을 다시 확인해 주시기 바랍니다.");
            }
        }else{
            System.out.println("로그인 된 이메일과 달라 예약 취소가 불가합니다.");
        }
    }
}
