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
public class RCajaE {
    
    private int codigo;
    private int fecha;
    private String ciudad;
    private int id_cliente;
    private String direccion;
    private int id_banco;
    private int numero_cuenta;
    private int debitos;
    private int creditos;
    private String firma;
    private String sello;
    
    public RCajaE(){
        
        this.codigo = 0;
        this.fecha = 0;
        this.ciudad = "";
        this.id_cliente = 0;
        this.direccion = "";
        this.id_banco = 0;
        this.numero_cuenta = 0;
        this.debitos = 0;
        this.creditos = 0;
        this.firma = "";
        this.sello = "";
    }

    public RCajaE(int codigo, int fecha, String ciudad, int id_clieete, String direccion, int id_banco, int numero_cuenta, int debitos, int creditos, String firma, String sello) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.id_cliente = id_clieete;
        this.direccion = direccion;
        this.id_banco = id_banco;
        this.numero_cuenta = numero_cuenta;
        this.debitos = debitos;
        this.creditos = creditos;
        this.firma = firma;
        this.sello = sello;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getFecha() {
        return fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getId_banco() {
        return id_banco;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public int getDebitos() {
        return debitos;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getFirma() {
        return firma;
    }

    public String getSello() {
        return sello;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public void setDebitos(int debitos) {
        this.debitos = debitos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }
    
}
