public class BmiService {
    public int calculate(float height, float mass) {
        float bmi = mass / (height * height);
        return (int) bmi;
    }
}
