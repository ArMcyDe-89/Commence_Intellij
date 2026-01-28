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

    public Integer task_2a_MAT(Integer [][] arr) { //same in task 3a
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

    public Integer task_2a_LIST(Node [] arr) { //same in task 3b
        int Max = 0, vertex = 0; Node MV = null;
        for(int i =0; i<arr.length; i++){
            Node N = arr[i]; int sum =0;
            while(N!=null){sum+=N.weight;N=N.next;}
            if(sum>Max){Max =sum; vertex=i; MV = arr[i];}
        }
        return Max;        
    }
    public void GraphConvert(Integer [][] arr) {
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; i<arr[i].length;j++){
                int sum = arr[i][j]+arr[j][i];
                arr[i][j] = sum; arr[j][i] =sum;
            }
        }
    }

}
