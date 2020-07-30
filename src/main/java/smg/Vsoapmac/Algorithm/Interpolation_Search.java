package smg.Vsoapmac.Algorithm;

/**
 * 插值查找，有序表的一种查找方式。
 * 插值查找是根据查找关键字与查找表中最大最小记录关键字比较后的查找方法。
 * 插值查找基于二分查找，将查找点的选择改进为自适应选择，提高查找效率。
 * <p>
 * 对于数据量较大，关键字分布比较均匀的查找表来说，采用插值查找, 速度较快.
 * 关键字分布不均匀的情况下，该方法不一定比折半查找要好
 */
public class Interpolation_Search {

    public static int insertSeatch(int array[], int target) {
        if (array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = left + (target - array[left]) / (array[right] - array[left]) * (right - left);
            if (target > array[mid])
                left = mid + 1;
            else if (target < array[mid])
                right = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 6, 9, 11};
        int index = Interpolation_Search.insertSeatch(a, 7);
        System.out.println(index);
    }
}
