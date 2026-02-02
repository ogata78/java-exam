import java.util.HashMap;
import java.util.Map;

public class exam5 {
    public static void main(String[] args) {
        String[] A={"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer" };

        Map<String, Integer> countMap=new HashMap<>();
        for (String sport : A) {
            countMap.put(sport, countMap.getOrDefault(sport, 0) + 1);
        }

        String mostSport="";
        int maxCount=0;

         for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostSport = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("最も出現回数の多いスポーツは"+mostSport+"で、出現回数は"+maxCount+"回です");


    }

}
