import java.math.BigDecimal;

/**
 * Реализация интерфейса Conditioner
 */
public class SimpleConditioner implements Conditioner{
    private double temperature;
    private boolean isOn;
    private double step;

    private static final double MIN_TEMP = 15.0;
    private static final double MAX_TEMP = 28.0;

    public SimpleConditioner(){
        temperature = 20;
        isOn = false;
        setStep(0.5);
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

    /*
     *Инкапсуляция параметра temperature
     */
    @Override
    public void plus() {
        if (isOn && temperature < MAX_TEMP)
        temperature+=step;
    }

    @Override
    public void minus() {
        if(isOn && temperature > MIN_TEMP)
        temperature-=step;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setStep(double step) {
        this.step = step;
    }

    /*
     *Полиморфизм метода toString
     */
    @Override
    public String toString() {
        BigDecimal temp = new BigDecimal(temperature).setScale(1, BigDecimal.ROUND_HALF_DOWN);
        return "SimpleConditioner: isOn: "+ isOn+" Temperature = "+temp.toString();
    }
}
