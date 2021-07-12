public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int indeks;
    public static String nazwaUczelni = "UMCS";

    public void przwdstawSie(){
        System.out.println("Nazywam się "+imie+" "+nazwisko);
    }

    public void zalogujSie() { System.out.println("Loguję sie za pomocą " + nick); }

    public void podajNumerIndeksu(){ System.out.println("Mój numer indeksu to "+indeks); }

    public void podajEmail(){ System.out.println("Mój email "+email); }

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to " +nazwaUczelni);
        drugaMetoda();

    }
    public static void drugaMetoda(){
    System.out.println("Metoda w metodzie");
}

            /*public void infoStudent(){
        System.out.println(imie +" "+ nazwisko);
        System.out.println(nick);
        System.out.println(email);
        System.out.println(indeks);
        System.out.println("-----------------------");*/
}
