package Service.Member;


import DTO.Member.ReservationDTO;
import Repository.Member.ReservationRepository;

import Repository.Member.MemberRepository;

import commonVariables.CommonVariables;

import java.util.Scanner;

public class ReservationService {
    MemberRepository memberRepository = new MemberRepository();
    ReservationRepository reservationRepository = new ReservationRepository();

    Scanner sc= new Scanner(System.in);
    public void deposit() {
        System.out.println(" 고객의 예약 정보를 확인하기 위해 email를 입력해주세요. ");
        String memEmail = sc.next();
        if(memEmail.equals(CommonVariables.longinEmail)) {
            System.out.println(" 입금하실 금액을 입력해 주세요. ");
            System.out.print(" 입금할 금액 > ");
            int deposit = sc.nextInt();
            boolean depositCheck = reservationRepository.depsitCheck(deposit, CommonVariables.longinEmail);
              CommonVariables.deposit = String.valueOf(deposit);
            if(depositCheck){
                CommonVariables.Reserving = memEmail;
                System.out.println("입금이 확인되었습니다. 에약이 완료되었습니다.");
            }else{
                System.out.println("입금이 확인에 실패하였습니다. 정확한 금액을 다시 적어주시기 바랍니다.");
            }
        }else{
            System.out.println("로그인된 이메일과 입력된 이메일이 다릅니다.");
        }
    }
}
