package Controller;

import Entity.CuentaE;
import java.util.ArrayList;

/**
 *
 * @author S.CALDERON
 */
public class CuentaC {
    
    private static ArrayList<CuentaE> cuenta;
    private static CuentaE cu;
    
    public CuentaC(){
        cuenta= new ArrayList();
        cu= new CuentaE();
        fillComputer();
    }
    public void createCuentaE (CuentaE cu){
        cuenta.add(cu);
    }
    
    public void editCuentaE (CuentaE cu){
        cuenta.set(cuenta.indexOf(cu), cu);
    }
    
    public void deleteCuentaE (CuentaE cu){
        cuenta.remove(cu);
    }
    
    public CuentaE findCuentaE (long id){
        cu=null;
         for (CuentaE cuenta : cuenta) {
             if(cuenta.getIdCliente()==id) cu=cuenta;
         }
         return cu;
    }
    
    private void fillComputer(){
        cuenta.add(new CuentaE(1234,123456789,1234,1234,1234,123456789));
    }
}
