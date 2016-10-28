package org.fundacionjala.quizfinal;

final class Evaporator {
    private Evaporator() {
    }
    static int evaporator(double content, double evapPerDay, double threshold) {
        int days = 0;
        double contentPercentage = 100;
        while (contentPercentage > threshold) {
            contentPercentage *= 1 - evapPerDay / 100;
            days++;
        }
        return days;
    }
}
