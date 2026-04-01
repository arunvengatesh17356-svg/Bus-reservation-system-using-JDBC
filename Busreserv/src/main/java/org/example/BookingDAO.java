package org.example;
import java.sql.*;
import java.util.Date;

public class BookingDAO {
    public int getBookedCount(int busNo, Date date) throws SQLException {
        String query ="select count(passenger_name) from  booking where bus_no=? and travel_date=?";
        Connection c=DbConnection.getconnection();
        PreparedStatement pst=c.prepareStatement(query);
        java.sql.Date sqldate=new java.sql.Date(date.getTime());
        pst.setInt(1,busNo);
        pst.setDate(2,sqldate);
        ResultSet rs=pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public void addBooking(Booking booking1)  throws SQLException {
        String query ="Insert into booking values(?,?,?,?,?,?,?,?,?,?)";
        Connection c=DbConnection.getconnection();
        PreparedStatement pst=c.prepareStatement(query);
        java.sql.Date sqldate=new java.sql.Date(booking1.getDate().getTime());
        pst.setInt(1,booking1.getBooking_id());
        pst.setString(2, booking1.getPassengerName());
        pst.setInt(3,booking1.getAge());
        pst.setString(4, booking1.getGender());
        pst.setString(5,booking1.getPassenger_number());
        pst.setInt(6,booking1.getBusNo());
        pst.setString(7,booking1.getBoarding_point());
        pst.setString(8, booking1.getDropping_point());
        pst.setDate(9,sqldate);
        pst.setInt(10,booking1.getseat());
        pst.executeUpdate();

    }

}
