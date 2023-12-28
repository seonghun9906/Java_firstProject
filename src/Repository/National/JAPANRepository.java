package Repository.National;

public class JAPANRepository {
    private static int[] seat = new int[10];
    private static int[] seat2 = new int[10];
    private static int[] seat3 = new int[10];
    private static int[] seat4 = new int[10];
    private static int[] seat5 = new int[10];
    private static int[] seat6 = new int[10];
    private static int[] seat7 = new int[10];
    private static int[] seat8 = new int[10];

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
        if(seatNumber >= 0 && seatNumber< seat2.length){
            if(seat2[seatNumber] == 0){
                seat2[seatNumber] = 1;
                return true;
            }
        }
        return false;
    } public boolean reserveSeat3(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat3.length){
            if(seat3[seatNumber] == 0){
                seat3[seatNumber] = 1;
                return true;
            }
        }
        return false;
    } public boolean reserveSeat4(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat4.length){
            if(seat4[seatNumber] == 0){
                seat4[seatNumber] = 1;
                return true;
            }
        }
        return false;
    } public boolean reserveSeat5(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat5.length){
            if(seat5[seatNumber] == 0){
                seat5[seatNumber] = 1;
                return true;
            }
        }
        return false;
    } public boolean reserveSeat6(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat6.length){
            if(seat6[seatNumber] == 0){
                seat6[seatNumber] = 1;
                return true;
            }
        }
        return false;
    } public boolean reserveSeat7(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat7.length){
            if(seat7[seatNumber] == 0){
                seat7[seatNumber] = 1;
                return true;
            }
        }
        return false;
    } public boolean reserveSeat8(int seatNumber){
        if(seatNumber >= 0 && seatNumber< seat8.length){
            if(seat8[seatNumber] == 0){
                seat8[seatNumber] = 1;
                return true;
            }
        }
        return false;
    }
}
