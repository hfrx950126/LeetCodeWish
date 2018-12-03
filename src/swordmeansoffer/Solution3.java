package swordmeansoffer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，没一列都按照从上到下递增的顺序排序。请完成一个函数
 * 输入这样的一个二维数组和一个整数，判断数组中是都含有该整数。
 */
public class Solution3 {
    private boolean find(int matrix[][],int rows,int columns,int number){
        boolean found = false;
        if(matrix!=null && rows>0&&columns>0){
            int row = 0;
            int column = columns - 1;
            while(row<rows && column>0){
                if(matrix[row][column] == number){
                    found = true;
                    break;
                }
                else if(matrix[row][column] > number){
                    --column;
                }else{
                    ++row;
                }
            }

        }
        return found;
    }

    public static void main(String args[]){
        Solution3 solution3 = new Solution3();
        int array[][] = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(solution3.find(array,4,4,5)+"-----------");
    }
}
