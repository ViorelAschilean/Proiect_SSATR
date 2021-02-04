/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.ia.barServer;

/**
 *
 * @author mihai.hulea
 */
public class AccessEntity {
    private String infoRand;
    private String sumaPlata;
    private long entryTime;
    

    public AccessEntity(String infoRand, String sumaPlata) {
        this.infoRand = infoRand;
        this.sumaPlata = sumaPlata;
        this.entryTime = entryTime;
    }

    public String getInfoRand() {
        return infoRand;
    }

    public void setInfoRand(String infoRand) {
        this.infoRand = infoRand;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        //return "CAUTARE{" + "Nume=" + infoRand + ", Data=" + entryTime + '}';
        return "" + infoRand +"/"+ sumaPlata +"";
    }
    
    
}
