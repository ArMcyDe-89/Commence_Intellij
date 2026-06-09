//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        Integer [][] compressedMatrix = new Integer[matrix.length/2][matrix[0].length/2];


        // for(int i=0; i<matrix.length/2;i++){
        //     for(int j=0;j<matrix[i].length/2;j++){
        //         compressedMatrix[0][0]+=matrix[i][j];
        //     }
        // }
        // for(int i=0; i<matrix.length/2;i++){
        //     for(int j=matrix[0].length/2;j<matrix[0].length;j++){
        //         compressedMatrix[0][1]+=matrix[i][j];
        //     }
        // }
        // for(int i = matrix.length/2;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length/2;j++){
        //         compressedMatrix[1][0]+=matrix[i][j];
        //     }
        // }
        // for(int i =matrix.length/2; i<matrix.length;i++){
        //     for(int j = matrix[0].length/2;j<matrix[0].length;j++){
        //         compressedMatrix[1][1]+=matrix[i][j];
        //     }
        // }


        for(int i=0; i<matrix.length;i+=2){
            for(int j=0; j<matrix[0].length;j+=2){
                compressedMatrix[i/2][j/2]=matrix[i][j]+matrix[i+1][j]+matrix[i][j+1]+matrix[i+1][j+1];
            }
        }

        return compressedMatrix;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
