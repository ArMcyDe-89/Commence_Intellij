public class Vaccine {
    private String name, country;
    private int comeback;

    public Vaccine(String n, String c, int b){
        this.name = n; this.country = c; this.comeback = b;
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public int getBack(){
        return this.comeback;
    }
}
