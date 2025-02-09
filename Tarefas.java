package Gerenciador_de_Tarefas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        
        boolean cond = true;

        while (cond) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\n\n-----|Oque Deseja Fazer|-----\n\n"
            +"|1- Adicionar tarefa--------|\n"
            +"|2- Marcar como concluida---|\n"
            +"|3- Listar tarefas----------|\n"
            +"|4- Finalizar sessão--------|\n");

            int escolha = scanner.nextInt();
            scanner.nextLine();//consome a quebra de linha para não dar problema

            switch (escolha) {
                case 1:
                    nova_tarefa();
                    break;
                
                case 2:

                    break;
                case 3:
                    listar_tarefas();
                    break;
                case 4:
                    System.out.println("----Sessão finalizada----");
                    cond = false;

                    break;
                default:
                    System.out.println("<----Opção invalida---->");
                    break;
            }

            
        }
    }  
    
    
    private static void nova_tarefa(){
        
         try {
            
            Scanner scan = new Scanner(System.in);
            FileWriter escrever = new FileWriter("tarefas.txt", true); 
            System.out.println("\n\n----Escreva a nova tarefa----");
            String tarefa = scan.nextLine();
            
            escrever.write(tarefa + "\n");
            escrever.close();
            System.out.println("\n<----Tarefas salvas com sucesso!---->");
            
        } catch (IOException e) {
            System.out.println("<----Erro ao escrever no arquivo---->" );
        }
        
        

    }

    private static void listar_tarefas(){
        
        System.out.println("\n\n----Aqui estão suas tarefas----\n\n");
        try{
            BufferedReader leitor = new BufferedReader(new FileReader("tarefas.txt"));
            String ler;

            while ((ler = leitor.readLine()) != null ) {
                System.out.println(ler);
                
            }
            leitor.close();
            
        } catch(IOException e){
            System.out.println("\n\n<----Houve um problema ao listar as tarefas---->");
            System.out.println("<----Verifique se você ja criou uma tarefa----->\n\n");
        }
    }

}
