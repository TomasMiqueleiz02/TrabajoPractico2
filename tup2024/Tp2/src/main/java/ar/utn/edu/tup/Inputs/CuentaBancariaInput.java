import java.time.LocalDateTime;
import java.util.List;

public class CuentaBancariaInput extends Cuenta {
    private List<Cliente> listaClientes;

    public Cuenta crearCuenta(){

        return null;
    }
    public static void realizarDeposito(){

    }
    public static void realizarRetiro(){

    }
    public static void consultarSaldo(){

    }
    public Cliente Menucuenta(){
        int opcion;
        do {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Deposito");
            System.out.println("3. Retiro");
            System.out.println("4. Consulta de Saldo");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion =scanner.nextInt() ;

            switch (opcion) {
                case 1:
                    //crearCuenta;
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:


                case 5:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
        return null;
    }


}

