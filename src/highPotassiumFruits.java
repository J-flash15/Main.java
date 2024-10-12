public class highPotassiumFruits  extends  Potassium{

   private String Avocados;
   private  String Bananas;
   private String Cantaloupes;

   public  highPotassiumFruits (String totalPotassium, String potassiumPerServings,
                                String Avocados, String Bananas, String Cantaloupes) {

       super (totalPotassium, potassiumPerServings);

       this.Avocados = Avocados;
       this.Bananas = Bananas;
       this.Cantaloupes = Cantaloupes;

   }

    public String getAvocados() {
        return Avocados;
    }

    public void setAvocados(String avocados) {
        Avocados = avocados;
    }

    public String getBananas() {
        return Bananas;
    }

    public void setBananas(String bananas) {
        Bananas = bananas;
    }

    public String getCantaloupes() {
        return Cantaloupes;
    }

    public void setCantaloupes(String cantaloupes) {
        Cantaloupes = cantaloupes;
    }

    @Override
    public void goodSourceOfPotassium () {
        System.out.println("Lower blood pressure ");
    }

    @Override
    public String toString() {
        return "highPotassiumFruits{" + super.toString() + " " +
                "Avocados='" + Avocados + '\'' +
                ", Bananas='" + Bananas + '\'' +
                ", Cantaloupes='" + Cantaloupes + '\'' +
                '}';
    }
}
