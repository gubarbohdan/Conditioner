import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by gubar on 10.05.2017.
 */
public class SimpleConditioner implements Conditioner{
    private double temperature;
    private boolean isOn;

    public SimpleConditioner(){
        temperature = 20;
        isOn = false;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
        temperature = 20;
    }

    @Override
    public void plus() {
        if (isOn)
        temperature+=0.1;
    }

    @Override
    public void minus() {
        if(isOn)
        temperature-=0.1;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        BigDecimal temp = new BigDecimal(temperature).setScale(1, BigDecimal.ROUND_HALF_DOWN);
        return "SimpleConditioner: Temperature = "+temp.toString();
    }
}
