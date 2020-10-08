package Controller;

import Entity.BancoE;
import java.util.ArrayList;
/**
 *
 * @author S.CALDERON
 */
public class BancoC {
    private static ArrayList<BancoE> banco;
    private static BancoE b;
    
    public BancoC() {
         banco= new ArrayList();
         
         b= new BancoE();
        fillComputer();    
     }
    public void createBancoE  (BancoE c){
        banco.add(c);
    }
    
    public void editBancoE(BancoE c){
        banco.set(banco.indexOf(c), c);
    }
    
    public void deleteBancoE(BancoE c){
        banco.remove(c);
    }
    
    public BancoE findBancoE(int id){
       b=null; 
        for (BancoE banco : banco) {
            if(banco.getIdBanco()==id) b=banco;
        }
        return b;
    }

    private void fillComputer() {
       banco.add(new BancoE(1234567890, "Bancolombia", 12345, "Calle 31 c.sur No. 3A 23 este",12345 ));
    }
}
