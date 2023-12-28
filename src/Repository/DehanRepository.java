package Repository;



public class DehanRepository {

    private int[] seat = new int[10];
    private static int[] seat2 = new int[10];
    private static int[] seat3 = new int[10];

    public int[] getseat(){
        return seat;
    }
    public boolean reserveSeat3(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat.length){
            if(seat[seatNumber] == 0){
                seat[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }
    public boolean reserveSeat4(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat2.length){
            if(seat2[seatNumber] == 0){
                seat2[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }
    public boolean reserveSeat5(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat3.length){
            if(seat3[seatNumber] == 0){
                seat3[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }


    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }
}
