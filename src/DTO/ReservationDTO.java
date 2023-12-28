package DTO;

import Repository.ReceiptRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReservationDTO {
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
        this.depsoitAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "id=" + id +
                ", memEmail='" + memEmail + '\'' +
                ", Nationl='" + Nationl + '\'' +
                ", Airline='" + Airline + '\'' +
                ", reservePrice=" + reservePrice +
                ", time='" + time + '\'' +
                ", seatnumber=" + seatnumber +
                ", depsoitAt='" + depsoitAt + '\'' +
                '}';
    }
}
