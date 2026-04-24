public class CD extends Product{
    public String band;
    public int duration;
    public String genre;
    public CD(int id, String title, int price, String band, int duration, String genre){
        super(id,title,price);this.band = band; this.duration = duration; this.genre = genre;
    }
    public String printDetail(){
        return getIdTitlePrice()+" Band: "+ this.band + " Duration: "+this.duration+" minutes Genre: " + this.genre;
    }
}
