package functional;

import java.util.HashSet;
import java.util.Set;

public class ClassifierImperative {
    private Set<Integer> factors;
    private int number;

    public ClassifierImperative(int number) {
        this.number = number;
        this.factors = new HashSet<>();
        this.factors.add(1);
        this.factors.add(number);
    }

    private boolean isFactor(int factor) {
        return this.number % factor == 0;
    }

    public Set<Integer> getFactors() {
        return factors;
    }

    private void calculateFactors() {
        for(int i = 1; i <= Math.sqrt(this.number) + 1; i++) {
            if(isFactor(i)) {
                addFactor(i);
            }
        }
    }

    private void addFactor(int factor) {
        this.factors.add(factor);
        this.factors.add(number / factor);
    }

    private int sumOfFactors() {
        calculateFactors();
        int sum = 0;
        for(int f : factors) {
            sum += f;
        }
        return sum;
    }

    public boolean isPerfect() {
        return sumOfFactors() - number == number;
    }

    public boolean isAbundant() {
        return sumOfFactors() - number > number;
    }

    public boolean isDeficient() {
        return sumOfFactors() - number < number;
    }

    public static boolean isPerfect(int number) {
        return new ClassifierImperative(number).isPerfect();
    }
}
