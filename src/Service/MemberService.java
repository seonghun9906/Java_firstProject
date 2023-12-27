package Service;

import DTO.MemberDTO;
import Repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner sc = new Scanner(System.in);
    public void save() {
        System.out.println("----------------------------------------------");
        System.out.println("고객님의 회원가입을 위해 몇가지 정보를 입력해 주세요.");
        System.out.println("-----------------------------------------------");
        System.out.print("이름 > ");
        String memberName = sc.next();
        System.out.print("Eamil > ");
        String memberEmail = sc.next();
        System.out.print("PW > ");
        String memberPw = sc.next();
        System.out.print("핸드폰 번호 > ");
        String memberMobile = sc.next();

        MemberDTO memberDTO = new MemberDTO(memberName,memberEmail,memberPw,memberMobile);
        boolean SignUp = memberRepository.save(memberDTO);
        if(SignUp){
            System.out.println("회원가입이 완료되었습니다.");
            System.out.println("저희 OOO여행사에 회원가입 해주셔서 감사합니다.");
        }else{
            System.out.println("회원가입에 실패하였습니다. 다시 회원가입 해주시길 바랍니다.");
        }
    }
}
