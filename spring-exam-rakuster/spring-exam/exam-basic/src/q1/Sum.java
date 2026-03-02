package q1;

/**
 * Q1. 1から10までの数値を足しあわせ、コンソールに出力しなさい。
 *
 * @author y.morinaga
 */
public class Sum {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++){
            total +=i;
        }
        System.out.println("合計は " + total + " です");
    }


}
