package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JavaApplication1 {
    public static void main(String[] args) throws FileNotFoundException {
        Histogram<String> histograma = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\emails.txt";
        MailReader dominios = new MailReader(pathName);
        ArrayList<String> domis = dominios.getDominiosArray();
        for (int i = 0; i < domis.size(); i++) {
            histograma.increment(domis.get(i));
        }
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
