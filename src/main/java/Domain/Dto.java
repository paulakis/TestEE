package Domain;

public class Dto {

    public String kati;
    public String katiAllo;

    public String getKati() {
        return kati;
    }

    public void setKati(String kati) {
        this.kati = kati;
    }

    public String getKatiAllo() {
        return katiAllo;
    }

    public void setKatiAllo(String katiAllo) {
        this.katiAllo = katiAllo;
    }


    @Override
    public String toString() {
        return "Dto{" +
                "kati='" + kati + '\'' +
                ", katiAllo='" + katiAllo + '\'' +
                '}';
    }
}
