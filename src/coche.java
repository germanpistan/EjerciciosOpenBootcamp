public class coche {
    int puertas;

    public void sumarpuertas(int x){
        puertas += x;
    }
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarpuertas(1);
        System.out.println(miCoche.puertas);
    }
}
