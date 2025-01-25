class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
     int maxCount = 0;
     int index = 0;
     int m = mat.length;
     int n = mat[0].length;

     for(int i =0;i<m;i++){
        int count = 0;
        for(int j =0;j<n;j++){
            count += mat[i][j];
        }
          if(count > maxCount){
            maxCount = count;
            index = i;
          }
     }

     return new int [] {index,maxCount};
    }
}