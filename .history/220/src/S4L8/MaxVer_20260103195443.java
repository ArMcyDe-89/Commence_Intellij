public class MaxVer {
    public Integer MaxDeg(Integer [][] arr) {
        int vertex = 0, Max = 0;
        for(int i =0; i< arr.length; i++){ int count = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == 1){count++;}
            }
            if (count>Max) {
                Max = count; vertex = i;
            }
        }
        return Max;
        
    }
    public Integer MaxDeg(Integer [] arr) {
        int Max = 0, vertex = 0;
        for(int i =0; i< arr.length; i++){
            Node N = arr[i]; int count = 0;
            while (N!=null) {
                count++; 
            }
        }
        return Max;
        
    }
}
