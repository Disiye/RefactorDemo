package rentalstore;

public abstract class Statement {
    public String statement(rentalstore.Customer customer) {
        String result = getHeader(customer);
        for (Rental each : customer.getRentals()) {
            result = getEachLine(result, each);
        }
        result = getFooter(customer, result);
        return result;
    }

    protected abstract String getFooter(Customer customer, String result);

    protected abstract String getEachLine(String result, Rental each);

    protected abstract String getHeader(Customer customer);

}
