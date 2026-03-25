package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getFrequentRenterPoints() {
        // add frequent renter points
        int result = 1;
        // add bonus for a two day new release rental
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() > 1)
            result++;
        return result;
    }

    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}
