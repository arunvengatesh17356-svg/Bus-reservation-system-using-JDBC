# Bus-reservation-system-using-JDBC
# 🚌 Bus Reservation System using JDBC

## 📌 Overview
This is a **console-based Bus Reservation System** developed using **Java and JDBC**.  
The system allows users to book tickets, select seats, make payments, and print tickets.

---

## 🚀 Features

- Book bus tickets  
- Seat selection  
- Payment processing  
- Ticket generation  
- Data stored using JDBC (MySQL)  

---

## 🛠️ Technologies Used

- Java  
- JDBC  
- MySQL  

---

## 📂 Project Structure
Booking.java
BookingDAO.java
SeatSelection.java
Payment.java
PaymentDAO.java
TicketService.java
DbConnection.java
Main.java


---

## 🧾 Database Tables

### Booking Table
```sql
CREATE TABLE booking (
    booking_id INT PRIMARY KEY,
    passenger_name VARCHAR(50),
    age INT,
    gender VARCHAR(10),
    phone VARCHAR(15),
    bus_no INT,
    boarding_point VARCHAR(50),
    dropping_point VARCHAR(50),
    travel_date DATE,
    seat_no INT
);

Payment Table
CREATE TABLE payment (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT,
    amount DOUBLE,
    method VARCHAR(20),
    status VARCHAR(20)
);
🔄 Program Flow
User enters booking details
Seat selection is performed
Ticket price is calculated
Payment is processed
Booking and payment are stored in database
Ticket is printed
⚙️ How to Run
Extract the project
Open in IDE (IntelliJ / Eclipse)
Add MySQL JDBC driver
Create database and tables
Update DB credentials in DbConnection.java
Run Main.java
👨‍💻 Author

Arun Vengatesh
