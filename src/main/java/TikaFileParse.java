import org.apache.tika.Tika;

import java.io.File;

/**
 * File parsing to text using Apache Tika
 * Sep 2019 EvgenyT
 */

public class TikaFileParse {
    public static void main(String[] args) {
        // Get file
        File file = new File("E://1.pdf");
        // Init Tika
        Tika tika = new Tika();
        try {
            // Detect file type
            System.out.println(tika.detect(file));
            // Parse file to text
            System.out.println(tika.parseToString(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
