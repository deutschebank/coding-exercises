package org.xpdojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.xpdojo.Movie.*;

public class VideoStoreTest {
    private Customer customer;
    private Movie newRelease1;
    private Movie newRelease2;
    private Movie childrens;
    private Movie regular1;
    private Movie regular2;
    private Movie regular3;

    @BeforeEach
    protected void setUp() {
        customer = new Customer("Customer Name");
        newRelease1 = new Movie("New Release 1", NEW_RELEASE);
        newRelease2 = new Movie("New Release 2", NEW_RELEASE);
        childrens = new Movie("Childrens", CHILDREN);
        regular1 = new Movie("Regular 1", REGULAR);
        regular2 = new Movie("Regular 2", REGULAR);
        regular3 = new Movie("Regular 3", REGULAR);
    }

    private void assertAmountAndPointsForReport(double expectedAmount, int expectedPoints) {
//        assertEquals(expectedAmount, customer.getAmountOwed());
//        assertEquals(expectedPoints, customer.getFrequentRenterPoints());
    }

    @Test
    public void singleNewReleaseStatement() {
        customer.addRental(new Rental(newRelease1, 3));
        customer.statement();
        assertAmountAndPointsForReport(9.0, 2);
    }

    @Test
    public void dualNewReleaseStatement() {
        customer.addRental(new Rental(newRelease1, 3));
        customer.addRental(new Rental(newRelease2, 3));
        customer.statement();
        assertAmountAndPointsForReport(18.0, 4);
    }

    @Test
    public void testSingleChildrensStatement() {
        customer.addRental(new Rental(childrens, 3));
        customer.statement();
        assertAmountAndPointsForReport(1.5, 1);
    }

    @Test
    public void multipleRegularStatement() {
        customer.addRental(new Rental(regular1, 1));
        customer.addRental(new Rental(regular2, 2));
        customer.addRental(new Rental(regular3, 3));
        customer.statement();
        assertAmountAndPointsForReport(7.5, 3);
    }

    @Test
    public void rentalStatementFormat() {
        customer.addRental(new Rental(regular1, 1));
        customer.addRental(new Rental(regular2, 2));
        customer.addRental(new Rental(regular3, 3));

        assertEquals(
                "Rental Record for Customer Name\n" +
                        "\tRegular 1\t2.0\n" +
                        "\tRegular 2\t2.0\n" +
                        "\tRegular 3\t3.5\n" +
                        "You owed 7.5\n" +
                        "You earned 3 frequent renter points\n",
                customer.statement());
    }
}