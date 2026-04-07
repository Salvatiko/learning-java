public class InsertionSort {
    public static void insertionSort(char[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            char cur = a[i];
            int j = i - 1;

            while ((j >= 0) && (a[j] > cur))
                a[j + 1] = a[j--];
            
            a[j + 1] = cur;
        }
    }
    public static void main(String[] args) {
        // array declarado
        char[] letras = {'Z', 'B', 'X', 'A', 'M', 'C'};
        
        // array sem ordem
        System.out.println("Array ANTES da ordenacao:");
        System.out.println(letras); 
        
        // chamamos o método de ordenação
        insertionSort(letras);
        
        // resultado ordenado
        System.out.println("\nArray DEPOIS da ordenacao:");
        System.out.println(letras); 
    }
}
