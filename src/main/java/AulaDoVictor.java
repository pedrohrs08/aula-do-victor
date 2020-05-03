import java.util.Scanner;

public class AulaDoVictor {

    public static void main(String[] args) {
        int number = 5;
        double half = 0.5;
        char letraC = 'c';
        boolean resultado = false;
        String textoDoVictor = "Meu nome é Victor";
        System.out.println(number + textoDoVictor);
        System.out.println(half);
        System.out.println(letraC);
        System.out.println(textoDoVictor);

        Scanner scanner = new Scanner(System.in);
        int myAge = scanner.nextInt();
        System.out.println("Minha idade é" + myAge);


    }
}
