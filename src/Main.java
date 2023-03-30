import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite seu peso: ");
        p1.setPeso(sc.nextDouble());
        System.out.println("Digite sua altura: ");
        p1.setAltura(sc.nextDouble());
        p1.calculaimc();
        System.out.println("Seu IMC é: " + p1.getImc());
    }
}