package rentalstore;

public class StatementHtml extends Statement {

    protected String getFooter(Customer customer, String result) {
        result += "Amount owed is " + customer.getTotalAmount() + "<br>";
        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points<br>";
        return result;
    }

    protected String getEachLine(String result, Rental each) {
        result += "&nbsp;&nbsp;&nbsp;&nbsp;" + each.getMovie().getTitle() + "&nbsp;" + each.getThisAmount() + "<br>";
        return result;
    }

    protected String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "<br>";
    }
}
