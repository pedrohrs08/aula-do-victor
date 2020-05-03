import java.util.Scanner;

public class SouMaiorDeIdade {

    public static void main(String[] args) {
        int maioridade = 18;
        Scanner scanner = new Scanner(System.in);
        int minhaidade = scanner.nextInt();
        System.out.println(16 < maioridade);
        System.out.println(25 < maioridade);
        System.out.println(18 >= maioridade);
        System.out.println(18 != maioridade);

        boolean souMaiorDeIdade = minhaidade >= maioridade;
        boolean souIdoso = minhaidade > 65;

        if(souMaiorDeIdade && !souIdoso){
            System.out.println("Voce é maior de idade");
        }else if(souIdoso){
            System.out.println("Voce é um idoso");
        }
    }
}
