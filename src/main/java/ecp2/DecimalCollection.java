package ecp2;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }

    public double multiplicar() {
        double respuesta = 1;
        for (double item : this.collection) {
            respuesta = respuesta * item;
        }
        return respuesta;
    }

    public double menor() {
        double menor = Double.POSITIVE_INFINITY;
        for (double item : this.collection) {
            if (item < menor) {
                menor = item;
            }
        }
        return menor;

    }

}
