package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private rentalstore.Customer customer = new Customer("Emilio");

    @Test
    public void should_return_Rental_Record_when_Customer_name_is_Emilio(){
        String statement =  customer.statement();
        assertEquals("Rental Record for Emilio\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
    }

    @Test
    public void should_return_Amount_is_6point5_when_Movie_Role_is_REGULAR(){
        Movie movie = new RegularMovie("MovieA",Movie.REGULAR);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement =  customer.statement();
        assertEquals("Rental Record for Emilio\n\tMovieA\t6.5\nAmount owed is 6.5\nYou earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Amount_is_15point0_when_Movie_Role_is_NEW_RELEASE(){
        Movie movie = new NewReleaseMovie("MovieA",Movie.NEW_RELEASE);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement =  customer.statement();
        assertEquals("Rental Record for Emilio\n\tMovieA\t15.0\nAmount owed is 15.0\nYou earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_Amount_is_6point4_when_Movie_Role_is_CHILDRENS(){
        Movie movie = new ChildrensMovie("MovieA",Movie.CHILDRENS);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement =  customer.statement();
        assertEquals("Rental Record for Emilio\n\tMovieA\t4.5\nAmount owed is 4.5\nYou earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Statement_when_has_two_Rental(){
        Movie movie = new ChildrensMovie("MovieA",Movie.CHILDRENS);
        Rental rentalFirst = new Rental(movie,5);
        Rental rentalSecond = new Rental(movie,5);
        customer.addRental(rentalFirst);
        customer.addRental(rentalSecond);
        String statement =  customer.statement();
        assertEquals("Rental Record for Emilio\n\tMovieA\t4.5\n\tMovieA\t4.5\nAmount owed is 9.0\nYou earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_StatementHtml_when_Customer_name_is_Emilio(){
        String statement =  customer.statementHtml();
        assertEquals("Rental Record for Emilio<br>Amount owed is 0.0<br>You earned 0 frequent renter points<br>", statement);
    }

}
