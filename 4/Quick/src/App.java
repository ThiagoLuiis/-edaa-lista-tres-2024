public class App {
    public static void quickSort(char[] org, int low, int high) {
        if (low < high) {
            int pi = partition(org, low, high);
            
            quickSort(org, low, pi - 1);
            quickSort(org, pi + 1, high);
        }
    }
    
    public static int partition(char[] org, int low, int high) {
        char pivot = org[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (org[j] < pivot) {
                i++;
                
                // Troca org[i] e org[j]
                char temp = org[i];
                org[i] = org[j];
                org[j] = temp;
            }
        }
        
        // Troca org[i+1] e org[high] (ou seja, o pivô)
        char temp = org[i + 1];
        org[i + 1] = org[high];
        org[high] = temp;
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        String palavra = "THIAGO LUIS";
        char[] charorga = palavra.toCharArray();
        
        System.out.println("String desorganizada: " + palavra);
        
        quickSort(charorga, 0, charorga.length - 1);
        
        String sort = new String(charorga);
        System.out.println("String ordenada: " + sort);
    }
}
