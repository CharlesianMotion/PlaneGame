import java.util.TimerTask;

public class AdvancedTimerTask extends TimerTask {
    public Airplane airplane;
    public AdvancedTimerTask(Airplane airplane){
        this.airplane = airplane;
    }
    @Override
    public void run() {
        airplane.speed = airplane.speed*4;
    }
}
