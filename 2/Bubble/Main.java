import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();


        bubbleSort(chars);


        String sortedString = new String(chars);


        System.out.println("String ordenada: " + sortedString);

        scanner.close();
    }

    
    public static void bubbleSort(char[] org) {
        int n = org.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (org[j] > org[j + 1]) {

                    char temp = org[j];
                    org[j] = org[j + 1];
                    org[j + 1] = temp;
                }
            }
        }
    }
}
