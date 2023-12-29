package Repository.Member;

import DTO.Member.ReservationDTO;
import DTO.Member.SeatReserveDTO;
import Repository.National.JAPANRepository;
import Repository.National.RepublicOfKoreaRepository;
import Repository.National.USARepository;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {
    static List<ReservationDTO> reservationDTOList = new ArrayList<>();
    static List<SeatReserveDTO> seatReserveDTOList = new ArrayList<>();
    RepublicOfKoreaRepository republicOfKoreaRepository = new RepublicOfKoreaRepository();
    JAPANRepository japanRepository = new JAPANRepository();
    USARepository usaRepository = new USARepository();

    public boolean reserve(SeatReserveDTO seatReserveDTO) {
        return seatReserveDTOList.add(seatReserveDTO);

    }

    public void reseveDTO(ReservationDTO reservationDTO) {
        reservationDTOList.add(reservationDTO);
    }

    public SeatReserveDTO reserveprint(String memEmail) {
        SeatReserveDTO seatReserveDTO = null;
        for (int i = 0; i < seatReserveDTOList.size(); i++) {
            if (memEmail.equals(seatReserveDTOList.get(i).getMemEmail())) {
                seatReserveDTO = seatReserveDTOList.get(i);
            }
        }
        return seatReserveDTO;
    }

    public boolean depsitCheck(int deposit, String loginEmail) {
        boolean result = false;
        for (int j = 0; j < seatReserveDTOList.size(); j++) {
            if (loginEmail.equals(seatReserveDTOList.get(j).getMemEmail())) {
                if (deposit == seatReserveDTOList.get(j).getReservePrice()) {
                    result = true;
                } else if (deposit > seatReserveDTOList.get(j).getReservePrice()) {
                    System.out.println("더 많은 금액이 입력되었습니다. 재 입력 바랍니다.");
                    System.out.println("입금해야할 금액은 " + seatReserveDTOList.get(j).getReservePrice() + " 원 입니다.");
                } else {
                    System.out.println("더 적은 금액이 입력되었습니다. 재 입력바랍니다.");
                    System.out.println("입금해야할 금액은 " + seatReserveDTOList.get(j).getReservePrice() + " 원 입니다.");
                }
                break;
            }
        }
        return result;

    }

    public ReservationDTO reserveprintDTO(String memEmail) {
        ReservationDTO reservationDTO = null;
        for (int i = 0; i < reservationDTOList.size(); i++) {
            if (memEmail.equals(reservationDTOList.get(i).getMemEmail())) {
                reservationDTO = reservationDTOList.get(i);
            }
        }
        return reservationDTO;
    }

//    public void reserveCancle(String memEamil) {
//        for (int i = 0; i < reservationDTOList.size(); i++) {
//            if (memEamil.equals(reservationDTOList.get(i).getMemEmail())) {
//                reservationDTOList.remove(i);
//                if (memEamil.equals(seatReserveDTOList.get(i).getMemEmail())) {
//                    int result = seatReserveDTOList.get(i).getSeatnumber();
////                        seatReserveDTOList.remove(i);
//                    int[] resultArray = republicOfKoreaRepository.getArray();
//                    for (int num : resultArray) {
//                        if (memEamil.equals(reservationDTOList.get(i).getMemEmail())){
//                            num = 0;
//                            System.out.println("num = " + num);
//                        }
//
//                    }
//
//                }
//            }
//
//        }
//    }
public void reserveCancle(String memEmail) {
    for (int i = 0; i < reservationDTOList.size(); i++) {
        if (memEmail.equals(reservationDTOList.get(i).getMemEmail())) {
            reservationDTOList.remove(i);
            int seatNumber = seatReserveDTOList.get(i).getSeatnumber();
            seatReserveDTOList.remove(i); // 좌석 정보 삭제

            // 해당 좌석 번호의 정보를 0으로 초기화하는 작업
            int[] resultArray = republicOfKoreaRepository.getArray();
            if (seatNumber >= 0 && seatNumber < resultArray.length) {
                resultArray[seatNumber] = 0;
                System.out.println(resultArray[0]+resultArray[1]);
            }
            int[] resultArray1 = japanRepository.getArray();
            if (seatNumber >= 0 && seatNumber < resultArray1.length) {
                resultArray1[seatNumber] = 0;
                System.out.println(resultArray1[0]+resultArray1[1]);
            }
            int[] resultArray2 = usaRepository.getArray();
            if (seatNumber >= 0 && seatNumber < resultArray2.length) {
                resultArray2[seatNumber] = 0;
                System.out.println(resultArray2[0]+resultArray2[1]);
            }
        }
    }
}
}
//                republicOfKoreaRepository.set(resultArray); // 배열 업데이트






