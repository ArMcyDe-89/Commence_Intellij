//Lab Task 03: Decryption Process

class LabTask3{

    //Complete this method so that it gives the Expected Output
       public static Integer[] decryptMatrix(Integer [][] M){
       Integer [] MAT = new Integer [M[0].length];
       Integer [] lin_arr = new Integer [MAT.length-1];
       for(int i=0; i<MAT.length;i++){MAT[i]=0;}for(int i=0; i<lin_arr.length;i++){lin_arr[i]=0;}
           for(int j = 0; j<M[0].length; j++){
               for(int k =0; k< M.length; k++){
                   MAT[j]+=M[k][j];
               }
           }
           int a =0;
           for(int b = 0; b< MAT.length-1;b++){
               lin_arr[a++] = MAT[b]-MAT[b+1];
           }
       return lin_arr;
   }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}