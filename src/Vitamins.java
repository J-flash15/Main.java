public abstract class Vitamins {

    private String vitaminsA, vitaminsC,  vitaminsD,
            vitaminsE,  vitaminsK,  vitaminsB9;

    public Vitamins(String vitaminsA, String vitaminsB9,
                    String vitaminsC, String vitaminsK, String vitaminsE,
                    String vitaminsD) {

        this.vitaminsA = vitaminsA;
        this.vitaminsB9 = vitaminsB9;
        this.vitaminsC = vitaminsC;
        this.vitaminsD = vitaminsD;
        this.vitaminsE = vitaminsE;
        this.vitaminsK = vitaminsK;
    }

    // Default constructor
    public Vitamins () {
        vitaminsA = "vitaminsA";
        vitaminsB9 = "vitaminsB9";
        vitaminsC = "vitaminsC";
        vitaminsD = "vitaminsD";
        vitaminsE = "vitaminsE";
        vitaminsK = "vitaminsK";
    }

    public String getVitaminsA() {
        return vitaminsA;
    }

    public void setVitaminsA(String vitaminsA) {
        this.vitaminsA = vitaminsA;
    }

    public String getVitaminsC() {
        return vitaminsC;
    }

    public void setVitaminsC(String vitaminsC) {
        this.vitaminsC = vitaminsC;
    }

    public String getVitaminsD() {
        return vitaminsD;
    }

    public void setVitaminsD(String vitaminsD) {
        this.vitaminsD = vitaminsD;
    }

    public String getVitaminsE() {
        return vitaminsE;
    }

    public void setVitaminsE(String vitaminsE) {
        this.vitaminsE = vitaminsE;
    }

    public String getVitaminsK() {
        return vitaminsK;
    }

    public void setVitaminsK(String vitaminsK) {
        this.vitaminsK = vitaminsK;
    }

    public String getVitaminsB9() {
        return vitaminsB9;
    }

    public void setVitaminsB9(String vitaminsB9) {
        this.vitaminsB9 = vitaminsB9;
    }


    @Override
    public  String toString() {

        return  "vitaminsA: " + getVitaminsA() + "vitamins: " + getVitaminsC()
                + "vitaminsD: " + getVitaminsD() + "vitaminsE: " + getVitaminsE() +
                "vitaminsK: " + getVitaminsK() + "vitaminsB9: " + getVitaminsB9();
    }

    public abstract void importantVitamins();
}
