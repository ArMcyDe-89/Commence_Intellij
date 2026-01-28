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

    public Integer task_2b_LIST(Node [] arr) { 
        int Max = 0, vertex = 0; Node MV = null;
        for(int i =0; i<arr.length; i++){
            Node N = arr[i]; int sum =0;
            while(N!=null){sum+=N.weight;N=N.next;}
            if(sum>Max){Max =sum; vertex=i; MV = arr[i];}
        }
        return Max;        
    }
        public Integer task_3a_MAT(Integer [][] arr) { 
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

    public Integer task_3b_LIST(Node [] arr) { 
        int Max = 0, vertex = 0; Node MV = null;
        for(int i =0; i<arr.length; i++){
            Node N = arr[i]; int sum =0;
            while(N!=null){sum+=N.weight;N=N.next;}
            if(sum>Max){Max =sum; vertex=i; MV = arr[i];}
        }
        return Max;        
    }
    public void GraphConvert_arr(Integer [][] arr) {
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; i<arr[i].length;j++){
                int sum = arr[i][j]+arr[j][i];
                arr[i][j] = sum; arr[j][i] =sum;
            }
        }
    }
    public void GraphConvert_list(EdgeNode [] list){
        EdgeNode [] copy = new EdgeNode[list.length];
        for(int i =0; i<list.length;i++){
            EdgeNode N = list[i];
            while(N!=null){
                EdgeNode M = list[N.toV];
                while (M.next!=null) {
                    if (M.toV == i) {
                        M.weight+=N.weight; N.weight = M.weight;
                    }M=M.next;
                }
                M.next = new EdgeNode(i, N.weight);
                N=N.next;
            }copy[]
        }
    }

}
