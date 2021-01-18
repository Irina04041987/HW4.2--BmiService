public class BmiService {
    float calculate(int weightKG, float heightM) {
        float bmi = weightKG / (heightM * heightM);
        return bmi;
    }
}
