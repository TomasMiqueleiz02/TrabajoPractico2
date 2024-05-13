import java.time.LocalDate;
import java.util.*;
import java.time.LocalDateTime;
public class Cuenta extends Cliente {
    protected void setTipoCuenta(TipodeCuenta tipoCuenta) {
    }

    public enum TipodeCuenta {
        CAJA_DE_AHORRO,
        CUENTA_CORRIENTE
    }
    LocalDateTime fechaCreacion;
    private double CBU;
    private String Alias;
    private int balance;
    private TipodeCuenta tipodeCuenta;





    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getCBU() {
        return CBU;
    }

    public void setCBU(double CBU) {
        this.CBU = CBU;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public TipodeCuenta getTipodeCuenta(){
        return tipodeCuenta;

    }
    public void setTipodeCuenta(){
        this.tipodeCuenta=tipodeCuenta;
    }

}




