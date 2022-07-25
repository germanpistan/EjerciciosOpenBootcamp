public class Main {

    public static void main (String [] args) {
        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
//en este caso no paso parametros, pero al crear un objeto pase una direccion de memoria y es un paso por referencia.
    }

    public static int suma (int a, int b) {
        return a + b;
    }
}

class Potato {
    public int brazos = 0;

    public void QuitarBrazo() {
        this.brazos --;
    }
}
//void significa que no devuelvo nada en la funcion

//paso por referencia de funciones