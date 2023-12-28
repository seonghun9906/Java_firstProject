package Repository;


import DTO.AirplaneDTO;

import java.util.ArrayList;
import java.util.List;

public class AsianaRepository {
    List<AirplaneDTO> airplaneDTOS = new ArrayList<>();

    private static int[] seat = new int[10];
    private static int[] seat2 = new int[10];
    private static int[] seat3 = new int[10];


    public int[] getseat(){
        return seat;
    }
    public boolean reserveSeat(int seatNumber){

        if(seatNumber >= 0 && seatNumber< seat.length){
            if(seat[seatNumber] == 0){
                seat[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }
    public boolean reserveSeat1(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat2.length){
            if(seat2[seatNumber] == 0){
                seat2[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }
    public boolean reserveSeat2(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat3.length){
            if(seat3[seatNumber] == 0){
                seat3[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }

    public AsianaRepository(){

    }

    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }

    public boolean Asianaprice(int deposit) {
        boolean result = false;
            if(deposit == AirplaneDTO.reserveSeatPrice){
                result = true;
            }
        return result;
    }
    public boolean Asianaprice2(int deposit) {
        boolean result = false;
        if(deposit == AirplaneDTO.reserveSeatPrice1){
            result = true;
        }
        return result;
    }
    public boolean Asianaprice3(int deposit) {
        boolean result = false;
        if(deposit == AirplaneDTO.reserveSeat2Price){
            result = true;
        }
        return result;
    }
}
