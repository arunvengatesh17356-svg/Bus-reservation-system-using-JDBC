package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CancellationDAO {
    public static int getBookedDetails(int booking_id) throws SQLException {
        String query ="SELECT count(booking_id) FROM booking WHERE booking_id = ?";
        Connection c=DbConnection.getconnection();
        PreparedStatement pst=c.prepareStatement(query);
        pst.setInt(1,booking_id);
        ResultSet rs=pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public void ticketCancel(BusticketCancel cancel)  throws SQLException {
        String query ="DELETE FROM booking WHERE booking_id = ?";
        Connection c=DbConnection.getconnection();
        PreparedStatement pst=c.prepareStatement(query);
        pst.setInt(1, cancel.booking_id);
        pst.executeUpdate();
    }
}
