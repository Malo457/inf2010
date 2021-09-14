package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {

    public Ellipse(Double widthRadius, Double heightRadius) {
        /*super();
        widthRadius /= (2.0);
        heightRadius /= (2.0);

        Collection<Point2d> newCoords = new ArrayList();
        for (int i = 0; i < widthRadius; i++) {
            for (int degre = 0; degre <= 360; degre++) {
                double x = (widthRadius - i) * Math.sin(Math.toRadians(degre));
                double y = (heightRadius - i) * Math.cos(Math.toRadians(degre));
                Point2d newCoord = new Point2d(x, y);
                if (!newCoords.contains(newCoord)) newCoords.add(new Point2d(x, y));
            }
        }
        this.addAll(newCoords);*/

        super(new ArrayList());
        double largeur = -widthRadius / 2.0D;
        double hauteur = -heightRadius / 2.0D;

        for(double i = largeur; i < -1.0D * largeur; ++i) {
            for(double j = hauteur; j < -1.0D * hauteur; ++j) {
                double evolutionX = Math.pow(i, 2.0D) / Math.pow(largeur, 2.0D);
                double evolutionY = Math.pow(j, 2.0D) / Math.pow(hauteur, 2.0D);
                double Xy = evolutionX + evolutionY;
                if (Xy <= 1.0D) {
                    this.add(new Point2d(i, j));
                }
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
