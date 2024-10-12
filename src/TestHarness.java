public class TestHarness {
    public TestHarness(){
        testProteinClass();
        testCaloriesClass();

    }


    public void testProteinClass(){

        System.out.println("Testing the Protein class ");
        Protein p1 = new Protein() {
            @Override
            public void putOnGrilled() {

            }
        };


        if (p1 != null){
            System.out.println(p1.getTotalProtein());
            System.out.println(p1.getProteinPerServings());


        }

        else
            System.out.println("There was a error creating the Protein class");
        p1.setTotalProtein("ChickenBreast\n");
        p1.setProteinPerServings("31 Grams of protein");

        System.out.println(p1.toString());


    }


    public void testCaloriesClass() {

        System.out.println("Testing the  Calories class ");
        Calories c1 = new Calories() {
            @Override
            public void toastedBread() {

            }
        };

        if (c1 != null){
            System.out.println(c1.getTotalCalories());
            System.out.println(c1.getCaloriesPerServings());
        }

        else
            System.out.println("There was a error creating the protein class ");

        c1.setTotalCalories("Mixed Of different food\n ");
        c1.setCaloriesPerServings("Depend on the gender amd the amount and how active you are ");

        System.out.println(c1.toString());


    }




}
