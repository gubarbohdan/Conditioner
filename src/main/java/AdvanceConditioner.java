import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gubar on 10.05.2017.
 */
public class AdvanceConditioner extends SimpleConditioner {
    private String mode;
    private List<String> modes;

    public AdvanceConditioner(){
        super();
        mode = "Normal";
        modes = new ArrayList<>();
        modes.add("Normal");
        modes.add("Night mode");
        modes.add("Eco mode");
    }

    @Override
    public void off() {
        super.off();
        mode = "Normal";
    }

    public void setMode(int mode) {
        if(isOn())
        this.mode = modes.get(mode);
    }

    @Override
    public String toString() {
        BigDecimal temp = new BigDecimal(getTemperature()).setScale(1, BigDecimal.ROUND_HALF_DOWN);
        return "AdvanceConditioner: Temperature = "+temp.toString() + ", Mode = "+mode;
    }
}
