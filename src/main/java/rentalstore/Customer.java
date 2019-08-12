package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public List<Rental> getRentals() {
        return rentals;
    }


    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return new StatementText().statement(this);
    }

    public String statementHtml(){
        return new StatementHtml().statement(this);
    }

    String getRentalTitleHtml() {
        return "Rental Record for " + getName() + "<br>";
    }

    String getRentalTitle() {
        return "Rental Record for " + getName() + "\n";
    }

    int getTotalFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        for(Rental each : this.rentals){
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    double getTotalAmount() {
        return this.rentals.stream().mapToDouble(Rental::getThisAmount).sum();
    }


}
