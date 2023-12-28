package Repository;

import DTO.AirplaneDTO;
import DTO.ReservationDTO;
import commonVariables.CommonVariables;
import DTO.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    CommonVariables loginmethod = new CommonVariables();
    List<MemberDTO> memberDTOList = new ArrayList<>();
    List<AirplaneDTO> airplaneDTOS = new ArrayList<>();
    List<ReservationDTO> reservationDTOList = new ArrayList<>();

    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);

    }

    public boolean emailCheck(String emailCheck) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (emailCheck.equals(memberDTOList.get(i).getEmail())) {
                result = false;
            }
        }
        return result;
    }

    public MemberDTO login(String loginEamil, String loginPw) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (loginEamil.equals(memberDTO.getEmail()) && loginPw.equals(memberDTO.getPw())) {
                return memberDTO;
            }
        }
        return null;
    }


    public void memList(String memEmail) {
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if (memEmail.equals(memberDTOList.get(i).getEmail())){
             System.out.println(memberDTOList.get(i));
            }
        }
    }



    public void reservation(String memEmail) {
        for (int i = 0; i < memberDTOList.size() ; i++) {
            if(memEmail.equals(memberDTOList.get(i).getEmail())){
                System.out.println(reservationDTOList.get(i));
            }
        }
    }
}

