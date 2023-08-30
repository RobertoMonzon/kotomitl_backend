import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        //papel

    //System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ")
        //String j1 = s.nextLine();

        Random r = new Random();
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        //System.out.println(result);
        //tijeras
        String j2;

        if(result == 1){
            j2 = "piedra";
            System.out.println("j2 elige piedra");
        } else if (result == 2) {
            j2 = "papel";
            System.out.println("j2 elige papel");
        }else {
            j2 = "tijeras";
            System.out.println("j2 elige tijeras");
        }


        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;

                    case "tijera":
                        if (j2.equals("papel")) {
                            g = 1;
                        }
                        break;
                    }

                System.out.println("Gana el jugador " + g);
        }
    }
}