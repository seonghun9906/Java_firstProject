package DTO.Member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MemberDTO {
    public Long id;
    public String Email;
    public String Pw;
    public String MemberName;
    public String memberMobile;
    public String SignupAt;
    public String LoginAt;
    public MemberDTO(){

    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", Pw='" + Pw + '\'' +
                ", MemberName='" + MemberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", SignupAt='" + SignupAt + '\'' +
                ", LoginAt='" + LoginAt + '\'' +
                ", idvalue=" + idvalue +
                '}';
    }

    public Long idvalue = 1L;
    public MemberDTO(String email, String pw, String memberName, String memberMobile) {
        this.id = idvalue;
        Email = email;
        Pw = pw;
        MemberName = memberName;
        this.memberMobile = memberMobile;
        SignupAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LoginAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPw() {
        return Pw;
    }

    public void setPw(String pw) {
        Pw = pw;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getSignupAt() {
        return SignupAt;
    }

    public void setSignupAt(String signupAt) {
        SignupAt = signupAt;
    }

    public String getLoginAt() {
        return LoginAt;
    }

    public void setLoginAt(String loginAt) {
        LoginAt = loginAt;
    }
}
