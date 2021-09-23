package tp1;

public final class PointOperator {

    public static void translate(Double[] vector, Double[] translateVector) {
        for(int dimension = 0; dimension < vector.length; dimension++) {
            vector[dimension] += translateVector[dimension];
        }
    }

    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        if (vector.length != rotationMatrix[1].length) return; //exit function if multiplication is not valid

        Double[] newVector = new Double[vector.length];
        for(int firstDimension = 0; firstDimension < vector.length; firstDimension++) {
            double result = 0;
            for(int secondDimension = 0; secondDimension < rotationMatrix[firstDimension].length; secondDimension++) {
                result += vector[secondDimension] * rotationMatrix[firstDimension][secondDimension];
            }
            newVector[firstDimension] = result;
        }

        System.arraycopy(newVector, 0, vector, 0, vector.length);
    }

    public static void divide(Double[] vector, Double divider) {
        for(int dimension = 0; dimension < vector.length; dimension++) {
            vector[dimension] /= divider;
        }
    }

    public static void multiply(Double[] vector, Double multiplier) {
        for(int dimension = 0; dimension < vector.length; dimension++) {
            vector[dimension] *= multiplier;
        }
    }

    public static void add(Double[] vector, Double adder) {
        for(int dimension = 0; dimension < vector.length; dimension++) {
            vector[dimension] += adder;
        }
    }
}
