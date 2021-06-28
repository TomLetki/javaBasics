public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0]= "Anna";
        imiona[1]="Katarzyna";
        imiona[2]="Michał";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);
        System.out.println(imiona.length);

        int[] lottonumbers = new int[] {1,2,3,4,5,6}; //inny sposób deklarowania zmiennych

        for(int i=0; i<lottonumbers.length; i++) { // lenght to górna granica, długość tablicy
            System.out.println(lottonumbers[i]);
        }

    }
}
