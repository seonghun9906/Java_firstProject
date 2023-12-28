package Repository;

import DTO.ReservationDTO;

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
}

