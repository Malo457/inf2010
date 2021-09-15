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
        Rectangle rect = new Rectangle(maxWidth, stripeThickness).translate(new Point2d(-halfMaxWidth, 0.0));
        return C.add(rect);
    }

    public static BaseShape create_a() {
        Ellipse bigEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse smallEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);
        bigEllipse.remove(smallEllipse);

        Rectangle rect = new Rectangle(stripeThickness, maxHeight).translate(new Point2d(halfMaxWidth , -halfMaxHeight));
        return bigEllipse.add(rect);
    }

    public static BaseShape create_C() {
        Ellipse bigEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse smallEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);
        bigEllipse.remove(smallEllipse);
         // a revoir pour a quel point des un c et si cest trop similaire
        Rectangle rectToRemove = new Rectangle(halfMaxWidth, halfMaxHeight / 2.0);
        rectToRemove.translate(new Point2d(halfMaxWidth / 2.0D, halfStripeThickness));
        bigEllipse.remove(rectToRemove);

        return bigEllipse;
    }

    public static BaseShape create_l() { return new Rectangle(stripeThickness, maxHeight); }

    // TODO
    public static BaseShape create_i() {
        Rectangle rect = new Rectangle(stripeThickness, maxHeight);
        Circle circle = new Circle(halfStripeThickness);

        rect.remove((new Rectangle(stripeThickness, maxHeight / 4)).translate(new Point2d(0.0,  - maxHeight / 2)));
        rect.add(circle);
        return rect;
    }

    // TODO
    public static BaseShape create_A() {
        BaseShape letterA = create_V();
        letterA.rotate(-Math.PI);
        Rectangle part2 = new Rectangle(halfMaxWidth, halfStripeThickness);//translate(new Point2d(0.0, halfMaxHeight));
        letterA.add(part2.translate(new Point2d(-12.0, halfMaxHeight + 15.0)));
        return letterA;
    }

    // TODO
    public static BaseShape create_V() {
        BaseShape letterV = new BaseShape();
        letterV.add(new Rectangle(halfStripeThickness, maxHeight).rotate(-3.0));
        letterV.add(new Rectangle(halfStripeThickness, maxHeight).rotate(3.0).translate(new Point2d(-10.0, 0.0)));
        return letterV;
    }

    // TODO
    public static BaseShape create_n() {
        BaseShape letter_n = new BaseShape();
        letter_n.add(new Ellipse(maxWidth, maxHeight));
        letter_n.remove(new Ellipse(maxWidth - stripeThickness - 3, maxHeight - stripeThickness));
        letter_n.remove(new Rectangle(maxWidth, halfMaxHeight).translate(new Point2d(-40.0, -100 + halfMaxHeight)));
        letter_n.add(new Rectangle(halfStripeThickness, halfMaxHeight).translate(new Point2d(-54 + maxWidth, 0.0)));
        letter_n.add(new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(-40.0, -100.0)));
        return letter_n;
    }

    // TODO
    public static BaseShape create_r() {
        BaseShape letter_r = create_n();
        letter_r.remove(new Rectangle(halfStripeThickness, halfMaxHeight + 24.0).translate(new Point2d(-54 + maxWidth, -24.0)));
        return letter_r;
    }

    // TODO
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();
        letterB.add(new Ellipse(maxWidth, halfMaxHeight).translate(new Point2d(0.0, halfMaxHeight)));
        letterB.remove(new Ellipse(maxWidth - stripeThickness, halfMaxHeight - stripeThickness).translate(new Point2d(0.0, halfMaxHeight)));
        letterB.add(new Ellipse(maxWidth, halfMaxHeight));
        letterB.remove(new Ellipse(maxWidth - stripeThickness, halfMaxHeight - stripeThickness));
        letterB.remove(new Rectangle(stripeThickness, maxHeight).translate(new Point2d(-40.0, -50.0)));
        letterB.add(new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(-25.0, -50.0)));
        return letterB;
    }
}
