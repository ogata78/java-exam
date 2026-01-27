import java.util.ArrayList;

public class Exam1 {

    public static void main(String[] args) {

        
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("後藤");
        nameList.add("山田");
        nameList.add("佐藤");
        nameList.add("田中");


        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
