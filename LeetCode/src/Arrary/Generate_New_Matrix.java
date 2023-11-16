package Arrary;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Generate_New_Matrix {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    @Test
    public void Test(){
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
//[1,2,3],[8,9,4],[7,6,5]
    public static int[][] generateMatrix(int n) {
        int Start = 0;
        int count = 1;
        int [][] num = new int[n][n];

        for (int k =0; k<n/2; k++){
            for(int j=Start ; j <n-1 -Start ; j++ ){
                num[Start][j] = count ++;
            }
            for (int i = Start; i < n- 1 - Start; i++){
                num[i][n-Start-1] = count++;
            }
            for (int j = n - Start - 1 ; j > Start ; j --){
                num [n-Start-1][j] = count++;
            }
            for (int i = n - Start -1; i >Start ; i--){
                num [i][Start] = count ++;
            }
            Start ++;
        }

        if ( n%2 != 0){
            num[Start][Start] = count;
        }
        return num;
    }
}
