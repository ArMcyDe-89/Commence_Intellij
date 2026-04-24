public class Playlist {
    public String name;
    public Song start;
    public Song first;
    //TASK_2
    public Playlist(){

    }
    public Playlist(String name){
        this.name = name; System.out.printf("%s created.\n",name);
    } //TASK_3
    public void info(){
        System.out.printf("%s has the following songs:\n",this.name);
        Song S =  this.start;
        if(S == null){
            System.out.printf("No songs in %s.\n",this.name);
        }
        else{
            int songs = 1;
            while(S != null){
                System.out.printf("Song-%d\nTitle: %s, Artist: %s \nLength: %d minutes\n",songs,S.title,S.artist,S.length);
                songs++; S = S.next;
            }
        }
    }//TASK_4
    public void addSong(Song s){
        Song S = this.start;
        if(this.start == null){
            this.start = s; System.out.printf("%s added to %s.\n", s.title,this.name);
        }
        else{
            while(S.next!=null){
                S = S.next;
            }
            S.next = s;
            System.out.printf("%s added to %s.\n", s.title,this.name);
        }
    }//TASK_5
    public void addSong(Song s, int index){
        Song S = this.start; int counter = 0;
        if(index == 0){
            s.next = S; this.start = s; System.out.printf("%s added to %s.\n",s.title,this.name);
        }
        else if (this.totalSong()+1<index) {
            System.out.printf("Cannot add song to Index %d.\n",index);
        }
        else{
            while(counter<index-1 && S != null){
                S = S.next; counter++;
            }
            if(S == null){
                System.out.printf("Cannot add song to Index %d.\n",index); return;
            }
            s.next = S.next; S.next = s; System.out.printf("%s added to %s.\n",s.title,this.name);
        }
    }//TASK_6
    public void playSong(String song){
        Song S = this.start;
        while(S != null){
            if(S.title.equalsIgnoreCase(song)){
                System.out.printf("Playing %s by %s.\n",S.title,S.artist);
                Song played = new Song(S.title,S.artist,S.length);
                if(this.first == null){
                    this.first = played;
                }
                else{
                    Song H = this.first;
                    while(H.next != null){
                        H = H.next;
                    }
                    H.next = played;
                }
                return;
            }
            else{
                S = S.next;
            }
        }
        System.out.printf("%s not found in %s.\n",song,this.name);
    }//TASK_7
    public void playSong(int index){
        int i = 0; Song S = this.start;
        while(S != null && i < index){
            S = S.next; i++;
        }
        if(index>i){
            System.out.printf("Song at Index %d not found in %s.\n",index,this.name);
        }
        else{
            System.out.printf("Playing %s by %s.\n",S.title,S.artist);
            Song played = new Song(S.title,S.artist,S.length);
            if(this.first == null){
                this.first = played;
            }
            else{
                Song H = this.first;
                while(H.next != null){
                    H = H.next;
                }
                H.next = played;
            }
        }
    }//TASK_8
    public void deleteSong(String song){
        Song S = this.start;
        if(S.title.equalsIgnoreCase(song)){
            this.start = S.next; System.out.printf("%s deleted from %s.\n",song,this.name); return;
        }
        else{
            while(S.next != null){
                if(S.next.title.equalsIgnoreCase(song)){
                    S.next = S.next.next; System.out.printf("%s deleted from %s.\n",song,this.name); return;
                }
                else{
                    S = S.next;
                }
            }
        }
        System.out.printf("%s not found in %s.\n",song,this.name);
    }//TASK_9
    public int totalSong(){
        int total = 0; Song S = this.start;
        while (S != null){
            S = S.next; total++;
        }
        return total;
    }//TASK_10
    public void merge(Playlist p){
        Song S = this.start;
        if(this.start == null){
            this.start = p.start; System.out.println("Merge Completed!");
        }
        else{
            while(S.next != null){
                S = S.next;
            }
            S.next = p.start; System.out.println("Merge Completed!");
        }
    }//TASK_11
    public void showHistory(){
        System.out.printf("History of %s:\n",this.name);
        Song H = this.first;
        if(H == null){
            System.out.printf("No songs played in %s.\n",this.name);
        }
        else{
            while(H != null){
                System.out.printf("Title: %s, Artist: %s \nLength: %d minutes\n",H.title,H.artist,H.length);
                H = H.next;
            }
        }
    }
}
