import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaTemperaturas = 0; // Onde vamos acumular os valores
        double temperaturaAtual;    // Para ler a entrada do momento
        int totalLeituras = 12;     // O requisito pede 12 leituras

        System.out.println("--- Sistema de Monitoramento Paiva Ltda ---");

        // Usamos um 'for' para repetir o processo 12 vezes
        for (int i = 1; i <= totalLeituras; i++) {
            
            // Usamos um 'do-while' para garantir que a temperatura seja válida
            do {
                System.out.print("Digite a temperatura " + i + " (entre 4 e 10): ");
                temperaturaAtual = sc.nextDouble();

                if (temperaturaAtual < 4 || temperaturaAtual > 10) {
                    System.out.println("Valor inválido! Por favor, digite uma temperatura entre 4 e 10.");
                }

            } while (temperaturaAtual < 4 || temperaturaAtual > 10); 
            // O laço acima só para de repetir quando o usuário digita algo correto

            // Agora somamos a temperatura válida ao nosso acumulador
            somaTemperaturas += temperaturaAtual;
        }

        // Cálculo da média final
        double media = somaTemperaturas / totalLeituras;

        System.out.println("\n-------------------------------------------");
        System.out.printf("A média de hoje das temperaturas é: %.1fº C\n", media);
        System.out.println("-------------------------------------------");

        sc.close();
    }
} 