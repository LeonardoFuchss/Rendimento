import java.util.Scanner;
public class Rendimento {
    //propriedades
    private double valor;
    private int quantMeses;
    private double taxaSelic;
    double taxaRef;

    //Construtor com valor padrão que irei definir e com o scanner para a interação com o usuário.
    public Rendimento(double taxaSelic, double taxaRef, Scanner scanner) {
        this.taxaSelic = taxaSelic;
        this.taxaRef = taxaRef;
        System.out.println("Olá, informe o valor que queira investir: ");
        this.valor = scanner.nextDouble();
        System.out.println("Agora, informe a quantidade de meses que queira deixar rendendo: ");
        this.quantMeses = scanner.nextInt();

    }
    public void calcularRendimento() {

        if (this.taxaSelic < 8.5) {
            System.out.println("O seu rendimento em " +quantMeses+ " meses foi de: " +(valor + (0.70 * taxaSelic + taxaRef) * quantMeses));
        } else {
            System.out.println("O seu rendimento em " +quantMeses+ " meses foi de: " +(valor + (0.05 * taxaSelic + taxaRef) * quantMeses));
        }
    }
}


