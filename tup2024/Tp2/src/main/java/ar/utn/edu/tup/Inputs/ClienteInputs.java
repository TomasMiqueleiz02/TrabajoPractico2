import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class ClienteInputs extends Cliente {
    private List<Cliente> listaClientes;
    public ClienteInputs() {
        this.listaClientes = new ArrayList<>();
    }
    public Cliente crearCliente() {
        Cliente cliente=new Cliente();
        System.out.println("Ingrese el nombre del cliente:");
        String Nombre=scanner.next();
        cliente.setNombre(Nombre);

        System.out.println("Ingrese el apellido del cliente");
        String Apellido=scanner.next();
        cliente.setApellido(Apellido);

        System.out.println("Ingrese el dni del cliente");
        long DNI=scanner.nextLong();
        cliente.setDni(DNI);

        System.out.println("Ingrese Fecha de nacimiento en forma YYYY-MM-DD");
        LocalDate FechaNacimento= LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        cliente.setFechaNacimiento(FechaNacimento);

        System.out.println("Ingrese el tipo de persona Física(F) o Jurídica(J):");
        String tipoPersonaStr = scanner.next().toUpperCase();
        while (!tipoPersonaStr.equals("F") && !tipoPersonaStr.equals("J")) {
            System.out.println("Tipo de persona inválido. Ingrese NATURAL o JURIDICA:");
            tipoPersonaStr = scanner.next().toUpperCase();
        }
        TipoPersona tipoPersona = TipoPersona.fromString(tipoPersonaStr);
        cliente.setTipoPersona(tipoPersona);

        System.out.println("Ingrese el banco");
        String banco= scanner.next();
        cliente.setBanco(banco);

        LocalDate FechaAlta=LocalDate.now();
        cliente.setFechaAlta(FechaAlta);
        System.out.println("Su fecha de alta es :"+ FechaAlta );
        listaClientes.add(cliente);
        return cliente;

    }
    public Cliente eliminarCliente(List<Cliente> listaClientes) {
        System.out.println("Ingrese el DNI del cliente que desea eliminar:");
        long dniEliminar = scanner.nextLong();

        // Iterar sobre la lista de clientes para encontrar Dni
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dniEliminar) {
                System.out.println("Cliente a eliminar:");
                System.out.println(cliente);

                System.out.println("¿Está seguro de que desea eliminar este cliente? (S/N)");
                String confirmacion = scanner.next().toUpperCase();
                if (confirmacion.equals("S")) {
                    listaClientes.remove(cliente);
                    System.out.println("Cliente eliminado correctamente.");
                    return cliente;
                } else {
                    System.out.println("Eliminación cancelada.");
                    return null;
                }
            }
        }
        System.out.println("No se encontró ningún cliente con el DNI especificado.");
        return null;
    }
    public void mostrarClientes(List<Cliente> clientes) {
        System.out.println("---------------------------------------");
        System.out.println("Lista de clientes generados:");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellido());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Tipo de persona: " + cliente.getTipoPersona());
            System.out.println("Banco: " + cliente.getBanco());
            System.out.println("Fecha de alta: " + cliente.getFechaAlta());
            System.out.println("---------------------------------------");
        }
    }

    public void modificarCliente() {
        System.out.println("Ingrese el DNI del cliente que desea modificar:");
        long dniModificar = scanner.nextLong();

        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dniModificar) {
                System.out.println("Ingrese los nuevos datos:");
                System.out.println("Ingrese el nuevo nombre del cliente:");
                String nuevoNombre = scanner.next();
                cliente.setNombre(nuevoNombre);
                System.out.println("Ingrese el nuevo apellido del cliente:");
                String nuevoApellido = scanner.next();
                cliente.setApellido(nuevoApellido);
                System.out.println("Ingrese el nuevo DNI del cliente:");
                long nuevoDNI = scanner.nextLong();
                cliente.setDni(nuevoDNI);
                System.out.println("Ingrese la nueva fecha de nacimiento del cliente (YYYY-MM-DD):");
                LocalDate nuevaFechaNacimiento = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                cliente.setFechaNacimiento(nuevaFechaNacimiento);
                System.out.println("Ingrese el nuevo tipo de persona Física(F) o Jurídica(J):");
                String nuevoTipoPersonaStr = scanner.next().toUpperCase();
                while (!nuevoTipoPersonaStr.equals("F") && !nuevoTipoPersonaStr.equals("J")) {
                    System.out.println("Tipo de persona inválido. Ingrese NATURAL o JURIDICA:");
                    nuevoTipoPersonaStr = scanner.next().toUpperCase();
                }
                TipoPersona nuevoTipoPersona = TipoPersona.fromString(nuevoTipoPersonaStr);
                cliente.setTipoPersona(nuevoTipoPersona);
                System.out.println("Ingrese el nuevo banco:");
                String nuevoBanco = scanner.next();
                cliente.setBanco(nuevoBanco);
                System.out.println("Cliente modificado ");
                return;
            }
        }
        System.out.println("No se encontró ningún cliente");
    }


    public Cliente Menucliente(){
        int opcion;
        do {
            System.out.println("1. Crear cliente");
            System.out.println("2. Modificar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Mostrar Cliente");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion =scanner.nextInt() ;

            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    modificarCliente();
                    break;
                case 3:
                    eliminarCliente(listaClientes);
                    break;
                case 4:
                    mostrarClientes(listaClientes);

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
