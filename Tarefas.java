package Gerenciador_de_Tarefas;

import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        
        boolean cond = true;

        while (cond) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Oque DeseJa Fazer\n"
            +"1- Adicionar tarefa\n"
            +"2- Marcar como concluida\n"
            +"3- Listar tarefas\n"
            +"4- Finalizar sessão\n");

            int escolha = scanner.nextInt();
            scanner.nextLine();//consume a quebra de linha para não dar problema

            switch (escolha) {
                case 1:
                    
                    break;
                
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("sessao finalizada");
                    cond = false;

                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

            
        }
    }    
}
