import java.util.HashMap;

public class Exam4 {

    public static void main(String[] args) {
        HashMap<String, String> prefectureMap = new HashMap<>();

    
        prefectureMap.put("東京", "東京");
        prefectureMap.put("埼玉", "さいたま");
        prefectureMap.put("茨城", "水戸");
        prefectureMap.put("沖縄", "那覇");

        
        System.out.println( "埼玉の県庁所在地は「" + prefectureMap.get("埼玉") + "」です" );

        
        System.out.println("沖縄の県庁所在地は「" + prefectureMap.get("沖縄") + "」です");
    
        
    }
     

}
