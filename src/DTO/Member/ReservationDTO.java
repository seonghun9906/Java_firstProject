package DTO.Member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReservationDTO extends MemberDTO {
    public Long id;
    public String memEmail;
    public String Nationl;
    public String Airline;
    public int reservePrice;
    public String time;
    public int seatnumber;

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String depsoitAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }

    public String getNationl() {
        return Nationl;
    }

    public void setNationl(String nationl) {
        Nationl = nationl;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String airline) {
        Airline = airline;
    }

    public int getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(int reservePrice) {
        this.reservePrice = reservePrice;
    }


    public String getDepsoitAt() {
        return depsoitAt;
    }

    public void setDepsoitAt(String depsoitAt) {
        this.depsoitAt = depsoitAt;
    }


    public static long idvalue = 1L;

    public ReservationDTO() {

    }

    public ReservationDTO(String memEmail, String nationl, String airline, int reservePrice, String time, int seatnumber) {
        this.id = idvalue++;
        this.memEmail = memEmail;
        this.Nationl = nationl;
        this.Airline = airline;
        this.reservePrice = reservePrice;
        this.time = time;
        this.seatnumber = seatnumber;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                " 관리 =" + id +
                ", 회원 Eamil ='" + memEmail + '\'' +
                ", 국가 ='" + Nationl + '\'' +
                ", 항공사 ='" + Airline + '\'' +
                ", 출발시각/도착시각 ='" + time + '\'' +
                ", 좌석번호 " + seatnumber +
                ", 입금 금액 =" + reservePrice +
            '}';
}
}
