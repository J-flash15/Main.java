public class Chicken extends Protein {

    private String grilledChicken;
    private String chickenLeg;
    private String chickenBreast;


    //Constructor
    public Chicken(String totalProtein,
                   String proteinPerServings,
                   String grilledChicken,
                   String chickenLeg, String chickenBreast) {
        super(totalProtein, proteinPerServings);
        this.grilledChicken = grilledChicken;
        this.chickenLeg = chickenLeg;
        this.chickenBreast = chickenBreast;

        }

     // Getter and Setter methods
    public String getGrilledChicken() {
        return grilledChicken;
    }

    public void setGrilledChicken(String grilledChicken) {
        this.grilledChicken = grilledChicken;
    }

    public String getChickenLeg() {
        return chickenLeg;
    }

    public void setChickenLeg(String chickenLeg) {
        this.chickenLeg = chickenLeg;
    }

    public String getChickenBreast() {
        return chickenBreast;
    }

    public void setChickenBreast(String chickenBreast) {
        this.chickenBreast = chickenBreast;
    }



    @Override
    public void putOnGrilled(){

        System.out.println("sizzling sound");

    }

    @Override
    public String toString() {
        return "Chicken{" +
                "grilledChicken='" + super.toString()+ " " + grilledChicken + '\'' +
                ", chickenLeg='" + chickenLeg + '\'' +
                ", chickenBreast='" + chickenBreast + '\'' +
                '}';
    }
}



