public class essentialVitamins extends Vitamins{

    private String pineapples;
    private  String papayas;
    private String mangoes;


    public essentialVitamins ( String vitaminsA, String vitaminsC,  String vitaminsD,
                              String  vitaminsE,  String vitaminsK,  String vitaminsB9,
                               String pineapples, String papayas, String mangoes) {

        super (vitaminsA, vitaminsB9, vitaminsC, vitaminsK, vitaminsE, vitaminsD);

        this.mangoes = mangoes;
        this.papayas = papayas;
        this.pineapples = pineapples;

    }


    public String getPineapples() {
        return pineapples;
    }

    public void setPineapples(String pineapples) {
        this.pineapples = pineapples;
    }

    public String getPapayas() {
        return papayas;
    }

    public void setPapayas(String papayas) {
        this.papayas = papayas;
    }

    public String getMangoes() {
        return mangoes;
    }

    public void setMangoes(String mangoes) {
        this.mangoes = mangoes;
    }


    @Override
    public void importantVitamins(){

        System.out.println("eat yout vitamins reduce vitamins deficiency ");

    }

    @Override
    public String toString() {
        return "essentialVitamins{" + super.toString() + " " +
                "pineapples='" + pineapples + '\'' +
                ", papayas='" + papayas + '\'' +
                ", mangoes='" + mangoes + '\'' +
                '}';
    }
}
