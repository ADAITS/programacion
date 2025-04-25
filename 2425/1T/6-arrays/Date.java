import java.text.SimpleDateFormat;
import java.time.Instant;


public class Date {
    public static void main(String[] args) {
        while(true){
            // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // Date date = new Date();
            // String fecha = formatter.format(Instant.now().toString());
            System.out.print("\r"+Instant.now());
            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
