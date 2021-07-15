public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientsTemperatures = new float[patientsCount];
        int minTemperature = 32;
        int maxTemperature = 40;
        for (int i = 0; i < patientsTemperatures.length; i++) {
            patientsTemperatures[i] = (float) (Math.random() * (maxTemperature - minTemperature) + minTemperature);
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {

        String allTemperature = "";
        int healthyPatients = 0;
        for (float v : temperatureData) {
            double scale = Math.pow(10, 1);
            float result = (float) (Math.round(v * scale) / scale);
            if (result > 36.1 && result < 37) {
                healthyPatients++;
            }
            allTemperature = allTemperature.concat(String.valueOf(result)).concat(" ");
        }

        float averageTemperature = 0;
        for (float v : temperatureData) {
            averageTemperature = averageTemperature + v;
        }
        averageTemperature = (float) ((Math.round((averageTemperature / temperatureData.length) * (Math.pow(10, 2)))) / (Math.pow(10, 2)));

        return "Температуры пациентов: " + allTemperature.trim() +
                "\nСредняя температура: " + averageTemperature +
                "\nКоличество здоровых: " + healthyPatients;
    }
}
