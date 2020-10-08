/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
  import Entity.REgresoE;
  import java.util.ArrayList;
/**
 *
 * @author FRANK
 */
public class REgresoE {
    
    private int codigo;
    private String cuenta;
    private String concepto;
    private int valor;
    private int valor_final;
    private int id_banco;
    private String elaborado;
    private String revisado;
    private String firma;
    private int fecha_transaccion;
    
    
public REgresoE(){
    
    this.codigo=0;
    this.cuenta="";
    this.concepto="";
    this.valor=0;
    this.valor_final=0;
    this.id_banco=0;   
    this.elaborado="";
    this.revisado="";
    this.firma="";
    this.fecha_transaccion=0; 
    
}

    
public REgresoE(int codigo, String cuenta, String concepto, int valor,int valor_final, int id_banco, String elaborado, String revisado, String firma, int fecha_transaccion){
    
    this.codigo=codigo;
    this.cuenta=cuenta;
    this.concepto=concepto;
    this.valor=valor;
    this.valor_final=valor_final;
    this.id_banco=id_banco;   
    this.elaborado=elaborado;
    this.revisado=revisado;
    this.firma=firma;
    this.fecha_transaccion=fecha_transaccion;  
    
}
     public int getCodigo() {
        return codigo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getValor() {
        return valor;
    }

    public int getValor_final() {
        return valor_final;
    }

    public int getId_banco() {
        return id_banco;
    }

    public String getElaborado() {
        return elaborado;
    }

    public String getRevisado() {
        return revisado;
    }

    public String getFirma() {
        return firma;
    }

    public int getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setValor_final(int valor_final) {
        this.valor_final = valor_final;
    }

    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
    }

    public void setElaborado(String elaborado) {
        this.elaborado = elaborado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setFecha_transaccion(int fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }  
    
}
