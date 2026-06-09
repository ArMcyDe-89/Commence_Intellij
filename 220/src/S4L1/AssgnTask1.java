//Assignment Task 01: Row Rotation Policy
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        int row=0;
        for(int k =1; k<examWeek; k++){
            for(int i =0; i<matrix[0].length;i++){
            String save = matrix[matrix.length-1][i];
            for(int j = matrix.length-1; j>0;j--){
                matrix[j][i] = matrix[j-1][i]; if(matrix[j][i].equalsIgnoreCase("AA")){row = j+1;}
            }
            matrix[0][i] = save;     
        }
        }
        
        Arr.print2D(matrix);
        return row;

        // int row=0;
        // for(int j =1; j<examWeek;j++){
        // String [] temp = matrix[matrix.length-1];
        // for(int i =matrix.length-1; i>0;i--){
        //     matrix[i] = matrix[i-1];
        // } matrix[0] = temp;
        // }
        // for(int k=0;k<matrix[0].length;k++){
        //     for(int l=0; l<matrix.length;l++){
        //         if(matrix[l][k].equalsIgnoreCase("AA")){row=k+1;}
        //     }
        // }
        // Arr.print2D(matrix);
        // return row;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}
