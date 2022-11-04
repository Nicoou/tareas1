public class main{

    public static void main(String[] args) {
        suma(10, 10, 10);
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();

        System.out.println(miCoche.puertas);


    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche{
    public int puertas = 4;
    public void AgregarPuerta() {
        this.puertas++;
    }
}