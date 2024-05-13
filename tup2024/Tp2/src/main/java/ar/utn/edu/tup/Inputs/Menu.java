import java.util.Scanner;
public class Menu  {
    ClienteInputs cliente=new ClienteInputs();
    CuentaBancariaInput cuenta=new CuentaBancariaInput();
    boolean exit= false;
    public static Scanner scanner = new Scanner(System.in);
    public void menu1(Banco banco){
        while (!exit){
            System.out.println("Bienvenido al menu del Banco");
            System.out.println("0-Cliente");
            System.out.println("1-Cuenta");
            System.out.println("2-Movimientos");
            System.out.println("3-Operaciones");
            System.out.println("4-Exit");

            int choice =scanner.nextInt();
            switch (choice) {
                case 0:
                    Cliente c=cliente.Menucliente();
                    banco.getClientes().add(c);
                case 1:
                    Cuenta s= (Cuenta) cuenta.Menucuenta();
                    banco.getCuentas().add(s);

                case 2:
                    //movimientos
                case 3:
                    //operaciones:depositos, retiros,transferencias, consulta de saldo
                case 4:
                    exit=true;



                }

            }
        }

    }




