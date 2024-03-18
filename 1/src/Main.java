import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



class Main {
  public static void main(String[] args) {
  

    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    Scanner scanner = new Scanner(System.in);
    boolean controleFluxo = true; 
    
    while(controleFluxo){
    
      System.out.println("Digite seu nome:");
      String nome = scanner.nextLine();

      Pessoa pessoa = new Pessoa(nome);
      pessoas.add(pessoa);
      
      
      System.out.println("Deseja adicionar mais usuários? (S/N)");
      String resposta = scanner.nextLine();
      
      // para o loop caso o usuário digite "N"
      if(resposta.equalsIgnoreCase("N")){
        controleFluxo = false;
      }
    }  
    System.out.println("Pessoas na lista ordenada: ");
    // organizar os nomes da lista
    Collections.sort(pessoas, (pessoa, outraPessoa) -> pessoa.getNome().compareToIgnoreCase(outraPessoa.getNome()));
    for (Pessoa pessoa : pessoas) {

        System.out.println(pessoa);
    }

    scanner.close(); 
  }
}
