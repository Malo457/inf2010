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
        BaseShape letterE = create_C();
        Rectangle horizontalRect = new Rectangle(maxWidth, stripeThickness).translate(new Point2d(-halfMaxWidth, 0.0));
        return letterE.add(horizontalRect);
    }

    public static BaseShape create_a() {
        Ellipse bigEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse smallEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);
        bigEllipse.remove(smallEllipse);

        Rectangle verticalRect = new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(halfMaxWidth , -halfMaxHeight));
        BaseShape letterA = bigEllipse.add(verticalRect);
        return letterA;
    }

    public static BaseShape create_C() {
        Ellipse bigEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse smallEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);
        bigEllipse.remove(smallEllipse);
        Rectangle rectToRemove = new Rectangle(halfMaxWidth, halfMaxHeight / 2.0);
        rectToRemove.translate(new Point2d(halfMaxWidth / 2.0D, halfStripeThickness));
        bigEllipse.remove(rectToRemove);

        return bigEllipse;
    }

    public static BaseShape create_l() { return new Rectangle(halfStripeThickness, maxHeight); }

    public static BaseShape create_i() {
        Rectangle rect = new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(0.0, - halfStripeThickness));
        Circle dot = new Circle(stripeThickness);
        dot.translate(new Point2d(halfStripeThickness / 2.0,0.0));
        Rectangle rectToRemove = new Rectangle(stripeThickness,  maxHeight / 5.0);

        rect.remove(rectToRemove);
        rect.add(dot);
        return rect;
    }

    public static BaseShape create_A() {
        BaseShape letterA = create_V();
        letterA.rotate(-Math.PI);
        Rectangle horizontalBar = new Rectangle(halfMaxWidth, halfStripeThickness);
        letterA.add(horizontalBar.translate(new Point2d(-12.0, halfMaxHeight + 15.0)));
        return letterA;
    }

    public static BaseShape create_V() {
        BaseShape letterV = new BaseShape();
        letterV.add(new Rectangle(halfStripeThickness, maxHeight).rotate(-3.0));
        letterV.add(new Rectangle(halfStripeThickness, maxHeight).rotate(3.0).translate(new Point2d(-10.0, 0.0)));
        return letterV;
    }

    public static BaseShape create_n() {
        BaseShape letterN = new BaseShape();
        letterN.add(new Ellipse(maxWidth, maxHeight));
        letterN.remove(new Ellipse(maxWidth - stripeThickness - 3.0, maxHeight - stripeThickness));
        letterN.remove(new Rectangle(maxWidth, halfMaxHeight).translate(new Point2d(-40.0, -100.0 + halfMaxHeight)));
        letterN.add(new Rectangle(halfStripeThickness, halfMaxHeight).translate(new Point2d(-54.0 + maxWidth, 0.0)));
        letterN.add(new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(-40.0, -100.0)));
        return letterN;
    }

    public static BaseShape create_r() {
        BaseShape letterR = create_n();
        letterR.remove(new Rectangle(halfStripeThickness, halfMaxHeight + 24.0).translate(new Point2d(-54.0 + maxWidth, -24.0)));
        return letterR;
    }

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
