public class BmiService {
    public double calculate(int weight, int height) {
        double heightInMeters = (double) height / 100;
        double bmi = weight / Math.pow(heightInMeters, 2);
        return bmi;
    }
}
