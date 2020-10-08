/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author FRANK
 */
public class ProveedorE {
    
    private int id;
    private String nombre;
    
public ProveedorE(){
    
    this.id=0;
    this.nombre="";
}

public ProveedorE(int Id, String Nombre){
    
    this.id=Id;
    this.nombre=Nombre;
    
}

public int getId(){
    return id;
}

public String getNombre(){
    return nombre;
}

public void setId(int ID){
    this.id=ID;
}

public void setNombre(String Nomb){
    this.nombre=Nomb;
}

}
