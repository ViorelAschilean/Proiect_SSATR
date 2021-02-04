/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.ia.barServer;

import java.util.StringTokenizer;
import java.sql.SQLException;

public class ProiectBarService {
    
    private DBAccess db;
    public static final int UNIT_PRICE = 2; 

    public ProiectBarService() throws ClassNotFoundException, SQLException {
        db = new DBAccess();
    }
  
    public synchronized String handleInfoRand( String infoRand) throws SQLException{
    
        String segments[] = infoRand.split(",");
        int act = Integer.parseInt(segments[segments.length - 2]);
        //System.out.println("SERVICE ["+act+"]["+segments[0]+" "+segments[1]+" "+segments[2]+" "+segments[3]+" "+segments[4]+"]"); 

        if(act==1){
            db.insertRow(segments[0],segments[1],segments[2],segments[3]);
            AccessEntity c = db.findBar(segments[2]);
            return String.valueOf(c);
        } if(act==2){
            db.deleteRow(segments[4]);
            AccessEntity c = db.findBar(segments[2]);
            return String.valueOf(c);
        } if(act==3){
            db.deleteMasaRows(segments[2]);
            AccessEntity c = db.findBar(segments[2]);
            return String.valueOf(c);
        } else{
            AccessEntity c = db.findBar(segments[2]);
            return String.valueOf(c);
        }
    }
    
    private int computeParkingStayPrice(long entryTime){
        //1 LEU / secunda 
        long crt = System.currentTimeMillis();
        return (int)(((crt - entryTime)/1000)* UNIT_PRICE);
    }
    
    public static void main(String[] args) throws Exception {
        ProiectBarService p = new ProiectBarService();
        Thread.sleep(2000);
    }
}
