public class InkrementacjaDekremaentacja {
//Inkrementacja - Zwiększanie wartości o jeden
    public static void main(String[] args) {

        int a = 0;
        System.out.println("Wartość a ="+a);//0

        int b = a++;//postinkrementacja
        System.out.println("Wartość b to a++ ="+b);//0
        System.out.println("Wartość a ="+a);//1

        int c = ++a;//preinkrementacja
        System.out.println("Wartość c to ++a = "+c); //2
        System.out.println("Wartość a = "+a); //2


        // Dekrementacja - Zmniejszanie wartości o jeden

        int d = 0;
        System.out.println("Wartość d ="+d);//0

        int e = d--;//postdekrementacja
        System.out.println("Wartość e to d++ ="+e);//0
        System.out.println("Wartość d ="+d);//-1

        int f = --d;//predekrementacja
        System.out.println("Wartość f to --d = "+f); //-2
        System.out.println("Wartość d = "+d); //-2


    }
}
