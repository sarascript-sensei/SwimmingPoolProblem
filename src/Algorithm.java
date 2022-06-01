import java.util.ArrayList;

public class Algorithm {


    public static ArrayList<Seat> SeatAlgorithm(ArrayList<Seat> seats, int k) {
        ArrayList<Seat> freeSeats = checkFreeSeat(seats);
        if (freeSeats.size() < k) {
            return null;
        }
        if (checkSeatClose(freeSeats) != true) {
            return null;
        }
        if (25 > Math.round((((double) k)/seats.size())*100)) {
            for (int i = 0, s = 0; s != k; i++) {
                if (seats.get(i).isFree) {
                    seats.get(i).setFree(false);
                    s++;
                }
            }
        } else {
            for (int i = seats.size()-1, s = 0; s != k; i--) {
                if (seats.get(i).isFree) {
                    seats.get(i).setFree(false);
                    s++;
                }
            }
        }
        return seats;
    }


    private static ArrayList<Seat> checkFreeSeat(ArrayList<Seat> seats) {
        var result = new ArrayList<Seat>();
        for (Seat seat : seats) {
            if (seat.isFree) {
                result.add(seat);
            }
        }
        return result;
    }

    private static boolean checkSeatClose(ArrayList<Seat> seats) {
        for (int i = 0; i < seats.size() - 1; i++) {
            if (seats.get(i).id != seats.get(i + 1).getId() - 1) {
                return false;
            }
        }
        return true;
    }

}
