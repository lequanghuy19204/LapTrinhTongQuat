package demTuTrongCauSuDungMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String[] word = words.toLowerCase().split("\\s+");
        Map<String, Integer> countWords = new HashMap<>();
        for (String str : word){
            countWords.put(str, countWords.getOrDefault(str, 0)+1);
        }
        for (Map.Entry<String , Integer> item : countWords.entrySet()){
            System.out.println("Từ " + item.getKey() + " xuất hiện " + item.getValue());
        }
    }
}
