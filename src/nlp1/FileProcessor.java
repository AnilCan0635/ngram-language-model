package nlp1;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileProcessor {
	
	 // Dosyayý oku ve tek string olarak döndür
    public static String readFile(String filePath) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append(" ");
        }
        reader.close();
        return sb.toString();
    }

    // Metni temizle (noktalama çýkar, küçük harfe çevir, boþlukla böl)
    public static String[] preprocess(String text) {
        text = text.toLowerCase().replaceAll("[^a-zA-ZçðýöþüÇÐÝÖÞÜ\\s]", "");
        return text.trim().split("\\s+");
    }
}
