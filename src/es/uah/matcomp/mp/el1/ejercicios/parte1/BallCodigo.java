package es.uah.matcomp.mp.el1.ejercicios.parte1;

public class BallCodigo {
    public BallCodigo() {
    }

    public static void main(String[] args) {
        Ball ball = new Ball(1.1F, 2.2F, 10, 3.3F, 4.4F);
        System.out.println(ball);
        ball.setX(80.0F);
        ball.setY(35.0F);
        ball.setRadius(5);
        ball.setXDelta(4.0F);
        ball.setYDelta(6.0F);
        System.out.println(ball);
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());
        float xMin = 0.0F;
        float xMax = 100.0F;
        float yMin = 0.0F;
        float yMax = 50.0F;

        for(int i = 0; i < 15; ++i) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            if (xNew + (float)radius > xMax || xNew - (float)radius < xMin) {
                ball.reflectHorizontal();
            }

            if (yNew + (float)radius > yMax || yNew - (float)radius < yMin) {
                ball.reflectVertical();
            }
        }

    }
}
