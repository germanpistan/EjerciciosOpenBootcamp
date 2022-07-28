public class ejercicio_tema9 {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("Datos del usuario: \n");
        cliente.nombre = "Anibal German Pistan";
        cliente.edad = 32;
        cliente.telefono = "0123456789";
        cliente.credito = 5500000.00;

        System.out.println("Su nombre es " + cliente.nombre + "\nusted tiene " + cliente.edad +
                " años" + "\ny su numero de telefono es " + cliente.telefono + "\n actualmente el credito es " +
                cliente.credito);

        System.out.println("\nDatos del Trabajador: \n");
        trabajador.nombre = "Roberto Gomez Bolaños";
        trabajador.edad = 54;
        trabajador.telefono = "3806666665";
        trabajador.salario = 280000.00;

        System.out.println("Su nombre es " + trabajador.nombre + "\nusted tiene " + trabajador.edad +
                " anios" + "\ny su numero de telefono es " + trabajador.telefono + "\nsu salario es de " +
                trabajador.salario);

    }
}

class Persona{
    String nombre;
    String telefono;
    int edad;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}