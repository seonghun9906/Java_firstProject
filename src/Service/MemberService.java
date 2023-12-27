package Service;

import DTO.MemberDTO;
import Repository.MemberRepository;
import commonVariables.CommonVariables;

import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner sc = new Scanner(System.in);
    public void save() {
        System.out.println("----------------------------------------------");
        System.out.println("고객님의 회원가입을 위해 몇가지 정보를 입력해 주세요.");
        System.out.println("-----------------------------------------------");
        System.out.print("Eamil > ");
        String memberEmail = sc.next();
        System.out.print("PW > ");
        String memberPw = sc.next();
        System.out.print("이름 > ");
        String memberName = sc.next();
        System.out.print("핸드폰 번호 > ");
        String memberMobile = sc.next();

        MemberDTO memberDTO = new MemberDTO(memberEmail,memberPw,memberName,memberMobile);
        boolean SignUp = memberRepository.save(memberDTO);
        if(SignUp){
            System.out.println("회원가입이 완료되었습니다.");
            System.out.println("저희 OOO여행사에 회원가입 해주셔서 감사합니다.");
        }else{
            System.out.println("회원가입에 실패하였습니다. 다시 회원가입 해주시길 바랍니다.");
        }
    }

    public void login() {
        System.out.println("--------------------------------------------");
        System.out.println("    로그인을 위하여 Eamil 과 Pw를 입력해주세요.   ");
        System.out.println("--------------------------------------------");
        System.out.print("Eamil > ");
        String loginEamil = sc.next();
        System.out.print("Pw > ");
        String loginPw = sc.next();

        MemberDTO login = memberRepository.login(loginEamil,loginPw);
        if(login != null){
            System.out.println("로그인 되었습니다.");
            CommonVariables.longinEmail = loginEamil;
            System.out.println(loginEamil + " 님 환영합니다. ");

        }else{
            System.out.println("로그인에 실패하였습니다.");
            System.out.println("Eamil 또는 Pw를 다시 확인하여주시기 바랍니다.");
        }
    }

    public void logout() {
        if(CommonVariables.longinEmail != null){
            CommonVariables.longinEmail = null;
            System.out.println("로그아웃 되었습니다.");
        }else{
            System.out.println("로그인 상태가 아닙니다.");
            System.out.println("로그인 해주시길 바랍니다.");
        }
    }
}
