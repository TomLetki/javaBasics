package listy;

import Docs.PdfDoc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ola");
        names.add("Paweł");


     /*   System.out.println(names.get(1));
        System.out.println(names.indexOf("Paweł"));
        System.out.println(names.lastIndexOf("Paweł"));
        System.out.println(names.contains("Oli"));
        System.out.println(names.size());
        System.out.println(names.isEmpty()); //false bo są elementy


        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty()); //false bo są elementy

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        List<PdfDoc> pdfDocs = new ArrayList<>();
        pdfDocs.add(new PdfDoc());

      */

        for (int i=0;i< names.size(); i++){
            System.out.println(names.get(i));
        }
        for (String elementyzlisty :names){
            System.out.println(elementyzlisty);
        }

    }
}
