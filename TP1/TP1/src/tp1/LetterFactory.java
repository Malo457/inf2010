package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    // TODO
    public static BaseShape create_e() {
        return new Rectangle(stripeThickness, maxHeight);
    }

    // TODO
    public static BaseShape create_a() {
        return new Ellipse(maxHeight, maxWidth);
    }

    // TODO
    public static BaseShape create_C() {
        return new Rectangle(stripeThickness, maxHeight);
    }

    // TODO
    public static BaseShape create_l() { return new Rectangle(stripeThickness, maxHeight); }

    // TODO
    public static BaseShape create_i() {
        return new Rectangle(stripeThickness, maxHeight);
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
        return new Rectangle(stripeThickness, maxHeight);
    }
}
