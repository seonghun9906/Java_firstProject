package Repository.Member;

import DTO.Member.ReservationDTO;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {
   static List<ReservationDTO> reservationDTOList = new ArrayList<>();

    public Boolean reserve(ReservationDTO reservationDTO1) {
        return reservationDTOList.add(reservationDTO1);
    }

    public ReservationDTO reserveprint(String memEmail) {
        ReservationDTO reservationDTO = null;
        for (int i = 0; i < reservationDTOList.size(); i++) {
            if (memEmail.equals(reservationDTOList.get(i).getMemEmail())) {
                reservationDTO = reservationDTOList.get(i);
            }
        }
        return reservationDTO;
    }

    public boolean depsitCheck(int deposit , String loginEmail) {
        boolean result = false;
        for (int j = 0; j <reservationDTOList.size() ; j++) {
            if(loginEmail.equals(reservationDTOList.get(j).getMemEmail())){
            if(deposit == reservationDTOList.get(j).getReservePrice()){
                result = true;
            }else if(deposit > reservationDTOList.get(j).getReservePrice()){
                System.out.println("더 많은 금액이 입력되었습니다. 재 입력 바랍니다.");
                System.out.println("입금해야할 금액은 " +reservationDTOList.get(j).getReservePrice() + " 원 입니다." );
            }else{
                System.out.println("더 적은 금액이 입력되었습니다. 재 입력바랍니다.");
                System.out.println("입금해야할 금액은 " +reservationDTOList.get(j).getReservePrice() + " 원 입니다." );
            }
            break;
            }
        }return result;

    }
}

