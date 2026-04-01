package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentDAO {
    public void addPayment(Payment p) throws SQLException {
        String query ="Insert into payment values(?,?,?,?)";
        Connection c=DbConnection.getconnection();
        PreparedStatement pst=c.prepareStatement(query);
        pst.setInt(1,p.getBookingId());
        pst.setDouble(2,p.getAmount());
        pst.setString(3,p.getMethod());
        pst.setString(4,p.getStatus());
        pst.executeUpdate();
    }
    public static void printTicket(int bookingId) throws Exception {
        Connection c = DbConnection.getconnection();
        String bookingQuery = "SELECT * FROM booking WHERE booking_id=?";
        PreparedStatement pst1 = c.prepareStatement(bookingQuery);
        pst1.setInt(1, bookingId);
        ResultSet rs1 = pst1.executeQuery();
        String paymentQuery = "SELECT amount, method, status FROM payment WHERE booking_id=?";
        PreparedStatement pst2 = c.prepareStatement(paymentQuery);
        pst2.setInt(1, bookingId);
        ResultSet rs2 = pst2.executeQuery();
        if (rs1.next()) {
            System.out.println("\n==========  BUS TICKET ==========");
            System.out.println("Booking ID   : " + rs1.getInt("booking_id"));
            System.out.println("Passenger    : " + rs1.getString("passenger_name"));
            System.out.println("Age          : " + rs1.getInt("passenger_Age"));
            System.out.println("Gender       : " + rs1.getString("passenger_Gender"));
            System.out.println("Phone        : " + rs1.getString("passenger_number"));
            System.out.println("----------------------------------");
            System.out.println("Bus No       : " + rs1.getInt("bus_no"));
            System.out.println("Seat No      : " + rs1.getInt("seat_no"));
            System.out.println("From         : " + rs1.getString("Boarding_point"));
            System.out.println("To           : " + rs1.getString("Dropping_point"));
            System.out.println("Travel Date  : " + rs1.getDate("travel_date"));
            System.out.println("----------------------------------");
            if (rs2.next()) {
                System.out.println("Amount Paid  : ₹" + rs2.getDouble("amount"));
                System.out.println("Payment Mode : " + rs2.getString("method"));
                System.out.println("Status       : " + rs2.getString("status"));
            } else {
                System.out.println("Payment Info : Not Found");
            }

            System.out.println("==================================\n");

        } else {
            System.out.println(" Booking not found!");
        }
    }
}