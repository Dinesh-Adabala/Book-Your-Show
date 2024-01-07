package com.ticketBooking.bookYourShow;

import java.sql.Time;
import java.util.Date;

public class BookingProcess {
    public BookYourShowOutput movieTicket(BookYourShowInput showInput){
        int price  ;
        char value = showInput.getRow();

        if(value == 'A' || value == 'B'|| value =='C')
        {
            price=150;
        } else if (value =='X' || value == 'Y' ||value =='Z') {
            price=50;

        }
        else {
            price=100;
        }
        BookYourShowOutput showOutput = new BookYourShowOutput(new Date(),new Time(2),1, showInput.getRow(),14,"PANJA",price);
        return showOutput;

    }


}
