package Repository.Member;

import DTO.Member.MemberDTO;
import DTO.Member.ReservationDTO;
import DTO.Member.SeatReserveDTO;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {
    static List<ReservationDTO> reservationDTOList = new ArrayList<>();
     List<MemberDTO> memberDTOList = new ArrayList<>();
    static List<SeatReserveDTO> seatReserveDTOList = new ArrayList<>();

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

    public void reserveCancle(String memEamil) {
        for (int i = 0; i < reservationDTOList.size(); i++) {
            for (int j = 0; j < seatReserveDTOList.size(); j++) {
                if (memEamil.equals(seatReserveDTOList.get(i).getMemEmail())) {
                    if (memEamil.equals(reservationDTOList.get(i).getMemEmail())) {
                        reservationDTOList.remove(reservationDTOList.get(i));
                        seatReserveDTOList.remove(seatReserveDTOList.get(j));
                    }
                }

            }
        }
    }

    public MemberDTO reseveCheck(String memEmail) {
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if(memEmail.equals(memberDTOList.get(i).getEmail())){
              MemberDTO memberDTO = memberDTOList.get(i);
               return memberDTO;
            }
        }return null;
    }
}




