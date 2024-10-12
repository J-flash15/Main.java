public abstract class Carbohydrates {

    private String totalCarbs, netCarbs, complexCarbs;

    public Carbohydrates(String totalCarbs, String netCarbs, String complexCarbs) {
        this.totalCarbs = totalCarbs;
        this.netCarbs = netCarbs;
        this.complexCarbs = complexCarbs;
    }

    public Carbohydrates() {
        totalCarbs = "totalCarbs";
        complexCarbs = "complexCarbs";

    }

    public abstract void stirFry();

    public String getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(String totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public String getNetCarbs() {
        return netCarbs;
    }

    public void setNetCarbs(String netCarbs) {
        this.netCarbs = netCarbs;
    }

    public String getComplexCarbs() {
        return complexCarbs;
    }

    public void setComplexCarbs(String complexCarbs) {
        this.complexCarbs = complexCarbs;
    }

    @Override
    public String toString() {

        return  "totalCarbs: " + getTotalCarbs()
                + "netCarbs: " + getNetCarbs() + "complexCarbs: " + getComplexCarbs();
    }



}
