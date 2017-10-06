package kata2;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {1,1,1,0,3,4,4,3,0,0,1,1,1,1,3,2};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
       
        for (int key : histogr.keySet()){
            System.out.println(key + " aparece " + histogr.get(key) + " veces");
        }    
    }
}

