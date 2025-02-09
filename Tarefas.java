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
            +"|2- Listar tarefas----------|\n"
            +"|3- Finalizar sessão--------|\n"
            +"|4- Apagar todas as tarefas-|\n");

            int escolha = scanner.nextInt();
            scanner.nextLine();//consome a quebra de linha para não dar problema

            switch (escolha) {
                case 1:
                    nova_tarefa();
                    break;
                
                case 2:
                    listar_tarefas();
                    break;
                case 3:
                    System.out.println("----Sessão finalizada----");
                    cond = false;

                    break;
                case 4:
                    System.out.println("\nVocê tem certeza que deseja apagar TUDO?\n"
                    +"|1- SIM|\n"
                    +"|2- NÃO|");
                    int esc = scanner.nextInt();
                    if (esc == 1) {

                        apagar_tarefas();   
                    } else{
                        System.out.println("\n\n<----As tarefas não foram apagadas!---->\n\n");
                    }
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

    private static void apagar_tarefas(){
        
        try {
           
           Scanner scan = new Scanner(System.in);
           FileWriter escrever = new FileWriter("tarefas.txt", false); 
           
           
           
           escrever.write(" \n");
           escrever.close();
           System.out.println("\n<----Tarefas excluidas com sucesso!---->");
           
       } catch (IOException e) {
           System.out.println("<----Erro ao Apagar---->" );
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
