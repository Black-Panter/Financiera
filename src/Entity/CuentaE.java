package Entity;

/**
 *
 * @author S.CALDERON
 */
public class CuentaE {
    private int numCuenta;
    private long IdCliente;
    private int diaAp;
    private int mesAp;
    private int anioAp;
    private long saldo;

    public CuentaE() {
        numCuenta=0;
        IdCliente=0;
        diaAp=0;
        mesAp=0;
        anioAp=0;
        saldo=0;
    }

    public CuentaE(int numCuenta, long IdCliente, int diaAp, int mesAp, int anioAp, long saldo) {
        this.numCuenta = numCuenta;
        this.IdCliente = IdCliente;
        this.diaAp = diaAp;
        this.mesAp = mesAp;
        this.anioAp = anioAp;
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

    public int getDiaAp() {
        return diaAp;
    }

    public void setDiaAp(int diaAp) {
        this.diaAp = diaAp;
    }

    public int getMesAp() {
        return mesAp;
    }

    public void setMesAp(int mesAp) {
        this.mesAp = mesAp;
    }

    public int getAnioAp() {
        return anioAp;
    }

    public void setAnioAp(int anioAp) {
        this.anioAp = anioAp;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

}
