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
public class ClienteE {

    private int id;
    private String tipoId;
    private String nombres;
    private String apellidos;
    private int fecha_nac;
    private int edad;
    private int telefono;
    private String correo;

public ClienteE(int Id, String TipoId, String Nombres, String Apellidos, int Fecha_Nac, int Edad, int Telefono, String Correo){
    
    this.id=Id;
    this.tipoId=TipoId;
    this.nombres=Nombres;
    this.apellidos=Apellidos;
    this.fecha_nac=Fecha_Nac;
    this.edad=Edad;
    this.telefono=Telefono;
    this.correo=Correo;
       
}

public ClienteE(){
    
    this.id=0;
    this.tipoId="";
    this.nombres="";
    this.apellidos="";
    this.fecha_nac=0;
    this.edad=0;
    this.telefono=0;
    this.correo="";  
}

public int getId(){
    return id; 
}

public String getTipoId(){
    return tipoId;
}

public String getNombres(){
    return nombres;
}

public String getApellidos(){
    return apellidos;
}

public int getFecha_Nac(){
    return fecha_nac;
}

public int getEdad(){
    return edad;
}

public int getTelefono(){
    return telefono;
}

public String getCorreo(){
    return correo;
}


public void setId(int ID){
    this.id=ID;
}

public void setTipo_Id(int TipoId){
    this.tipoId=tipoId;
}

public void setNombres(String Nomb){
    this.nombres=Nomb;
}

public void setApellidos(String Ape){
    this.apellidos=Ape;
}

public void setFecha_Nac(int nac){
    this.fecha_nac=nac;
}

public void setEdad(int eda){
    this.edad=eda;
}

public void setTelefono(int Tel){
    this.telefono=Tel;
}

public void setCorreo(String mail){
    this.correo=mail;
}


    
}
