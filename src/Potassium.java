public abstract class Potassium {

    private String totalPotassium, potassiumPerServing;

    public Potassium(String totalPotassium, String potassiumPerServing) {
        this.totalPotassium = totalPotassium;
        this.potassiumPerServing = potassiumPerServing;
    }

    public String getTotalPotassium() {
        return totalPotassium;
    }

    public void setTotalPotassium(String totalPotassium) {
        this.totalPotassium = totalPotassium;
    }

    public String getPotassiumPerServing() {
        return potassiumPerServing;
    }

    public void setPotassiumPerServing(String potassiumPerServing) {
        this.potassiumPerServing = potassiumPerServing;
    }

    @Override
    public String toString() {

        return "totalPotassium: " + getTotalPotassium()
                + "potassiumPerServing: " + getPotassiumPerServing();

    }

    public abstract void goodSourceOfPotassium();
}
