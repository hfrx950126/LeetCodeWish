package swordmeansoffer;

/**
 * 旋转数组的最小数字
 */
public class Solution10 {
    private int Min(int number[],int length){
        if(number == null ||length<0){
            throw new RuntimeException("Invalid parameters");
        }
        int index1 = 0;
        int index2 = length -1;
        int indexMid = index1;
        while(number[index1] >=number[index2]){
           if(index2 -index1 ==1 ){
               indexMid = index2;
               break;
           }
           indexMid = (index1+index2)/2;

           if(number[index1] == number[index2]&&number[indexMid] == number[index1]){
               return MininOrder(number,index1,index2);
           }
           if(number[indexMid] >=number[index1]){
               index1 = indexMid;
           }else if(number[indexMid] <= number[index2]){
               index2 = indexMid;
           }

        }
        return  number[indexMid];
    }

    private int MininOrder(int[] number, int index1, int index2) {
        int result = number[index1];
        for(int i=index1 +1;i<=index2;++i){
            if(result>number[i]){
                result = number[i];
            }
        }
        return result;
    }
}
