package Service;

import DTO.AirplaneDTO;
import DTO.ReservationDTO;
import Repository.ReceiptRepository;

import java.util.Scanner;

public class DOKYOService {
    AirplaneDTO airplaneRepository = new AirplaneDTO();
    ReservationDTO reservationDTO = new ReservationDTO();

    Scanner sc= new Scanner(System.in);
    int num = 0;


    public void DOKYO() {
    boolean run = true;
        reservationDTO.Nationl = "도쿄";
        while (run) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. 아시아나항공 | 2. 대한항공 | 3. 진 에어 | 4. 전 메뉴 돌아가기 ");
            System.out.println("------------------------------------------------------------------");
            System.out.print("원하시는 항공사의 번호를 입력해주세요 > ");
            num = sc.nextInt();
            if (num == 1) {
                System.out.println(" 고객님이 선택하신 항공은 아시아나 항공입니다. ");
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
                    int num1 = sc.nextInt();

                    boolean asiana = airplaneRepository.reserveSeat(num1);
                    if (asiana) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num1 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
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

                    boolean Dehan = airplaneRepository.reserveSeat1(num2);
                    if (Dehan) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
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
                    int num3 = sc.nextInt();

                    boolean Jin = airplaneRepository.reserveSeat2(num3);
                    if (Jin) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num3 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                }
            } else if (num == 2) {
                System.out.println(" 고객님이 선택하신 항공은 대한항공 입니다. ");
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
                    int num1 = sc.nextInt();

                    boolean asiana = airplaneRepository.reserveSeat3(num1);
                    if (asiana) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num1 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
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

                    boolean Dehan = airplaneRepository.reserveSeat4(num2);
                    if (Dehan) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
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
                    int num3 = sc.nextInt();

                    boolean Jin = airplaneRepository.reserveSeat5(num3);
                    if (Jin) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num3 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                }
            } else if (num == 3) {
                System.out.println(" 고객님이 선택하신 항공은 Jin Air 입니다. ");
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
                    int num1 = sc.nextInt();

                    boolean asiana = airplaneRepository.reserveSeat6(num1);
                    if (asiana) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num1 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
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

                    boolean Dehan = airplaneRepository.reserveSeat7(num2);
                    if (Dehan) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num2 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
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
                    int num3 = sc.nextInt();

                    boolean Jin = airplaneRepository.reserveSeat8(num3);
                    if (Jin) {
                        System.out.println("좌석 배정이 완료되었습니다. 고객님의 좌석 번호는 " + num3 + "번 좌석 입니다.");
                        System.out.println("전 메뉴로 돌아가 입금을 부탁드립니다.");
                    } else {
                        System.out.println("이미 좌석이 배정되어 있거나 입력범위 내에서 다시 입력해 주세요.");
                    }
                }
            } else if (num == 4) {
                run = false;
            }
        }
    }
}
