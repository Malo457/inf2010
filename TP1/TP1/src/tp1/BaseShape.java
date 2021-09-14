package tp1;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape implements Cloneable {
    private Collection<Point2d> coords;

    public BaseShape() {
        this.coords = new ArrayList<>();
    }

    public BaseShape(Collection<Point2d> coords) {
        this.coords = new ArrayList<>(coords);
    }

    public BaseShape add(Point2d coord) {
        this.coords.add(coord);
        return this;
    }
    public BaseShape add(BaseShape shape) {
        this.coords.addAll(shape.getCoords());
        return this;
    }
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(coords);
        return this;
    }
    public BaseShape remove(Point2d coord) {
        this.coords.remove(coord);
        return this;
    }
    public BaseShape remove(BaseShape shape) {
        this.coords.removeAll(shape.getCoords());
        return this;
    }
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    public Collection<Point2d> getCoords() {
        return new ArrayList<Point2d>(this.coords);
    }

    public Collection<Point2d> getCoordsDeepCopy() {
        Collection<Point2d> newColl = new ArrayList<>();
        for (Point2d coord : this.coords) {
            Point2d newPoint = new Point2d(coord.X(), coord.Y());
            newColl.add(newPoint);
        }
        return newColl;
    }


    public BaseShape translate(Point2d point) {
        for (Point2d coord : this.coords){
            coord = coord.translate(point);
        }
        return this;
    }

    public BaseShape rotate(Double angle) {
        for (Point2d coord : this.coords){
            coord = coord.rotate(angle);
        }
        return this;
    }

    public Double getMaxX() {
        if (this.coords.size() == 0) return 0.0;
        Point2d max = this.coords.iterator().next();
        for(Point2d coord : this.coords) {
            if (coord.X() > max.X()) max = coord;
        }
        return max.X();
    }

    public Double getMaxY() {
        if (this.coords.size() == 0) return 0.0;
        Point2d max = this.coords.iterator().next();
        for(Point2d coord : this.coords) {
            if (coord.Y() >= max.Y()) max = coord;
        }
        return max.Y();
    }

    public Point2d getMaxCoord() {
        return new Point2d(this.getMaxX(), this.getMaxY());
    }

    public Double getMinX() {
        if (this.coords.size() == 0) return 0.0;
        Point2d min = this.coords.iterator().next();
        for(Point2d coord : this.coords) {
            if (coord.X() <= min.X()) min = coord;
        }
        return min.X();
    }

    public Double getMinY() {
        if (this.coords.size() == 0) return 0.0;
        Point2d min = this.coords.iterator().next();
        for(Point2d coord : this.coords) {
            if (coord.Y() <= min.Y()) min = coord;
        }
        return min.Y();
    }

    public Point2d getMinCoord() {
        return new Point2d(this.getMinX(), this.getMinY());
    }

    public BaseShape clone() {
        return new BaseShape(this.getCoordsDeepCopy());
    }
}
