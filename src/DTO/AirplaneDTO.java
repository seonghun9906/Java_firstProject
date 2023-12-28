package DTO;


import Repository.AsianaRepository;
import Repository.DehanRepository;
import Repository.JinAirRepository;
import Repository.ReceiptRepository;

public class AirplaneDTO {
    private final AsianaRepository aianaDTO;
    private final AsianaRepository asianaPrice;
    private final DehanRepository dehanDTO;
    private final JinAirRepository jinAir;
    public static int reserveSeatPrice;
    public static int reserveSeatPrice1;
    public static int reserveSeat2Price;
    public static int reserveSeat3Price;
    public static int reserveSeat4Price;
    public static int reserveSeat5Price;
    public static int reserveSeat6Price;
    public static int reserveSeat7Price;
    public static int reserveSeat8Price;


    public int getReserveSeat2Price() {
        return reserveSeat2Price;
    }

    public void setReserveSeat2Price(int reserveSeat2Price) {
        this.reserveSeat2Price = reserveSeat2Price;
    }

    public int getReserveSeat3Price() {
        return reserveSeat3Price;
    }

    public void setReserveSeat3Price(int reserveSeat3Price) {
        this.reserveSeat3Price = reserveSeat3Price;
    }

    public int getReserveSeat4Price() {
        return reserveSeat4Price;
    }

    public void setReserveSeat4Price(int reserveSeat4Price) {
        this.reserveSeat4Price = reserveSeat4Price;
    }

    public int getReserveSeat5Price() {
        return reserveSeat5Price;
    }

    public void setReserveSeat5Price(int reserveSeat5Price) {
        this.reserveSeat5Price = reserveSeat5Price;
    }

    public int getReserveSeat6Price() {
        return reserveSeat6Price;
    }

    public void setReserveSeat6Price(int reserveSeat6Price) {
        this.reserveSeat6Price = reserveSeat6Price;
    }

    public int getReserveSeat7Price() {
        return reserveSeat7Price;
    }

    public void setReserveSeat7Price(int reserveSeat7Price) {
        this.reserveSeat7Price = reserveSeat7Price;
    }

    public int getReserveSeat8Price() {
        return reserveSeat8Price;
    }

    public void setReserveSeat8Price(int reserveSeat8Price) {
        this.reserveSeat8Price = reserveSeat8Price;
    }


    public AirplaneDTO() {
        this.aianaDTO = new AsianaRepository();
        this.dehanDTO = new DehanRepository();
        this.jinAir = new JinAirRepository();
        this. asianaPrice = new AsianaRepository();
        reserveSeatPrice = 100000;
        reserveSeatPrice1 = 110000;
        reserveSeat2Price = 120000 ;
        reserveSeat3Price = 140000 ;
        reserveSeat4Price = 90000 ;
        reserveSeat5Price = 110000 ;
        reserveSeat6Price = 130000 ;
        reserveSeat7Price = 149000 ;
        reserveSeat8Price = 160000 ;
    }

    public boolean AsianaPrice(int Deposit){
        return asianaPrice.Asianaprice(Deposit);
    }

    public boolean reserveSeat(int seatNumber) {
        return aianaDTO.reserveSeat(seatNumber);
    }


    public boolean reserveSeat1(int seatNumber) {
        return aianaDTO.reserveSeat1(seatNumber);
    }


    public boolean reserveSeat2(int seatNumber) {
        return aianaDTO.reserveSeat2(seatNumber);
    }


    public boolean reserveSeat3(int seatNumber) {
        return dehanDTO.reserveSeat3(seatNumber);
    }


    public boolean reserveSeat4(int seatNumber) {
        return dehanDTO.reserveSeat4(seatNumber);
    }


    public boolean reserveSeat5(int seatNumber) {
        return dehanDTO.reserveSeat5(seatNumber);
    }

    public boolean reserveSeat6(int seatNumber) {
        return jinAir.reserveSeat6(seatNumber);
    }


    public boolean reserveSeat7(int seatNumber) {
        return jinAir.reserveSeat7(seatNumber);
    }


    public boolean reserveSeat8(int seatNumber) {
        return jinAir.reserveSeat8(seatNumber);
    }



}

