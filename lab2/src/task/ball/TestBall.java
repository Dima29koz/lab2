package task.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(0.3, 0.4);
        b1.setXY(0.3, 0.2);
        b1.move(0.7, 1.6);
        System.out.println(b1);
        System.out.println(b2);
    }
}
