package day1.part2.three;

public class YAMAHA implements IEngine {
    @Override
    public void start() {
        System.out.println("YAMAHA启动，速度60");
    }

    @Override
    public void stop() {
        System.out.println("YAMAHA停止，速度0");
    }

    @Override
    public void speedUp() {
        System.out.println("YAMAHA加速，速度80");
    }
}
