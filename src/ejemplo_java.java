public class ejemplo_java {

    public static void main(String[] args) {
        var hoy_es = "SABADO";

        switch (hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("hoy se labura");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("hoy no se labura");
                break;
        }
    }
}


