public class ejercicio_tema8 {

    public static void main(String[] args) {
        // Creación de objeto persona
        Persona persona = new Persona();
        // Asignando valores mediante setters
        persona.setNombre("German");
        persona.setEdad(32);
        persona.setTelefono("5491138905608");
        // Imprimiendo valores mediante getters
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }


    // Creación de la Clase Persona
    static class Persona {
        // Declaración de variables privadas
        private int edad;
        private String nombre;
        private String telefono;

        // Declaración de setters y getters para cada variable
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return this.telefono;
        }
    }
}


