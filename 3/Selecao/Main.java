import java.util.Scanner;

public class Main {
    public static void selectionSort(String[] org) {
        int n = org.length;
        

        for (int i = 0; i < n-1; i++) {


            int min = i;
            for (int j = i+1; j < n; j++) {
                if (org[j].length() < org[min].length()) {
                    min = j;
                }
            }
            

            String temp = org[min];
            org[min] = org[i];
            org[i] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de nomes a serem inseridos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] nomes = new String[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        
        selectionSort(nomes);
        

        System.out.println("\nNomes ordenados pelo tamanho:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
