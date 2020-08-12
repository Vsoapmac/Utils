package smg.Vsoapmac.base.invoke;

public class city {
    public int ID;
    private String name;
    private String countryCode;

    public city() {
        System.out.println("you new a city class");
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "city [ID=" + ID + ", name=" + name + ", countryCode=" + countryCode + "]";
    }
}
