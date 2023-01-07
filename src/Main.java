public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 68; //вес в килограммах
        int height = 165; //рост в сантиметрах

        double bmi = service.calculate(weight, height);
        String formattedBmi = String.format("%.2f", bmi); //форматирование индекса bmi до двух знаков после запятой
        System.out.println("Ваш индекс = " + formattedBmi);
    }
}