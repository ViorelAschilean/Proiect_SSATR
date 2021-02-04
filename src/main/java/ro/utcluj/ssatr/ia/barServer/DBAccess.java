/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.ia.barServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;

public class DBAccess {

    private Connection conn;
    
    public DBAccess() throws ClassNotFoundException, SQLException {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         conn = DriverManager.getConnection("jdbc:derby://localhost/laborator;create=false","APP","APP");
    }

    public String testBar() throws SQLException{

        return "TEST testBar";
    }
    
    public void insertRow(String nume, String pret, String masa, String operator) throws SQLException{
        if(!nume.trim().equals("") && !pret.trim().equals("")){
            Statement s = conn.createStatement();
            s.executeUpdate("INSERT INTO BAR VALUES ('"+nume+"',"+pret+","+masa+","+operator+","+System.currentTimeMillis()+")"); 
            System.out.println("INSERT "+nume+","+pret+","+masa+","+operator+",InsertBar"+s);
        }
    }
    
    public AccessEntity findBar(String masa) throws SQLException{
        int sum = 0;
        String allstr="";
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM BAR WHERE MASA="+masa);
        while (rs.next()) {
            int c = rs.getInt(2);
            sum = sum + c;
            allstr=allstr+""+rs.getString("nume")+","+rs.getString("pret")+","+rs.getString("masa")+","+rs.getLong("data")+"'";
        }
            String str = Integer.toString(sum);
            //System.out.println(allstr+"Suma de plata masa "+masa+":="+str);
            return new AccessEntity(allstr, str);
    }
    
    public void deleteRow( String data) throws SQLException{
        Statement s = conn.createStatement();
        s.executeUpdate("DELETE FROM BAR WHERE DATA="+data);  
        System.out.println("DELETE  ("+data+")");
    }
    
    public void deleteMasaRows( String masa) throws SQLException{
        Statement s = conn.createStatement();
        s.executeUpdate("DELETE FROM BAR WHERE MASA="+masa);  
        System.out.println("DELETE  ("+masa+")");
    }
    

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBAccess db = new DBAccess();
        AccessEntity result = db.findBar("1");
        System.out.println(result);
        if(result!=null){
            db.deleteRow(result.getInfoRand());
            System.out.println("Entry deleted!");
        }else{
            System.out.println("Entry not found!");
        }
        
    }
    
}
