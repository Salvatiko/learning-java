public class Arranjo {
    static int[] arranjo = {44,85, 12, 9, 67, 63, 78, 33, 45, 23};
    static int min = arranjo[0];
    static int max = arranjo[0];
    public static void main(String[] args) {
            for(int i = 0; i < arranjo.length; i++){
            int num =  arranjo[i];
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
    }

}
