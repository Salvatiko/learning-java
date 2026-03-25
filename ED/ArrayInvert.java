public class ArrayInvert {
    static int[] array = {44,85, 12, 9, 67, 63, 78, 33, 45};
    public static void main(String[] args) {
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int troca = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = troca;
        }
        
        System.out.print("Array invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
