import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Cuenta> cuentas=new ArrayList<>();

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Cliente> getClientes() {

        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {

        this.clientes = clientes;
    }
}
