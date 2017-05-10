import java.util.ArrayList;
import java.util.List;

/**
 * Created by gubar on 10.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Conditioner> conditioners = new ArrayList<>();
        conditioners.add(new SimpleConditioner());
        conditioners.add(new AdvanceConditioner());

        for (Conditioner c:conditioners
             ) {
            c.on();
            c.plus();
            c.plus();
            c.plus();
            System.out.println(c);
            if(c instanceof AdvanceConditioner){
                ((AdvanceConditioner) c).setMode(2);
                System.out.println(c);
            }
            c.minus();
            System.out.println(c);
            c.off();
            System.out.println(c);
        }

    }
}
