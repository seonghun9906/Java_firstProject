package DTO;

public class NationalAt {
    public String RepublicKorea;
    public String USA;
    public String Japan;

    public NationalAt(){

    }

    @Override
    public String toString() {
        return "NationalAt{" +
                "RepublicKorea='" + RepublicKorea + '\'' +
                ", USA='" + USA + '\'' +
                ", Japan='" + Japan + '\'' +
                '}';
    }

    public NationalAt(String republicKorea, String USA, String japan) {
        RepublicKorea = republicKorea;
        this.USA = USA;
        Japan = japan;
    }

    public String getRepublicKorea() {
        return RepublicKorea;
    }

    public void setRepublicKorea(String republicKorea) {
        RepublicKorea = republicKorea;
    }

    public String getUSA() {
        return USA;
    }

    public void setUSA(String USA) {
        this.USA = USA;
    }

    public String getJapan() {
        return Japan;
    }

    public void setJapan(String japan) {
        Japan = japan;
    }
}
