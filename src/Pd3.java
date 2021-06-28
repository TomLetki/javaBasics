public class Pd3 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if(i%3==0){
                System.out.println("liczba i podzielna przez 3 to "+i);
            }
        }
    int[] tablica = new int[] {1,3,5,7,0};
        /*for (int i=tablica.length-1; i>=0; i--){
            System.out.println(tablica[i]);
        }*/
        for(int i=0; i<(tablica.length/2); i++){
            int temp = tablica[i];
            tablica[i]=tablica[tablica.length-1-i];
            tablica[tablica.length-1-i]=temp;
        }
        for (int i=0; i<tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }
}
