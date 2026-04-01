package org.example;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    private  int booking_id;
    private String passengerName;
    private int age;
    private String Gender;
    private String  passenger_number;
    private int busNo;
    private String Boarding_point;
    private String Dropping_point;
    private Date date;
    private  int seat_no;

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPassenger_number() {
        return passenger_number;
    }

    public void setPassenger_number(String passenger_number) {
        this.passenger_number = passenger_number;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public String getBoarding_point() {
        return Boarding_point;
    }

    public void setBoarding_point(String boarding_point) {
        Boarding_point = boarding_point;
    }

    public String getDropping_point() {
        return Dropping_point;
    }

    public void setDropping_point(String dropping_point) {
        Dropping_point = dropping_point;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Booking() throws SQLException {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter booking id :");
        booking_id=n.nextInt();
        n.nextLine();
        System.out.println("Enter name of passenger :");
        passengerName=n.nextLine();
        System.out.println("Enter passenger Age:");
        age=n.nextInt();
        n.nextLine();
        System.out.println("Enter passenger Gender:");
        Gender=n.nextLine();
        System.out.println("Enter passenger phoneNumber:");
        String l=n.nextLine();
        if(l.length()==10){
            passenger_number=l;
        }
        System.out.println("Enter the BusNo :");
        busNo=n.nextInt();
        n.nextLine();
        System.out.println("===================Bus routes ============================:");
        BusRoutes b=new BusRoutes();
        b.displayBusRoutes(busNo);
        System.out.println("Enter the Boarding_point :");
        Boarding_point=n.nextLine();
        System.out.println("Enter the Dropping_point :");
        Dropping_point=n.nextLine();
        System.out.println("Enter the date dd-mm-yyy");
        String dateInput=n.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        BusDAO busDAO=new BusDAO();
        BookingDAO bookingDAO=new BookingDAO();
        int capacity=busDAO.getcapacity(busNo);
        int booked=bookingDAO.getBookedCount(busNo,date);
        System.out.println("Select the seat No  between the bus capacity "+capacity);
        System.out.println("current Seats available :"+(capacity-booked));
        System.err.println("Seat No  1 t0 2 for disability passenger");
        System.err.println("Seat No  3 t0 10 for only Female passenger");
        System.err.println("Rest of the seta filled by any passenger ");
        //int a =n.nextInt();
        this.seat_no=n.nextInt();
//        if(1<=a && a<=capacity){
//           this.seat_no=a;
//        }
    }
    public boolean isAvailable() throws SQLException {
        BusDAO busDAO=new BusDAO();
        BookingDAO bookingDAO=new BookingDAO();
        int capacity=busDAO.getcapacity(busNo);
        int booked=bookingDAO.getBookedCount(busNo,date);
        System.out.println("Capacity of the bus :"+capacity);
        System.out.println("how many booking take place :"+booked);
        return booked < capacity;
    }
    public int getseat(){
        return this.seat_no;
    }
}
