package nlp1;

import java.util.Map;

public class Main {

	   public static void main(String[] args) {
	        String filePath = "DEÐÝÞÝM.txt";  // test için buraya dosya yolu
	        try {
	            // 1. Dosyayý oku
	            String text = FileProcessor.readFile(filePath);

	            // 2. Ön iþlem: kelimeleri çýkar
	            String[] words = FileProcessor.preprocess(text);

	            // 3. Her n (1, 2, 3) için iþle
	            for (int n = 1; n <= 3; n++) {
	                System.out.println("\n=== " + n + "-gram Analysis === \n");
	                long startTime = System.currentTimeMillis();

	                Map<String, Integer> ngramCounts = NGramGenerator.generateNGrams(words, n);
	                NGramGenerator.printTop10(ngramCounts);

	                long endTime = System.currentTimeMillis();
	                System.out.println("Running time: " + (endTime - startTime) + " ms\n");
	            }

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

}
