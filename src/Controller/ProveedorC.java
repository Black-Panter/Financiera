/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
 import Entity.ProveedorE;
 import java.util.ArrayList;
/**
 *
 * @author FRANK
 */
public class ProveedorC {
    
    private static ArrayList<ProveedorE> proveedor;
    private static ProveedorE p;
    
    public ProveedorC() {
         proveedor= new ArrayList();
         p= new ProveedorE();
        fillComputer();    
     }

    public void createProveedorE  (ProveedorE p){
        proveedor.add(p);
    }
    
    public void editProveedorE(ProveedorE p){
        proveedor.set(proveedor.indexOf(p), p);
    }
    
    public void deleteProveedorE(ProveedorE p){
        proveedor.remove(p);
    }
    
    public ProveedorE findProveedorE(int id){
       p=null; 
        for (ProveedorE provee : proveedor) {
            if(provee.getId()==id) p=provee;
        }
        return p;
    }
    private void fillComputer() {
        proveedor.add(new ProveedorE(987655432, "Jimenez"));
    }
    
}
