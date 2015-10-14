package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaApplication1 {
    private static String pathname;

    public static void main(String[] args) throws FileNotFoundException {
        
        Histogram<String> histograma = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\emails.txt";
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            while((mail=fileIn.readLine()) != null) {
                if(!mail.contains("@"))
                    continue;
                histograma.increment(mail.split("@")[1]);
            }
                
                
        } catch (Exception e) {
            System.out.println("El fichero no existe " + e);
        }
    
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
