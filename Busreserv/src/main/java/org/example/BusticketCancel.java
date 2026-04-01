package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class BusticketCancel {
    int booking_id;

    public BusticketCancel() {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the your booking id :");
        booking_id=n.nextInt();
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }
    public  boolean datapresent() throws SQLException {
        CancellationDAO cancellationDAO=new CancellationDAO();
        int booked=CancellationDAO.getBookedDetails(booking_id);
        int a=booked;
        //System.out.println("Output from getBooked Details"+a);
        if(booked>0){
            return true;
        }
        else {
            return false;
        }
    }
}
