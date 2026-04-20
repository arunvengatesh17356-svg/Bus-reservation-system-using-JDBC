# 🚌 Bus Reservation System using JDBC

## 📌 Overview
This is a **console-based Bus Reservation System** developed using **Java and JDBC** with **MySQL database integration**.  
The system allows users to book tickets, select seats, make payments, cancel bookings, and print tickets.

---

## 🚀 Features
- 🧾 Ticket Booking  
- 💺 Seat Selection with rules  
- 💳 Payment Processing (Card / Cash)  
- ❌ Ticket Cancellation  
- 🖨️ Ticket Printing  
- 📊 JDBC + MySQL Database Integration  

---

## 🛠️ Technologies Used
- Java  
- JDBC  
- MySQL  
- OOP Concepts  

---

## 🗂️ Project Structure

org.example

Main.java → Application entry point
Booking.java → Booking details & input
BookingDAO.java → Booking DB operations
Bus.java → Bus entity
BusDAO.java → Bus DB operations
BusRoutes.java → Route display
Payment.java → Payment logic
PaymentDAO.java → Payment DB operations
BusticketCancel.java → Cancellation input
CancellationDAO.java → Cancellation DB logic
DbConnection.java → Database connection


---

## 🧑‍💻 How It Works

1. Display available buses  
2. User selects booking option  
3. Enter passenger details  
4. Select bus, route, and seat  
5. Check seat availability  
6. Make payment  
7. Ticket is generated  
8. Option to cancel booking  

---

## 🗄️ Database Setup

### Create Database
```sql
CREATE DATABASE Newbusresv1;
USE Newbusresv1;
Bus Table
CREATE TABLE newbus(
    id INT PRIMARY KEY,
    ac BOOLEAN,
    Sleeper BOOLEAN,
    Boarding_point VARCHAR(50),
    Dropping_point VARCHAR(50),
    capacity INT,
    Travel_duration INT,
    Ticket_price DOUBLE,
    driverName VARCHAR(50),
    driverNumber INT
);
Booking Table
CREATE TABLE booking(
    booking_id INT PRIMARY KEY,
    passenger_Name VARCHAR(50),
    passenger_Age INT,
    passenger_Gender VARCHAR(50),
    passenger_number VARCHAR(50),
    bus_no INT,
    Boarding_point VARCHAR(50),
    Dropping_point VARCHAR(50),
    travel_date DATE,
    seat_no INT
);
Payment Table
CREATE TABLE payment (
    booking_id INT,
    amount DOUBLE,
    method VARCHAR(20),
    status VARCHAR(20)
);
▶️ Sample Run
Input
Enter 1 to Booking , 2 to Cancellation and 3 to Exit :
1
Enter booking id : 10
Enter name : Arun
Enter Age : 23
Enter Gender : Male
Enter phone : 9876543210
Enter Bus No : 1
Enter Seat No : 5
Choose Payment Method:
1. CARD
Output
========== BUS TICKET ==========
Booking ID   : 10
Passenger    : Arun
Age          : 23
Gender       : Male
Phone        : 9876543210
----------------------------------
Bus No       : 1
Seat No      : 5
From         : Chennai
To           : Madurai
Travel Date  : 2026-04-20
----------------------------------
Amount Paid  : ₹506
Payment Mode : CARD
Status       : SUCCESS
==================================
⚠️ Notes
Seats 1–2 → Reserved for disabled passengers
Seats 3–10 → Reserved for female passengers
Console-based application
Basic validation included
📈 Future Improvements
GUI (JavaFX / Web App)
Online payment gateway
Seat visualization
Admin panel
Login system
👨‍💻 Author

Arun Vengatesh
