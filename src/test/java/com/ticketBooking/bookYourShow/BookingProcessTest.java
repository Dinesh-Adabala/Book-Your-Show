package com.ticketBooking.bookYourShow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.Date;

public class BookingProcessTest {
    @Test
    public void printMovieTicketFirstClass() {
        BookingProcess booking = new BookingProcess();
        BookYourShowInput showInput = new BookYourShowInput("9000308335", "PANJA", new Date(), new Time(8), 5, 'A', 1);
        BookYourShowOutput ticket = booking.movieTicket(showInput);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150, ticket.getAmount());

    }

    @Test
    public void printMovieTicketSecondClass() {
        BookingProcess booking = new BookingProcess();
        BookYourShowInput showInput = new BookYourShowInput("9000308335", "PANJA", new Date(), new Time(8), 5, 'G', 1);
        BookYourShowOutput ticket = booking.movieTicket(showInput);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(100, ticket.getAmount());
    }

    @Test
    public void printMovieTicketLowerClass() {
        BookingProcess booking = new BookingProcess();
        BookYourShowInput showInput = new BookYourShowInput("9000308335", "PANJA", new Date(), new Time(8), 5, 'Y', 1);
        BookYourShowOutput ticket = booking.movieTicket(showInput);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(50, ticket.getAmount());
    }
}
