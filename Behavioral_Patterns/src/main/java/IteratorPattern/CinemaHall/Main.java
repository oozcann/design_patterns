package IteratorPattern.CinemaHall;

public class Main {
    public static void main(String[] args) {
        CinemaHall cinemaHall = new CinemaHall(3);
        cinemaHall.addSeat("A1");
        cinemaHall.addSeat("A2");
        cinemaHall.addSeat("A3");

        SeatIterator iterator = cinemaHall.createIterator();

        while (iterator.hasNext()) {
            Seat seat = iterator.next();
            System.out.println("Seat: " + seat.getSeatNumber());
        }

    }
}
