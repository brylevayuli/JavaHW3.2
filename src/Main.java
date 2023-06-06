public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.87F;
        float mass = 98F;
        float bmi = service.calculate(height, mass);
        System.out.println("Индекс BMI равен : " + bmi);

    }
}