package Service.National;

import DTO.Member.MemberDTO;
import DTO.Member.SeatReserveDTO;
import DTO.National.RepublicOfKoreaDTO;
import DTO.Member.ReservationDTO;
import Repository.Member.MemberRepository;
import Repository.National.RepublicOfKoreaRepository;
import Repository.Member.ReservationRepository;
import commonVariables.CommonVariables;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Scanner;

public class RepublicOfKoreaService {
    static ReservationRepository reservationRepository = new ReservationRepository();
    static MemberRepository memberRepository = new MemberRepository();
    static RepublicOfKoreaRepository republicOfKoreaRepository = new RepublicOfKoreaRepository();
    Scanner sc = new Scanner(System.in);
    int num1 = 0;

    public void RepublicOfKorea() {
        boolean run = true;
        String mememail = CommonVariables.longinEmail;
        while (run) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. 아시아나항공 | 2. 대한항공 | 3. 진 에어 | 4. 전 메뉴 돌아가기 ");
            System.out.println("------------------------------------------------------------------");
            System.out.print("원하시는 항공사의 번호를 입력해주세요 > ");
            num1 = sc.nextInt();

            if (num1 == 1) {
                System.out.println("선택하신 항공사는 아시아나 항공사 입니다.");
                System.out.println(" 1. 출발 시각 /  10 : 00  | 도착 시각 /  12 : 00 ");
                System.out.println(" 2. 출발 시각 /  13 : 00  | 도착 시각 /  15 : 00 ");
                System.out.println(" 3. 출발 시각 /  17 : 00  | 도착 시각 /  19 : 00 ");
                System.out.print("원하시는 탑승 시각의 번호를 입력해 주세요 > ");
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "아시아나 항공", RepublicOfKoreaDTO.reserveSeatPrice, " 1. 출발 시각 /  10 : 00  | 도착 시각 /  12 : 00 ", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeatPrice + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                             MemberDTO memberDTO = memberRepository.Check(CommonVariables.longinEmail);
                            if (memberDTO != null) {
                                memberDTO.getReservationDTOList().add(reservationDTO);
                            }else{
                                System.out.println("오류로 인해 취소");
                            }


                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else if (num == 2) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat1(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "아시아나 항공", RepublicOfKoreaDTO.reserveSeatPrice1, " 출발 시각 /  13 : 00  | 도착 시각 /  15 : 00", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeatPrice1 + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else if (num == 3) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat2(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "아시아나 항공", RepublicOfKoreaDTO.reserveSeat2Price, " 출발 시각 /  17 : 00  | 도착 시각 /  19 : 00 ", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat2Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else {
                    System.out.println("올바르지 않은 입력입니다 확인하여 다시 입력해주시길 바랍니다.");
                }
            } else if (num1 == 2) {
                System.out.println("선택하신 항공사는 대한 항공사 입니다.");
                System.out.println(" 1. 출발 시각 /  10 : 00  | 도착 시각 /  12 : 00 ");
                System.out.println(" 2. 출발 시각 /  13 : 00  | 도착 시각 /  15 : 00 ");
                System.out.println(" 3. 출발 시각 /  17 : 00  | 도착 시각 /  19 : 00 ");
                System.out.print("원하시는 탑승 시각의 번호를 입력해 주세요 > ");
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat3(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "대한 항공", RepublicOfKoreaDTO.reserveSeat3Price, " 1. 출발 시각 /  10 : 00  | 도착 시각 /  12 : 00 ", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat3Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else if (num == 2) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat4(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "대한 항공", RepublicOfKoreaDTO.reserveSeat4Price, " 출발 시각 /  13 : 00  | 도착 시각 /  15 : 00", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat4Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else if (num == 3) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat5(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "대한 항공", RepublicOfKoreaDTO.reserveSeat5Price, " 출발 시각 /  17 : 00  | 도착 시각 /  19 : 00 ", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat5Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else {
                    System.out.println("올바르지 않은 입력입니다 확인하여 다시 입력해주시길 바랍니다.");
                }
            } else if (num1 == 3) {
                System.out.println("선택하신 항공사는 JIN AIR 항공사 입니다.");
                System.out.println(" 1. 출발 시각 /  10 : 00  | 도착 시각 /  12 : 00 ");
                System.out.println(" 2. 출발 시각 /  13 : 00  | 도착 시각 /  15 : 00 ");
                System.out.println(" 3. 출발 시각 /  17 : 00  | 도착 시각 /  19 : 00 ");
                System.out.print("원하시는 탑승 시각의 번호를 입력해 주세요 > ");
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat6(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "JIN AIR", RepublicOfKoreaDTO.reserveSeat6Price, " 1. 출발 시각 /  10 : 00  | 도착 시각 /  12 : 00 ", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat6Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else if (num == 2) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat7(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "JIN AIR", RepublicOfKoreaDTO.reserveSeat7Price, " 출발 시각 /  13 : 00  | 도착 시각 /  15 : 00", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat7Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else if (num == 3) {
                    System.out.println("고객님이 선택하신 시간대 번호는 " + num + "입니다.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    System.out.println(" ");
                    System.out.println("예약 좌석을 번호로 지정해 주세요.");
                    System.out.println("비행기 여건상 좌석은 10자리로 제한합니다.");
                    System.out.println("좌석번호 0~9 까지의 번호중에서 골라주시길 바랍니다.");
                    int num2 = sc.nextInt();
                    boolean asiana = republicOfKoreaRepository.reserveSeat8(num2);
                    if (asiana) {
                        SeatReserveDTO seatReserveDTO = new SeatReserveDTO(mememail, "대한민국", "JIN AIR", RepublicOfKoreaDTO.reserveSeat8Price, " 출발 시각 /  17 : 00  | 도착 시각 /  19 : 00 ", num2);
                        boolean Check = reservationRepository.reserve(seatReserveDTO);
                        ReservationDTO reservationDTO = new ReservationDTO(seatReserveDTO.getMemEmail(), seatReserveDTO.getNationl(), seatReserveDTO.getAirline(), seatReserveDTO.reservePrice, seatReserveDTO.getTime(), seatReserveDTO.getSeatnumber());
                        reservationRepository.reseveDTO(reservationDTO);
                        System.out.println(seatReserveDTO);
                        if (Check) {
                            System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + " 번 좌석 입니다.");
                            System.out.println("비행기 값은 " + RepublicOfKoreaDTO.reserveSeat8Price + " 입니다. ");
                            System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                            CommonVariables.Seatreserve = String.valueOf(num2);
                            run = false;
                        } else {
                            System.out.println("오류로 인해 좌석이 배정되지 않았습니다.");
                        }
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                } else {
                    System.out.println("올바르지 않은 입력입니다 확인하여 다시 입력해주시길 바랍니다.");
                }
            } else if (num1 == 4) {
                run = false;
            }
        }

    }
}

