package tp1;

import java.util.Collection;

public class Ellipse extends BaseShape {

    double RATIO_RADIUS_DIAMETER = 2.0;

    public Ellipse(Double width, Double height) {
        super();

        Double widthRadius = width / RATIO_RADIUS_DIAMETER;
        Double heightRadius = height / RATIO_RADIUS_DIAMETER;

        for(double i = -widthRadius; i < widthRadius; i++) {
            for(double j = -heightRadius; j < heightRadius; j++) {
                double x = Math.pow(i, 2.0) / Math.pow(widthRadius, 2.0);
                double y = Math.pow(j, 2.0) / Math.pow(heightRadius, 2.0);
                if (x + y <= 1)
                    this.add(new Point2d(i, j));
            }
        }
    }

    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    @Override
    public Ellipse translate(Point2d point) {
        super.translate(point);
        return this;
    }

    @Override
    public Ellipse rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    @Override
    public Ellipse clone() {
        return new Ellipse(this.getCoordsDeepCopy());
    }
}
