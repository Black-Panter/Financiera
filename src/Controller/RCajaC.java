/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
 import Entity.RCajaE;
 import java.util.ArrayList;
/**
 *
 * @author FRANK
 */
public class RCajaC {
    
    private static ArrayList<RCajaE> caja;
    private static RCajaE c;
    
    public RCajaC() {
         caja= new ArrayList();
         c= new RCajaE();
        fillComputer(); 
    
        }
    
    public void createRCajaE  (RCajaE c){
        caja.add(c);
    }
    
    public void editRCajaE(RCajaE c){
        caja.set(caja.indexOf(c), c);
    }
    
    public void deleteRCajaE(RCajaE c){
        caja.remove(c);
    }
    
    public RCajaE findRCajaE(int id){
       c=null; 
        for (RCajaE client : caja) {
            if(client.getCodigo()==id) c=client;
        }
        return c;
    }

    private void fillComputer() {
        caja.add(new RCajaE(1234, 822020, "Bogotá", 654, "cr 4h #23-23", 789, 6547, 798, 147, "....", "@@@@"));
    }
}