package com.ticketBooking.bookYourShow;

import java.sql.Time;
import java.util.Date;

public class BookYourShowInput {
    private String phoneNumber;
    private String movieName;
    private Date movieDay;
    private Time showTime;
    private int numberOfSeats;
    private char row;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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

    private int seatNo;

    public BookYourShowInput(String phoneNumber, String movieName, Date movieDay, Time showTime, int numberOfSeats, char row, int seatNo) {
        this.phoneNumber = phoneNumber;
        this.movieName = movieName;
        this.movieDay = movieDay;
        this.showTime = showTime;
        this.numberOfSeats = numberOfSeats;
        this.row = row;
        this.seatNo = seatNo;
    }

}