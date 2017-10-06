package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1,1,1,0,3,4,4,3,0,0,1,1,1,1,3,2};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        for(int key : histogram.keySet()){
            System.out.println("El número " + key + " aparece " 
                    + histogram.get(key) + " veces");
        }    
    }
}

