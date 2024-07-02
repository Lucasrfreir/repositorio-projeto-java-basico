import java.util.Scanner;

public class SimulacaoBancaria {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            double limiteDiario = scanner.nextDouble();
            double saldoRestante = limiteDiario;
    
            // Loop for para iterar sobre os saques
            for (int i = 1; ; i++) {
    
                double valorSaque = scanner.nextDouble();
    
                if (valorSaque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break; // Encerra o loop
                } else if (valorSaque > saldoRestante) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break; // Encerra o loop
                } else {
                    saldoRestante -= valorSaque;
                    System.out.printf("Saque %d realizado com sucesso. Saldo restante: %.2f\n", i, saldoRestante);
                }
            }
    
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
    