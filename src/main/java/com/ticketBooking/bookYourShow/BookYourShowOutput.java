package com.ticketBooking.bookYourShow;

import java.sql.Time;
import java.util.Date;

public class BookYourShowOutput {
    public BookYourShowOutput(Date movieDay, Time showTime, int numberOfSeats, char row, int seatNo, String movieName, int amount) {
        this.movieDay = movieDay;
        this.showTime = showTime;
        this.numberOfSeats = numberOfSeats;
        this.row = row;
        this.seatNo = seatNo;
        this.movieName = movieName;
        this.amount = amount;
    }

    private Date movieDay;
    private Time showTime;
    private int numberOfSeats;
    private char row;
    private int seatNo;
    private String movieName;
    private int amount;
   // private String seatSlection;

    public int getAmount() {
        return amount;
    }



    public Date getMovieDay() {
        return movieDay;
    }

    public void setMovieDay(Date movieDay) {
        this.movieDay = movieDay;
    }

    public Time getShowTime() {
        return showTime;
    }

    public void setShowTime(Time showTime) {
        this.showTime = showTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
