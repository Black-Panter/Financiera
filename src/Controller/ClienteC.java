/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
 import Entity.ClienteE;
 import java.util.ArrayList;
/**
 *
 * @author FRANK
 */
public class ClienteC {
    
    private static ArrayList<ClienteE> cliente;
    private static ClienteE c;
    
    public ClienteC() {
         cliente= new ArrayList();
         c= new ClienteE();
        fillComputer();    
     }
    public void createClienteE  (ClienteE c){
        cliente.add(c);
    }
    
    public void editClienteE(ClienteE c){
        cliente.set(cliente.indexOf(c), c);
    }
    
    public void deleteClienteE(ClienteE c){
        cliente.remove(c);
    }
    
    public ClienteE findClienteE(int id){
       c=null; 
        for (ClienteE client : cliente) {
            if(client.getId()==id) c=client;
        }
        return c;
    }

    private void fillComputer() {
       cliente.add(new ClienteE(1234567890, "C.C","Frank Stid","Jimenez Benavides", 22-12-2001, 18, 123456789, "fsjimenezb"));
    }
    
}
