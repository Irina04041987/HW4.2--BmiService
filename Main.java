public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKG = 56;
        float heightM = 1.6F;
        float bmi = service.calculate(weightKG, heightM);
        System.out.println(bmi);
    }
}