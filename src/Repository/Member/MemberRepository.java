package Repository.Member;

import DTO.National.RepublicOfKoreaDTO;
import DTO.Member.ReservationDTO;
import commonVariables.CommonVariables;
import DTO.Member.MemberDTO;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    CommonVariables loginmethod = new CommonVariables();
    List<MemberDTO> memberDTOList = new ArrayList<>();
    List<RepublicOfKoreaDTO> republicOfKoreaDTOS = new ArrayList<>();
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
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memEmail.equals(memberDTOList.get(i).getEmail())) {
                System.out.println(memberDTOList.get(i));
            }
        }
    }


    public void reservation(String memEmail) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memEmail.equals(memberDTOList.get(i).getEmail())) {
                System.out.println(reservationDTOList.get(i));
            }
        }
    }


    public boolean logout(String LoginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (LoginEmail.equals(memberDTOList.get(i).getEmail())) {
                if (CommonVariables.longinEmail != null) {
                    CommonVariables.longinEmail = null;
                    result = true;
                }
            }
        }
        return result;
    }

    public MemberDTO Check(String longinEmail) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (longinEmail.equals(memberDTOList.get(i).getEmail())) {
                memberDTO = memberDTOList.get(i);
                return memberDTO;
            }
        }
        return memberDTO;
    }
}


