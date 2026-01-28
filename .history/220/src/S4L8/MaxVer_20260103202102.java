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
    public Integer MaxDeg(Node [] arr) {
        int Max = 0, vertex = 0;
        for(int i =0; i< arr.length; i++){
            Node N = arr[i]; int count = 0;
            while (N!=null) {
                count++; N= N.next;
            }if(count>Max){Max=count; vertex=i;}
        }
        return Max;        
    }

    public Integer task_2a_MAT(Integer [][] arr) {
        int vertex = 0, Max = 0;
        for(int i =0; i< arr.length; i++){ int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] != 0){sum+=arr[i][j];}
            }
            if (sum>Max) {
                Max = sum; vertex = i;
            }
        }
        return Max;        
    }

    public Integer task_2a_LIST(Node [] arr) {
        int Max = 0, vertex = 0;
        for(int i =0; i<arr.length; i++){
            Node N = arr[i]; int sum =0;
        }
        return Max;        
    }

}
