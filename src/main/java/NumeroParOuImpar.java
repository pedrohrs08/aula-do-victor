import java.util.Scanner;

public class NumeroParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2==0) {
            System.out.println("Par");
        }else if (number%2!=0){
            System.out.println("Ímpar");
        }
    }
}
