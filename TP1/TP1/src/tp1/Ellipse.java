package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {

    public Ellipse(Double widthRadius, Double heightRadius) {
        super();
        widthRadius /= (2.0);
        heightRadius /= (2.0);
        for (int degre = 0; degre <= 360; degre++) {
            double x = widthRadius * Math.sin(Math.toRadians(degre));
            double y = heightRadius * Math.cos(Math.toRadians(degre));
            this.add(new Point2d(x, y));
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
