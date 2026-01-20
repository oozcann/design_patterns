package IteratorPattern.CinemaHall;

public class CinemaHall implements SeatCollection {

    private Seat[] seats;
    private int index;

    public CinemaHall (int capacity) {
        seats = new Seat[capacity];
    }

    public void addSeat(String seatNumber) {
        if (index < seats.length) {
            seats[index++] = new Seat(seatNumber);
        }
    }

    @Override
    public SeatIterator createIterator() {
        return new CinemaSeatIterator(seats);
    }
}
