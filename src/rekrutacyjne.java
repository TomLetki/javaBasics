import java.util.HashMap;
import java.util.Map;

public class rekrutacyjne {
    //int[] numbers = new int[] {1,2,2,3,5,5,6}

    public static void main(String[] args) {
        countOccurances(new int[] {1,2,2,3,5,5,6});

    }
    public static void countOccurances(int[] numbers){
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i=0; i< numbers.length; i++){
            if(occurences.containsKey(numbers[i])){
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i], value+1);
            }else{
                occurences.put(numbers[i], 1);
            }
        }
        for (Integer key : occurences.keySet()){
            System.out.println(" Liczba "+ key + " występuje "+occurences.get(key));
        }

    }
}
