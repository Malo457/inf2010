package tp1;

import java.util.Collection;

public class Rectangle extends BaseShape {
    final double POINT_FREQUENCY = 0.5;

    public Rectangle(Double width, Double height) {
        super();
        for (double i = 0; i <= width; i+= width) {
            for (double j = 0; j <= height; j+=POINT_FREQUENCY) {
                this.add(new Point2d(i, j));
            }
        }
        for (double i = 0; i <= height; i+= height) {
            for (double j = 0; j <= width; j+=POINT_FREQUENCY) {
                this.add(new Point2d(j, i));
            }
        }
    }

    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    @Override
    public Rectangle translate(Point2d point) {
        super.translate(point);
        return this;
    }

    @Override
    public Rectangle rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.getCoordsDeepCopy());
    }
}
