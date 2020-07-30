package smg.Vsoapmac.Algorithm;

import java.util.Arrays;

/**
 * 快速排序是C.R.A.Hoare于1962年提出的一种划分交换排序。它采用了一种分治的策略，通常称其为分治法(Divide-and-ConquerMethod)。
 * 快速排序由于排序效率在同为O(N*logN)的几种排序方法中效率较高，因此经常被采用，再加上快速排序思想----分治法也确实实用
 *
 * 分治法是一种很重要的算法，也就是“分而治之”的意思，
 * 就是把一个复杂的问题分解成两个或者多个相似的子问题，直到最后子问题可以简单的直接求解，原问题的解即子问题的解的合并。
 */
public class QuickSort {
    private static int[] finalarrays;

    public static int[] quickSort(int[] array){
        sort(array, 0, array.length-1);//记得减一否则数组下标越界
        return finalarrays;
    }

    //left和right代表下标值
    static void sort(int[] array,int left,int right){
        if(left >= right){ //递归出口，遍历的终点
            finalarrays = Arrays.copyOf(array ,array.length);//将结果拷贝在属性上，会有多次更替
            return;
        }
        int pivot = array[(left + right) / 2];//找出基准位
        int index = partition(array, left, right, pivot);//获取基准数下标的后一位，更换位置

        sort(array, left, index-1);//递归算法排序左边的数组
        sort(array, index, right);//递归算法排序右边的数组
    }

    /**
     * 核心，最能体现分治法的部分
     */
    static int partition(int[] array ,int left, int right,int pivot){
        while (left <= right){ //左右下标遍历
            while (array[left] < pivot){ //从左边遍历查找是否有大于基准位的数字
                left++;
            }
            while (array[right] > pivot){ //从右边遍历查找是否有小于基准位的数字
                right--;
            }
            /**
             * 排除以上情况后
             * 将大于基准位数字的放在右边，将小于基准位数字的放在左边
             * 也就是左右互换
             */
            if(left <= right){
                swap(array, left, right);
                //互换完成后下标继续走
                left++;
                right--;
            }
        }
        return left;//返回基准位下标的后一位
    }

    //左右数值交换
    static void swap(int[] array, int left, int right){
        int number;
        number = array[left];
        array[left] = array[right];
        array[right] = number;
    }
}
