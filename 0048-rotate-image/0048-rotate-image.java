class Solution {
    public void rotate(int[][] matrix)
    {
        int [][] mat=new int [matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                mat[j][i]=matrix[i][j];
            }
        }
         for(int i=0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[0].length/2;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][matrix[0].length-1-j];
                mat[i][matrix[0].length-1-j]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=mat[i][j];
            }
        }

    }
}