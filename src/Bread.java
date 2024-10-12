public class Bread extends Carbohydrates {

    private String whiteBread;
    private  String ryeBread;
    private String kales;

       //Constructor
    public Bread (String totalCarbs, String netCarbs,
                  String complexCarbs,
                  String whiteBread, String ryeBread, String kales ){
        super(totalCarbs, netCarbs, complexCarbs);

        this.whiteBread = whiteBread;
        this.ryeBread = ryeBread;
        this.kales = kales;

    }

    public String getWhiteBread() {
        return whiteBread;
    }

    public void setWhiteBread(String whiteBread) {
        this.whiteBread = whiteBread;
    }

    public String getRyeBread() {
        return ryeBread;
    }

    public void setRyeBread(String ryeBread) {
        this.ryeBread = ryeBread;
    }

    public String getKales() {
        return kales;
    }

    public void setKales(String kales) {
        this.kales = kales;
    }

    @Override
    public void stirFry() {
        System.out.println("Crackling sound of the kales");
    }

    @Override
    public String toString() {
        return "Bread{" +
                "whiteBread='" + super.toString()+" "+ whiteBread + '\'' +
                ", ryeBread='" + ryeBread + '\'' +
                ", kales='" + kales + '\'' +
                '}';
    }


}
