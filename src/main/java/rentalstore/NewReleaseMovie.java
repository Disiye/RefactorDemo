package rentalstore;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double getThisAmount(int dayRental) {
        return dayRental * 3.0;
    }
}
