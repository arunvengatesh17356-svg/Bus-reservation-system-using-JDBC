package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Payment {
    private int bookingId;
    private double amount;
    private String method;
    private String status;
    public Payment(int bookingId, double amount) {
        this.bookingId = bookingId;
        this.amount = amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========== PAYMENT ==========");
        System.out.println("Total Amount: ₹" + amount);
        System.out.println("Choose Payment Method:");
        System.out.println("1. CARD");
        System.out.println("2. CASH");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                method = "CARD";
                processCard(sc);
                break;
            case 2:
                method = "CASH";
                processCash();
                break;
            default:
                System.out.println("Invalid choice");
                status = "FAILED";
                return;
        }
        System.out.println("Processing payment...");
        status = "SUCCESS";
        System.out.println("Payment Successful!");
    }
    private void processCard(Scanner sc) {
        System.out.println("Enter Card Number:");
        String card = sc.nextLine();
        System.out.println("Enter the pin number :");
        String pin=sc.nextLine();

        if (card.length() != 16 && pin.length()==4) {
            System.out.println("Invalid Card Number");
            status = "FAILED";
        }
    }
    private void processCash() {
        System.out.println("Pay cash at counter.");
    }
    public int getBookingId() { return bookingId; }
    public double getAmount() { return amount; }
    public String getMethod() { return method; }
    public String getStatus() { return status; }


}