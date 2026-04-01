package org.example;
public class Bus {
    private int busNo;
    private  boolean ac;
    private  boolean Sleeper;
    private String Boarding_point;
    private String Dropping_point;
    private int capacity;
    private  int Travel_duration;
    private String driverName;
    private int driverNumber;
    private double Ticket_price;
    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isSleeper() {
        return Sleeper;
    }

    public void setSleeper(boolean sleeper) {
        Sleeper = sleeper;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTravel_duration() {
        return Travel_duration;
    }

    public void setTravel_duration(int travel_duration) {
        Travel_duration = travel_duration;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public double getTicket_price() {
        return Ticket_price;
    }

    public void setTicket_price(double ticket_price) {
        Ticket_price = ticket_price;
    }
    public int getbusnuber(){
        return busNo;
    }
}
