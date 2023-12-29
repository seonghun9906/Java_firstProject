package Service.Member;


import DTO.Member.ReservationDTO;
import DTO.Member.SeatReserveDTO;
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
        System.out.print(" Eamil > ");
        String memEmail = sc.next();
        if(memEmail.equals(CommonVariables.longinEmail)) {
            if(CommonVariables.Seatreserve != null) {
              SeatReserveDTO seatReserveDTO = reservationRepository.reserveprint(memEmail);
                System.out.println("고객님의 좌석 배정 예약 정보 입니다.");
                System.out.println(seatReserveDTO);
                System.out.println(" 입금하실 금액을 입력해 주세요. ");
                System.out.print(" 입금할 금액 > ");
                int deposit = sc.nextInt();
                boolean depositCheck = reservationRepository.depsitCheck(deposit, CommonVariables.longinEmail);
                if (depositCheck) {
                    CommonVariables.deposit = String.valueOf(deposit);
                    CommonVariables.Reserving = memEmail;
                    System.out.println("입금이 확인되었습니다. 에약이 완료되었습니다.");
                } else {
                    System.out.println("입금이 확인에 실패하였습니다. 정확한 금액을 다시 적어주시기 바랍니다.");
                }
            }else{
                System.out.println("좌석 배정을 먼저 해주시길 바랍니다. ");
            }
        }else{
            System.out.println("로그인된 이메일과 입력된 이메일이 다릅니다.");
        }
    }
}
