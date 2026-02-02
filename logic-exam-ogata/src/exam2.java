public class exam2 {
public static void  main(String[] args){

    int hour=11;
    int minute=59;
    int second=59;

    second++;

    if (second==60) {
        second=0;
        minute++;
        
    }

    if (minute==60) {
        minute=0;
        hour++;
        
    }

    if (hour==24) {
        hour=0;
        
    }
    System.out.println(
            "11 時 59 分 59 秒の 1 秒後は "
            + hour + " 時 " + minute + " 分 " + second + " 秒です"
        );

}

}
