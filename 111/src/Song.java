public class Song {
    public String title, artist;
    public int length;
    public Song next;
    public Song(){
    }
    public Song(String t, String a, int l){
        this.title = t; this.artist = a; this.length = l;
    }
    public void songInfo(){
        System.out.printf("Title: %s, Artist: %s \nLength: %d minutes\n",this.title,this.artist,this.length);
    }
}
