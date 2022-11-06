/// 1
public class main {
    public static void main(String[] args){
        String numerolf = "10";


        if( numerolf == "10"){
            System.out.println("es positivo");
        }
        else if (numerolf == "-10"){
            System.out.println("es negativo");
        } else {
            System.out.println("es 0");

        }
        //2
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //3
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile - 3;

        } while (numeroWhile > 3);

        //4
        for (int numeroFor = 0; numeroFor <= 3;numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
        //5
        var estacion = "VERANO";
        switch(estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("ninguna estacion");
        }

    }
}