import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(new Seat(1,false));
        seats.add(new Seat(2,false));
        seats.add(new Seat(3,true));
        seats.add(new Seat(4,true));
        seats.add(new Seat(5,true));
        seats.add(new Seat(6,true));
        seats.add(new Seat(7,true));
        seats.add(new Seat(8,false));
        seats.add(new Seat(9,false));
        seats.add(new Seat(10,false));
        seats.add(new Seat(11,false));
        seats.add(new Seat(12,false));


        System.out.println(Algorithm.SeatAlgorithm(seats, 4));

    }
}
