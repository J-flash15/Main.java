import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarbohydratesTest {

    private final Carbohydrates carbs = new Carbohydrates() {
        @Override
        public void stirFry() {

        }
    };


    @Test
    void getTotalCarbs() {
        carbs.setNetCarbs("Fiber and Sugar alcohols");
        assertEquals("Fiber and Sugar alcohols",carbs.getNetCarbs());

    }


    @Test
    void setTotalCarbs() {
        carbs.setTotalCarbs("Vegetable");
        assertEquals("Vegetable", carbs.getTotalCarbs());
    }

    @Test
    void getNetCarbs() {
        carbs.setNetCarbs(null);
        assertNull(carbs.getNetCarbs());



    }

   @Test
    void setNetCarbs() {
        carbs.setTotalCarbs("450gPasta");
        assertEquals("450gPasta", carbs.getTotalCarbs());


    }

    @Test
    void getComplexCarbs() {
        carbs.setComplexCarbs(null);
        assertNull(carbs.getComplexCarbs());
    }

    @Test
    void setComplexCarbs() {
        carbs.setComplexCarbs("Broccoli");
        assertEquals("Broccoli", carbs.getComplexCarbs());
    }

    @Test
    void testToString() {
        Carbohydrates carbs = new Carbohydrates(" 300g ",
                " 45g ",
                " 65g") {
            @Override
            public void stirFry() {

            }
        };
        String expected = "totalCarbs:  300g netCarbs:  45g complexCarbs:  65g";
        assertEquals(expected, carbs.toString());

    }


}