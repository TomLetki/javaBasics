package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //tworzenie strumienia
        List<String> names = Arrays.asList("Tom","John","Tim","Anna","Joanna");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt =Arrays.asList(new Integer[]{1,4,6}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,5,7,3,2,1);
        IntStream intStream = IntStream.range(1,100);

        //przetwarzanie danych
        //filter - filtrowanie
        //map - zmiana elementu na inny np pomnożyć każdy elemnt razy 2
        //limit - zwraca liczbę elementów
        //peek - pozwala przeprowadzić operację na każdym elemencie
        //forEach = wykonanie akcji dla kżdego z elementów
        //count - zwroci ilość elementów w strumieniu
        //allMatch - sprawdza czy elementy spełniają jakiś warunek
        //collect - zwraca nowy typ na podstawie strumienia

        List<String> modifiedNames = streamNames.filter(el->el.startsWith("T"))
                .map(el->el.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(modifiedNames.get(1));
        System.out.println(modifiedNames.size());

        long count = intStream.filter(el ->el>20)
                .map(el->el*2)
                .count();
        System.out.println(count);
        


    }
}
