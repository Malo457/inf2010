package tp1;

import java.util.Collection;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        // ...
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
