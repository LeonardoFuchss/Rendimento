import java.util.Scanner;

public class Rendimento {
    //propriedades
    private double valor;
    private int quantMeses;
    private double taxaSelic;
    private double taxaRef;
    private Scanner scanner = new Scanner(System.in);


    //Construtor com valor padrão que irei definir e com o scanner para a interação com o usuário.
    public Rendimento(double taxaSelic, double taxaRef) {
        this.taxaSelic = taxaSelic;
        this.taxaRef = taxaRef;
    }
    public void interacaoUsuario(){
        System.out.println("Olá, informe o valor que queira investir: ");
        this.valor = scanner.nextDouble();
        System.out.println("Agora, informe a quantidade de meses que queira deixar rendendo: ");
        this.quantMeses = scanner.nextInt();
    }


    public double getValor() {
        return this.valor;
    }

    public int getQuantMeses() {
        return this.quantMeses;
    }


    public double calculaRendimento() {
        double rendimento;
        if (this.taxaSelic < 8.5) {
            rendimento = valor + (0.70 * taxaSelic + taxaRef) * quantMeses;
        } else {
            rendimento = valor + (0.05 * taxaSelic + taxaRef) * quantMeses;

        }
        return rendimento;
    }

    public void mesAmes() {
        double rendimentoMensal = ((calculaRendimento() - getValor()) / getQuantMeses());
        System.out.println("O seu rendimento final foi de " + calculaRendimento());
        System.out.println("E o seu rendimento mensal foi de: " + rendimentoMensal);
    }
}




