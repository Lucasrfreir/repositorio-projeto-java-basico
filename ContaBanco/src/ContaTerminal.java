
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        /*PROJETO BASICO SOBRE DADOS BANCARIOS
         * @Author:LUCASFREIRE
         * @Since: 1.0
         */
        Scanner sc = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibir as mensagens para o usuario
        System.out.println("---------PRECISAMOS CRIAR SUA CONTA!---------");
        System.out.println("Por favor, Digite o numero da agencia: ");
        agencia = sc.nextLine();
        System.out.println("Agora digite o NUMERO da conta do Usuario: ");
        numero = sc.nextInt();
        System.out.println("Digite seu nome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.println("Saldo inicial: ");
        saldo = sc.nextDouble();
      
        //Obter pelo Scanner os valores digitados pelo terminal
        System.out.println("AGENCIA: " + agencia);
        System.out.println("NUMERO DA CONTA: " + numero);
        System.out.println("NOME DO USUARIO: " + nomeCliente);
        System.out.println("SALDO INICIAL: " + saldo);
        
        //Exibir a mensagem "Conta Criada"
        System.out.println("CONTA CRIADA COM SUCESSO!!");
         System.out.println("Obrigado pro criar sua conta, " 
         + nomeCliente 
         + " Sua agencia é: " 
         + agencia 
         + " conta: " 
         + numero 
         + " E seu saldo ja esta pronto para ser sacado. valor: " 
         + saldo);

    sc.close();
    }
}
