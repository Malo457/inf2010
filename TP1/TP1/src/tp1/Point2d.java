package tp1;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    public Point2d(Double x, Double y) {
        super(new Double[]{x, y} );
    }

    public Point2d(Double[] vector) {
        super(vector.clone());
    }

    public Double X() { return vector[X];}

    public Double Y() { return vector[Y];}

    @Override
    public Point2d translate(Double[] translateVector) {
        PointOperator.translate(this.vector, translateVector);
        return this;
    }

    public Point2d translate(Point2d translateVector) {
        return this.translate(translateVector.vector);
    }

    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        PointOperator.rotate(this.vector, rotationMatrix);
        return this;
    }

    public Point2d rotate(Double angle) {
        double x = this.vector[this.X];
        double y = this.vector[this.Y];

        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);

        this.vector[this.X] = newX;
        this.vector[this.Y] = newY;

        return this;
    }

    @Override
    public Point2d divide(Double divider) {
        PointOperator.divide(this.vector, divider);
        return this;
    }

    @Override
    public Point2d multiply(Double multiplier) {
        PointOperator.multiply(this.vector, multiplier);
        return this;
    }

    @Override
    public Point2d add(Double adder) {
        PointOperator.add(this.vector, adder);
        return this;
    }

    @Override
    public Point2d clone() {
        return new Point2d(this.X(), this.Y());
    }
}
