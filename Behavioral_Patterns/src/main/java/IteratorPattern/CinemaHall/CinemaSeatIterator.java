package IteratorPattern.CinemaHall;

public class CinemaSeatIterator implements SeatIterator {

    private Seat[] seats;
    private int position = 0;

    public CinemaSeatIterator(Seat[] seats) {
        this.seats = seats;
    }

    @Override
    public boolean hasNext() {
        return position < seats.length && seats[position] != null;
    }

    @Override
    public Seat next() {
        return seats[position++];
    }
}
