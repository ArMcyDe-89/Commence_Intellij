//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        int total=0;
         for(int i = 0; i<arena.length;i++){
            for(int j =0; j<arena[i].length;j++){
                if(arena[i][j]%50 == 0 && (arena [i][j]>=50)){
                    if((j-1>=0) && (arena[i][j-1]!=1) && (arena[i][j-1]!=0)){total+=arena[i][j-1];}
                    if((j+1<arena[i].length) && (arena[i][j+1]!=1) && (arena[i][j+1]!=0)){total+=arena[i][j+1];}
                    if((i-1>=0) && (arena[i-1][j]!=1) && (arena[i-1][j]!=0)){total+=arena[i-1][j];}
                    if((i+1<arena.length) && (arena[i+1][j]!=1) && (arena[i+1][j]!=0)){total+=arena[i+1][j];}
                }
            }
         }

        if(total<10){
            System.out.printf("Points Gained: %d. Your team is out.\n",total);return;
        }
        System.out.println("Points Gained: "+total+". Your team has survived the game.");

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
