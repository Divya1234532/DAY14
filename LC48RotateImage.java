class Solution {
    public void rotate(int[][] matrix) {
        /*int n=matrix[0].length;
        int[][] t=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                t[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               matrix[i][j]=t[i][j];
            }
        }BruteForce*/
        int n=matrix[0].length;//Optimal Solution
        for(int i=0;i<n;i++)//transpose matrix
        {
            for(int j=i;j<n;j++)
            {
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)//reverse rows
        {
            int left=0,right=n-1;
            while(left<right)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }

        
    } 
}
