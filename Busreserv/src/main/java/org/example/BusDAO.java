package org.example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
    public void displayBusInfo() throws SQLException {
        String query ="select * from  newbus";
        Connection c=DbConnection.getconnection();
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery(query);
        System.out.println();
        System.out.println("\n=========================  BUS DETAILS ===================");
        while (rs.next()){
            System.out.print("Bus No:\t"+rs.getInt(1)+"\t");
            if(rs.getInt(2)==0){
                System.out.print("Non Ac \t");
            }
            else {
                System.out.print("Ac \t");
            }
            if(rs.getInt(3)==0){
                System.out.print("SEATER\t");
            }
            else {
                System.out.print("SLEEPER\t");
            }
            System.out.print("Boarding point :"+rs.getString(4)+"\t");
            System.out.print("Dropping point  :"+rs.getString(5)+"\t");
            System.out.print("Capacity :"+rs.getInt(6)+"\t");
            System.out.print("Travel duration :"+rs.getInt(7)+"\t");
            System.out.print("Ticket price"+rs.getDouble(8)+"\t");
            System.out.print("driverName :"+rs.getString(9)+"\t");
            System.out.println("driverNumber :"+rs.getInt(10));

        }
        System.out.println("==============================================================");
    }

    public int getcapacity(int id) throws SQLException{
        String query ="select capacity from  newbus where id="+id;
        Connection c=DbConnection.getconnection();
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
    public double findTicketPrice (int busno) throws SQLException {
        String query ="select Ticket_price from  newbus where id="+busno;
        Connection c=DbConnection.getconnection();
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getDouble(1);
    }
}
