package Repository;

import commonVariables.CommonVariables;
import DTO.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    CommonVariables loginmethod = new CommonVariables();
    List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);

    }

    public MemberDTO login(String loginEamil, String loginPw) {

        for (MemberDTO memberDTO : memberDTOList) {
            if(loginEamil.equals(memberDTO.getEmail())&&loginPw.equals(memberDTO.getPw()) ){
                return memberDTO;
            }
        }return null;
    }
}
