package tp1;

import java.util.concurrent.RecursiveAction;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2.0; // avant 2
    final static Double halfMaxWidth = maxWidth / 2.0; // avant 2
    final static Double stripeThickness = maxHeight / 8.0; // avant 8
    final static Double halfStripeThickness = stripeThickness / 2.0; // avant 2

    public static BaseShape create_e() {
        BaseShape C = create_C();
        Rectangle rect = new Rectangle(stripeThickness, maxWidth).rotate(90.0);
        return C.add(rect);
    }

    public static BaseShape create_a() {
        BaseShape C = create_C();
        Rectangle rect = new Rectangle(stripeThickness, maxHeight).translate(new Point2d(halfMaxWidth, 0.0));
        return C.add(rect);
    }

    public static BaseShape create_C() {
        Ellipse bigEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse smallEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);
        bigEllipse.remove(smallEllipse);

        Rectangle rectToRemove = new Rectangle(stripeThickness, maxHeight / 2);
        rectToRemove.translate(new Point2d(halfMaxWidth / 2, 0.0));
        bigEllipse.remove(rectToRemove);

        return bigEllipse;
    }

    public static BaseShape create_l() { return new Rectangle(stripeThickness, maxHeight); }

    // TODO
    public static BaseShape create_i() {
        Rectangle rect = new Rectangle(stripeThickness, maxHeight);
        Circle circle = new Circle(halfStripeThickness);

        rect.remove((new Rectangle(stripeThickness, maxHeight / 4)).translate(new Point2d(0.0, 3 * maxHeight / 4)));
        rect.add(circle);
        return rect;
    }

    // TODO
    public static BaseShape create_A() {
        BaseShape letterA = create_V();
        letterA.rotate(-Math.PI);
        Rectangle part2 = new Rectangle(halfMaxHeight, stripeThickness).rotate(Math.PI);//translate(new Point2d(0.0, halfMaxHeight));
        letterA.add(part2.translate(new Point2d(0.0, halfMaxHeight)));
        return letterA;
    }

    // TODO
    public static BaseShape create_V() {
        BaseShape letterV = new BaseShape();
        letterV.add(new Rectangle(stripeThickness, maxHeight).rotate(-3.0));
        letterV.add(new Rectangle(stripeThickness, maxHeight).rotate(3.0));
        return letterV;
    }

    // TODO
    public static BaseShape create_n() {
        return new Rectangle(stripeThickness, maxHeight);
    }

    // TODO
    public static BaseShape create_r() {
        return new Rectangle(stripeThickness, maxHeight);
    }

    // TODO
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();
        letterB.add(new Ellipse(halfMaxWidth, halfMaxHeight).translate(new Point2d(0.0, halfMaxHeight)));
        letterB.add(new Ellipse(halfMaxWidth, halfMaxHeight));
        letterB.add(new Rectangle(stripeThickness, maxHeight).translate(new Point2d(0.0, -50.0)));
        return letterB;
    }
}
