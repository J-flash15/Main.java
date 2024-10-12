public abstract class Calories {
    private String totalCalories, caloriesPerServings;

    public Calories(String totalCalories, String caloriesPerServings) {
        this.totalCalories = totalCalories;
        this.caloriesPerServings = caloriesPerServings;
    }

    public Calories() {

        totalCalories = "totalCalories ";
        caloriesPerServings = "caloriesPerServings";

    }

    public abstract void toastedBread();


    public String getTotalCalories() {

        return totalCalories;
    }

    public void setTotalCalories(String totalCalories) {

        this.totalCalories = totalCalories;
    }

    public String getCaloriesPerServings() {

        return caloriesPerServings;
    }

    public void setCaloriesPerServings(String caloriesPerServings) {

        this.caloriesPerServings = caloriesPerServings;
    }

    @Override
        public String toString(){

            return "totalCalories: " + getTotalCalories()
                    + "caloriesPerServings: " + getCaloriesPerServings();


    }



}
