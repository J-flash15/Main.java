import java.util.Scanner;

public abstract class Protein {
    private String totalProtein, proteinPerServings;

      //Constructor to initialize new instances
    public Protein(String totalProtein, String proteinPerServings) {
        this.totalProtein = totalProtein;
        this.proteinPerServings = proteinPerServings;
    }
      //default Constructor that initialize the TestHarness and access to the private
    public Protein(){
        totalProtein = "totalProtein";
        proteinPerServings = "proteinPerServings";
    }


         //Getter method to access private fields
    public String getTotalProtein() {

        return totalProtein;
    }
         //Setter method
    public void setTotalProtein(String totalProtein) {

        this.totalProtein = totalProtein;
    }

    public void proteinInput() {
        Scanner p1 = new Scanner(System.in);

        System.out.println("Enter total Protein: ");
        this.totalProtein = p1.nextLine();

        System.out.println("Enter Protein Per Servings: ");
        this.proteinPerServings = p1.nextLine();
    }


    public abstract void putOnGrilled();

         //Getter method
    public String getProteinPerServings() {

        return proteinPerServings;
    }
        //Setter method
    public void setProteinPerServings(String proteinPerServings) {

        this.proteinPerServings = proteinPerServings;
    }

    public int getProteinPerServingsAsInt() {

        return Integer.parseInt(proteinPerServings);
    }


    public int  calculateTotalProtein(int amountOfServings) {

        return  getProteinPerServingsAsInt() * amountOfServings;
    }


    // Using getters to access the private Fields
    @Override
    public String toString(){

        return "totalProtein: " + getTotalProtein()
                + " proteinPerServings: " + getProteinPerServings();
    }



}
