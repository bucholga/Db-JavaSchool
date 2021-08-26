package day8.singleton;


public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min=3,max = 5)
    private int repeat;

    @Override
    public void clean() {
        System.out.println(repeat);
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVvvvvvvvvvvvvvvvvv");
        }
    }
}
