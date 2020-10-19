import Week10_Workshop.Screen;
/*
public class Phone {

    //Q1
    private String modelName;
    private int RAM;
    private int storage;
    private Screen screen;

    //Q2
    public Phone(String modelName, int RAM, int storage, String screenType, double size, int ppi) {
    setModelName(modelName);
    setRam(RAM);
    setStorage(storage);
    screen = new Screen(screenType, size, ppi);
    }

    //Q3
    @Override
    public String toString() {
        return "Phone{" +
                "modelName='" + getModelName() + '\'' +
                ", RAM=" + getRAM() +
                ", storage=" + getStorage() +
                ", screen=" + screen +
                '}';
    }

    //Q4
    public double[] normalize(int[] intAr) {
        double[] doubleAr = new double [intAr.length];
        int max = intAr[0];
        int min = intAr[0];

        for (int i = 0; i < intAr.length; i++) {
            if (max < intAr[i]){
                max = intAr[i];
            }
        }

        for (int i =0; i < intAr.length; i++) {
            if (min > intAr[i]) {
                min = intAr[i];
            }
        }

        for (int i = 0; i < doubleAr.length; i++) {
            doubleAr[i] = (intAr[i] - min) / (max - min);
        }

        return doubleAr;
    }

    private void setStorage(int storage) {
    }

    private void setRam(int ram) {
    }

    private void setModelName(String modelName) {
    }

    private String getStorage() {
    }

    private String getRAM() {
    }

    //accessors
    //mutators
    public String getModelName() {
        return modelName;
    }
}

 */