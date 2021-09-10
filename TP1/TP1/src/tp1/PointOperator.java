package tp1;

import java.util.*;

public final class PointOperator {

    public static void translate(Double[] vector, Double[] translateVector) {

        for(int dimension = 0; dimension < vector.length; dimension++) {
            vector[dimension] += translateVector[dimension];
        }

    }

    public static void rotate(Double[] vector, Double[][] rotationMatrix) {

        if (vector.length != rotationMatrix[1].length) return; //exit function if multiplication is not valid

        for(int firstDimension = 0; firstDimension < vector.length; firstDimension++) {
            double result = 0;
            for(int secondDimension = 0; secondDimension < rotationMatrix[1].length; secondDimension++) {
                result += vector[secondDimension] * rotationMatrix[firstDimension][secondDimension];
            }
            vector[firstDimension] = result;

        }

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
