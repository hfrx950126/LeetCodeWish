package swordmeansoffer;

/**
 * 替换空格
 * 请实现一个函数，把字符串中的每个空格替换成"%20"。例如，输入"We are happy",
 * 则输出"We%20are%20happy"。
 */
public class Solution4 {
    private void ReplaceBlank(char s[]) {
        if (s == null || s.length <= 0) {
            return;
        }
        int originalLength = 0;
        int numberOfBlank = 0;
        for (int j = 0; s[j]!='\0'; j++) {
            ++originalLength;
            if (s[j] == ' ') {
                numberOfBlank++;
            }
        }

        int newLength = originalLength + numberOfBlank * 2 ;
        int indexOfOriginal = originalLength;
        int indexOfNew = newLength;
        while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
            if (s[indexOfOriginal] == ' ') {

                s[indexOfNew--] = '0';
                s[indexOfNew--] = '2';
                s[indexOfNew--] = '%';

            } else {
                s[indexOfNew--] = s[indexOfOriginal];
            }
            --indexOfOriginal;
        }


    }

    public static void main(String args[]){
        Solution4 solution4 = new Solution4();
        char s[] = new char[20];

        s[0] = 'W';
        s[1] = 'e';

        s[2] = ' ';

        s[3] = 'a';

        s[4] = 'r';

        s[5] = 'e';

        s[6] = ' ';

        s[7] = 'h';

        s[8] = 'a';

        s[9] = 'p';

        s[10] = 'p';

        s[11] = 'y';


        solution4.ReplaceBlank(s);

        for(int i=0;s[i]!='\0';i++){
            System.out.println(s[i]);
        }
    }
}
