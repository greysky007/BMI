public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50;
        double height = 2;
        double imt = service.calculate(weight, height);
        System.out.println(imt);
    }
}