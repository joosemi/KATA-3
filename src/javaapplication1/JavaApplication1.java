package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        Histogram<String> histograma = new Histogram<>();
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
