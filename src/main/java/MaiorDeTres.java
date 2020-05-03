import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batata = scanner.nextInt();
        int eduardo = scanner.nextInt();
        int joane = scanner.nextInt();

        if (batata > eduardo && batata > joane) {
            System.out.println(batata);
        } else if (eduardo > batata && eduardo > joane) {
            System.out.println(eduardo);
        } else {
            System.out.println(joane);
        }
    }
}

