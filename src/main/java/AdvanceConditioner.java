import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Наследования класса SimpleConditioner
 */
public class AdvanceConditioner extends SimpleConditioner {
    private String mode;
    private List<String> modes;

    public AdvanceConditioner() {
        super();
        mode = "Normal";
        modes = new ArrayList<>();
        modes.add("Normal");
        modes.add("Night mode");
        modes.add("Eco mode");
        setStep(0.1);
    }

    @Override
    public void off() {
        super.off();
        mode = "Normal";
    }

    public void setMode(int mode) {
        if (isOn())
            this.mode = modes.get(mode);
    }

    /*
     *Полиморфизм метода toString
     */
    @Override
    public String toString() {
        String simple = super.toString();
        return "AdvanceConditioner: "+simple + ", Mode = " + mode;
    }
}
