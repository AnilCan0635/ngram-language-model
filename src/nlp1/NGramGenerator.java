package nlp1;

import java.util.*;

public class NGramGenerator {
	
	 // n-gram üret ve frekanslarý döndür
    public static Map<String, Integer> generateNGrams(String[] words, int n) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= words.length - n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(words[i + j]);
                if (j != n - 1) sb.append(" ");
            }
            String ngram = sb.toString();
            map.put(ngram, map.getOrDefault(ngram, 0) + 1);
        }
        return map;
    }

    // En sýk geçen ilk 10 n-gram'ý yazdýr
    public static void printTop10(Map<String, Integer> map) {
        map.entrySet()
           .stream()
           .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
           .limit(10)
           .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
