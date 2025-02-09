package Gerenciador_de_Tarefas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        
        boolean cond = true;

        while (cond) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Oque DeseJa Fazer\n\n"
            +"1- Adicionar tarefa\n"
            +"2- Marcar como concluida\n"
            +"3- Listar tarefas\n"
            +"4- Finalizar sessão\n");

            int escolha = scanner.nextInt();
            scanner.nextLine();//consume a quebra de linha para não dar problema

            switch (escolha) {
                case 1:
                    nova_tarefa();
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
    
    
    private static void nova_tarefa(){
        
         try {
            
            Scanner scan = new Scanner(System.in);
            FileWriter escrever = new FileWriter("tarefas.txt", true); 
            System.out.println("Escreva a nova tarefa");
            String tarefa = scan.nextLine();
            
            escrever.write(tarefa + "\n");
            escrever.close();
            System.out.println("\nTarefas salvas com sucesso!\n");
            
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " );
        }
        
        

    }

}
