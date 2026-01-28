public class MaxVer {
    public Integer MaxDeg(Integer [][] arr) {
        int vertex = 0, Max = 0;
        for(int i =0; i< arr.length; i++){ int count = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == 1){count++;}
                if (count>Max) {
                    Max = count; vertex = arr[i][0];
                }
            }
        }
        return Max;
        
    }
    public Integer MaxDeg(Integer [] arr) {
        return Max;
        
    }
}
