import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rendimento rendimento = new Rendimento(7.5, 5.0, scanner);
        rendimento.calcularRendimento();
    }
}
