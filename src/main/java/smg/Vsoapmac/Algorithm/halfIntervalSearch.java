package smg.Vsoapmac.Algorithm;

/**
 * 折半搜索（英语：half-interval search），
 * 也称二分搜索（英语：binary search）、对数搜索（英语：logarithmic search），是一种在有序数组中查找某一特定元素的搜索算法。
 * <p>
 * 搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；
 * 如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。
 * 如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半
 * <p>
 * 折半查找法的优点是比较次数少，查找速度快，平均性能好；
 * 其缺点是要求待查表为有序表，且插入删除困难。
 * 因此，折半查找方法适用于不经常变动而查找频繁的有序列表。
 */
public class halfIntervalSearch {
    public static int Search(int array[], int target){
        //把左右下标独立出来
        int mid, left, right;
        left = 0;
        right = array.length - 1;
        mid = (left + right) / 2;
        while (array[mid] != target) {
            //查询断口
            if(right - left < 4){
                int length = right - left;//返回查询数据量的长度
                for (int i = 0; i < length; i++) {
                    if(array[left] == target){
                        return left;
                    }
                    left++;
                }
                return -1;//查询失败返回-1
            }else if (target > array[mid]) {
                //如果目标搜索的数字大于中间的数字，左下标转移到中间下标的下一位
                left = mid + 1;
            } else if (target < array[mid]) {
                //如果目标搜索的数字小于中间的数字，右下标转移到中间下标的前一位
                right = mid - 1;
            }
            mid = (left + right) / 2;//左右下标运算得到新的中间下标
        }
        return mid;
    }

}
