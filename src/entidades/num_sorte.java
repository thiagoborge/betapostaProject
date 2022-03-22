package entidades;
import java.util.Random;
import java.util.Scanner;

public class num_sorte {
   public static int dinapost = 500;
    static int quantoApost;

    {
        roletaNum();
        System.out.println("Jogando...");

        ganhador();
}

    public static void roletaNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nQuanto você gostaria de apostar?");

        quantoApost = scan.nextInt();

        System.out.println("Você apostou: R$" +quantoApost );

    }

    public static int roleta() {
        Random r = new Random();

        int min = 0;
        int max = 100;
        int role = r.nextInt(max-min) + min;

        return role;
    }

    public static void ganhador() {

        int bola1 = roleta();
        int bola2 = roleta();

        System.out.println("O seu numero é: " + bola1);
        System.out.println("O número do seu oponente é: " + bola2);

        if(bola1 > bola2) {
            ganha(0);
        } else if (bola1 < bola2) {
            perde(0);
        } else {
            System.out.println("EMPATE");
        }
    }

    public static int ganha(int resul) {

        resul = dinapost + quantoApost;
        dinapost = resul;

        System.out.println("VOCÊ VENCEU !!! " + dinapost);
        return dinapost;
    }

    public static int perde(int resul) {

        resul = dinapost - quantoApost;
        dinapost = resul;

        System.out.println("VOCÊ PERDEU | DINHEIRO RESTANTE: " + dinapost);
        return dinapost;



        }


    }


