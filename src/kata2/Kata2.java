package kata2;
import java.util.Map;
/**
 *
 * @author Airam
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};
        
        Histogram hist = new Histogram(data);
        
        Map<String,Integer> histogr = hist.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }    
}
