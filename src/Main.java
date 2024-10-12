//Name: Shamar J Gordon
//course: IST 261, Section 001: App Dev Studio I, FA24
//Due Date: October 6, 2024

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Chicken c1 = new Chicken("g ", "4g ", "45g", "5g", "10g ");
        Bread b1 = new Bread("g", "25g", "5g", "25g", "21g", "5g");
        reducedCaloriesBread r1 = new reducedCaloriesBread("g", "1", "38g", "26g");
        highPotassiumFruits h1 = new highPotassiumFruits("mg", "1 medium",
                "708mg", "451g", "473mg");
        essentialVitamins e1 = new essentialVitamins("healthy skin,", "  immune system", "phosphorus", "molecules ",
                "blood coagulate normally ", "red blood cells ", "C, B9", "A,C and B9 ", "A, C, E and K");


        ArrayList<Protein> proteinsList =  new ArrayList<>();
        proteinsList.add(c1);

        for (Protein protein : proteinsList) {

            System.out.println(protein);
        }


        ArrayList<Vitamins> vitaminsList = new ArrayList<>();
        vitaminsList.add(e1);


        for (Vitamins vitamins : vitaminsList) {

            System.out.println(vitamins);
        }



        ArrayList<Potassium> potassiumArrayList = new ArrayList<>();
        potassiumArrayList.add(h1);



        for (Potassium potassium : potassiumArrayList){

            System.out.println(potassium);
        }



        ArrayList<Bread> breadArrayList  = new ArrayList<>();
        breadArrayList.add(b1);


        for (Bread bread  :  breadArrayList) {

            System.out.println(bread);
        }

        ArrayList<Calories> caloriesArrayList = new ArrayList<>();
        caloriesArrayList.add(r1);



        for (Calories calories :  caloriesArrayList ){

            System.out.println(calories);
        }


        TestHarness m1 = new TestHarness();

        Protein protein = new Protein(" ", " ") {
            @Override
            public void putOnGrilled() {

            }
        };
        protein.proteinInput();
        System.out.println(protein);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of servings: ");
        int amountOfServings = scanner.nextInt();


        int totalProtein = protein.calculateTotalProtein(amountOfServings);

        System.out.println("Total protein: " + amountOfServings + " Serving: " + totalProtein );









    }
}