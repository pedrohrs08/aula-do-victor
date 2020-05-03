import java.util.Scanner;

public class ExercicioDoVictor {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int limite = 10;
        int number2 = 1;
        while (number2 < limite){
            System.out.println(number+"*"+number2+" é igual a");
            System.out.println(number*number2);
            number2 = number2 +1;}    } }


