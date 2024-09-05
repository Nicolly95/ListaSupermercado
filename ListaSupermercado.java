import java.util.ArrayList;
import java.util.Scanner;

public class ListaSupermercado {

    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);        

        //ESTRUTURA WHILE: adiciona os ítens do usuário no Array (lista do mercado)
        while (true) { 
                            
            System.out.println("Digite um ítem (ou \"sair\" ): ");
            String itens = entrada.nextLine(); //Atribuíndo a entrada do usuário do Scanner "entrada" na variável "itens"
            produtos.add(itens);               //Adicionando "itens" no Array "produtos"
                
                if (itens.equalsIgnoreCase("sair")) {
                    break;
                }
    
        }
        System.out.println();       //Adiciona quebra de linha

        //ESTRUTURA FOREACH: exibe a lista que o usuário digitou
        System.out.println("SUA LISTA DE COMPRAS DO SUPERMERCADO: ");        
        System.out.println();       //Adiciona quebra de linha

        for(String adicionados : produtos) {
            System.out.println(adicionados);
        }

        entrada.close();        //Fecha o Scanner
    }

}


