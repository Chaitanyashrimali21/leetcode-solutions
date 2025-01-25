class Solution {
    public int[] rowAndMaximumOnes(int[][] m) {
     int x=0;int p=0;
        for(int i=0;i<m.length;i++)
        {
            int c=m[i][0];
            for(int j=1;j<m[0].length;j++)
            {
                m[i][j]+=c;
                c=m[i][j];
            }
            if(c>x)
            {
                x=c;
                p=i;
            }
        }
        return new int[]{p,x};

    
    }
}