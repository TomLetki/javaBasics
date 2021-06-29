public class StudentChk {
    public static void main(String[] args) {
     Student tomek = new Student();
        tomek.imie = "Tomasz";
        tomek.nazwisko = "Letki";
        tomek.email = "tlet@gmail.com";
        tomek.nick = "tomlet";
        tomek.indeks=22272;

     Student ania = new Student();
        ania.imie = "Anna";
        ania.nazwisko = "Kowalska";
        ania.email = "anew@gmail.com";
        ania.nick = "anew";
        ania.indeks=32272;

     Student jan = new Student();
        jan.imie = "Jan";
        jan.nazwisko = "Wielki";
        jan.email = "jenek@gmail.com";
        jan.nick = "janek";
        jan.indeks=56272;

    Student[] studenci = new Student[3];
    studenci[0]=tomek;
    studenci[1]=ania;
    studenci[2]=jan;

    for(int i=0;i< studenci.length;i++){
    //studenci[i].infoStudent();
        studenci[i].przwdstawSie();
        studenci[i].zalogujSie();
        studenci[i].podajEmail();
        studenci[i].podajNumerIndeksu();
        System.out.println("-------------------------");
    }

    }



}
