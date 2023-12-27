package DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class reservationDTO {
    public String MemberName;
    public String memberMobile;
    public int Deposit;
    public int SeatNumber;
    public String Reservation;
    public String AirplaneName;
    public  String FlghtTime;
    public String DepartureTime;
    public String receipt;
    public String DepositAt;
    public String cancleAt;

    public reservationDTO(String memberName, String memberMobile, int deposit, int seatNumber, String reservation, String airplaneName, String flghtTime, String departureTime, String receipt) {
        MemberName = memberName;
        this.memberMobile = memberMobile;
        Deposit = deposit;
        SeatNumber = seatNumber;
        Reservation = reservation;
        AirplaneName = airplaneName;
        FlghtTime = flghtTime;
        DepartureTime = departureTime;
        this.receipt = receipt;
        DepositAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.cancleAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
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

    public int getDeposit() {
        return Deposit;
    }

    public void setDeposit(int deposit) {
        Deposit = deposit;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public String getReservation() {
        return Reservation;
    }

    public void setReservation(String reservation) {
        Reservation = reservation;
    }

    public String getAirplaneName() {
        return AirplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        AirplaneName = airplaneName;
    }

    public String getFlghtTime() {
        return FlghtTime;
    }

    public void setFlghtTime(String flghtTime) {
        FlghtTime = flghtTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getDepositAt() {
        return DepositAt;
    }

    public void setDepositAt(String depositAt) {
        DepositAt = depositAt;
    }

    public String getCancleAt() {
        return cancleAt;
    }

    public void setCancleAt(String cancleAt) {
        this.cancleAt = cancleAt;
    }
}
