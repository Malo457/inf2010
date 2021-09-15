package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {

    public Ellipse(Double widthRadius, Double heightRadius) {
        super();
        widthRadius /= (2.0);
        heightRadius /= (2.0);

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
