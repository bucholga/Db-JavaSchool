package radio_alarm;

public class RadioAlarm implements Radio, Alarm{

    @Override
    public void a() {
        System.out.println("A method");
    }

    @Override
    public void b() {
        System.out.println("B method");
    }
    @Override
    public void c() {
        System.out.println("C method");
    }
    @Override
    public void d() {
        System.out.println("D method");
    }
}
