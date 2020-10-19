package Entity;

/**
 *
 * @author S.CALDERON
 */
public class CuentaE {
    private int numCuenta;
    private long IdCliente;
    private int FechaAp;
    private long saldo;

    public CuentaE() {
        numCuenta=0;
        IdCliente=0;
        FechaAp=0;
        saldo=0;
    }

    public CuentaE(int numCuenta, long IdCliente, int Fecha, long saldo) {
        this.numCuenta = numCuenta;
        this.IdCliente = IdCliente;
        this.FechaAp=Fecha;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(long IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    public int getFechaAp(){
        return FechaAp;
    }
    
    public void setFechaAp(int Fecha){
        this.FechaAp = Fecha;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

}
