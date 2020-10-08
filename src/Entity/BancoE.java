package Entity;

/**
 *
 * @author S.CALDERON
 */
public class BancoE {
      private long IdBanco;
      private String nombre;
      private long telefono;
      private String direccion;
      private int numCuenta;

    public BancoE() {
        IdBanco=0;
        nombre=" ";
        telefono=0;
        direccion=" ";
        numCuenta=0;
        
    }

    public BancoE(long IdBanco, String nombre, long telefono, String direccion, int numCuenta) {
        this.IdBanco = IdBanco;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.numCuenta = numCuenta;
    }

    public long getIdBanco() {
        return IdBanco;
    }

    public void setIdBanco(long IdBanco) {
        this.IdBanco = IdBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }


}
