/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.REgresoE;
import java.util.ArrayList;

/**
 *
 * @author FRANK
 */
public class REgresoC {
    
    private static ArrayList<REgresoE> egreso;
    private static REgresoE r;
    
    public REgresoC() {
         egreso= new ArrayList();
         r= new REgresoE();
        fillComputer();    
     }
    public void createREgresoE  (REgresoE r){
        egreso.add(r);
    }
    
    public void editREgresoE(REgresoE r){
        egreso.set(egreso.indexOf(r), r);
    }
    
    public void deleteREgresoE(REgresoE r){
        egreso.remove(r);
    }
    
    public REgresoE findREgresoE(int id){
       r=null; 
        for (REgresoE egres : egreso) {
            if(egres.getCodigo()==id) r=egres;
        }
        return r;
    }

    private void fillComputer() {
       egreso.add(new REgresoE(246810, "Ahorros", "Nomina", 123456, 123456, 123456, "frank", "Juan", "......", 12233));
    }
    
}
