package Arithmetic;

/**
 * Created by w on 2018/8/17
 */
public class Arithmetic {
    public static void main(String[] args) {
            int[] a = {1,2,3,4,-5,5,6,-5};
            maxSubArry(a);
        //System.out.println(new StringBuffer("abc").equals(new StringBuffer("abc")));
    }


    public static void maxSubArry(int[] a){
        //1.求一个数组中和最大的子数组 并且输出子数组中的元素
        //思路：
        //使用穷举的方法进行数组的遍历，按照子数组的长度进行循环计算求和
        int start = 0;//子数组的起始下标
        int end = 0;//子数组的结束下标
        int len = 0;//子数组的长度，作为循环遍历的重要指标
        //注意点：子数组的最大值不一定是正数，所以不能定义sum的初始值为0
        Integer sum = null;
        while(len <= a.length){//当子数组长度等于原数组长度说明所有子数组已经遍历完
            for(int i = 0;i <= a.length-len;i++){//遍历长度等于len的子数组
                int subSum = 0;//记录当前数组和

                for(int j = i;j <= i + len -1;j++ ){//计算子数组的和
                    subSum += a[j];
                }

                if(sum == null || sum < subSum){//重新对sum赋值
                    sum = subSum;
                    start = i;
                    end = i + len - 1;
                }
            }
            len++;
        }

        System.out.println("和为最大值的子数组:");
        for(int k = start; k <= end ; k++){//输出子数组
            System.out.print(a[k]+"  ");
        }
        System.out.println();
        System.out.println("和为:"+sum);

    }
}
