public class reducedCaloriesBread extends Calories{

     private String wheatBread;
     private String multigrainBread;

    public reducedCaloriesBread(String totalCalories, String caloriesPerServings,
                                String wheatBread, String multigrainBread ) {

          super(totalCalories, caloriesPerServings);
          this.wheatBread = wheatBread;
          this.multigrainBread = multigrainBread;

    }

    public String getWheatBread() {
        return wheatBread;
    }

    public void setWheatBread(String wheatBread) {
        this.wheatBread = wheatBread;
    }

    public String getMultigrainBread() {
        return multigrainBread;
    }

    public void setMultigrainBread(String multigrainBread) {
        this.multigrainBread = multigrainBread;
    }

    @Override
    public void toastedBread() {

        System.out.println("charringBreads surface in toaster oven ");

    }

    @Override
    public String toString() {
        return "reducedCaloriesBread{" +super.toString()+ " " +
                "wheatBread='" + wheatBread + '\'' +
                ", multigrainBread='" + multigrainBread + '\'' +
                '}';
    }
}
