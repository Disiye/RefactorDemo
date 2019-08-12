package rentalstore;

public class StatementText extends Statement {

    protected String getFooter(Customer customer, String result) {
        result += "Amount owed is " + customer.getTotalAmount() + "\n";
        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    protected String getEachLine(String result, Rental each) {
        result += "\t" + each.getMovie().getTitle() + "\t" + each.getThisAmount() + "\n";
        return result;
    }

    protected String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
