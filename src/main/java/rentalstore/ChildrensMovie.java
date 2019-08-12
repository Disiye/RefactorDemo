package rentalstore;

public class ChildrensMovie extends Movie {

    public ChildrensMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double getThisAmount(int dayRental) {
        double thisAmount = 1.5;
        if (dayRental > 3) {
            thisAmount += (dayRental - 3) * 1.5;
        }
        return thisAmount;
    }
}
