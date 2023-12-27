package Repository;

import DTO.MemberDTO;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);

    }
}
