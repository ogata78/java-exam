public class Exam3 {
    public static void main(String[] args) {
        int AA=200;
        int AB=3;

        int BA=250;
        int BB=4;

        int subtotal=(AA*AB)+(BA*BB);//小計
        int tax=(int)(subtotal*0.10);//消費税
        int total=subtotal+tax;//合計金額

        System.out.println("小計");
        System.out.println(subtotal);
        System.out.println("消費税");
        System.out.println(tax);
        System.out.println("合計金額");
        System.out.println(total);
    }

}
