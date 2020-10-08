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
    private String direccion;
    private String ciudad;
    private int telefono;
    
public ProveedorE(){
    
    this.id=0;
    this.nombre="";
    this.direccion="";
    this.ciudad="";
    this.telefono=0;
    
}

public ProveedorE(int Id, String Nombre, String Direccion, String Ciudad,int Telefono){
    
    this.id=Id;
    this.nombre=Nombre;
    this.direccion=Direccion;
    this.ciudad=Ciudad;
    this.telefono=Telefono;
    
}

public int getId(){
    return id;
}

public String getNombre(){
    return nombre;
}

public String getDireccion(){
    return direccion;
}

public String getCiudad(){
    return ciudad;
}

public int getTelefono(){
    return telefono;
}

public void setId(int ID){
    this.id=ID;
}

public void setNombre(String Nomb){
    this.nombre=Nomb;
}

public void setDireccion(String direc){
    this.direccion=direc;
}

public void setCiudad(String ciud){
    this.ciudad=ciud;
}

public void setTelefono(int Telef){
    this.telefono=Telef;
}

}
