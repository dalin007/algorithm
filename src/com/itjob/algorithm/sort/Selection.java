package com.itjob.algorithm.sort;


/*
 * 选择排序：相邻元素两两比较，将大的元素与其相邻的后一个元素相交换
 * 比较运算：（N-1）+(N-2)+……+2+1=N^2/2-N-2
 * 交换运算：N-1
 * * 时间复杂度：O(N^2)
 * */
public class Selection {
    //对数组a中的元素进行排序
    public static void sort(Comparable[] a) {

        for (int i = 0; i <= a.length - 2; i++) {
            //定义一个变量，记录最小元素所在的索引，默认为参与选择排序的第一个元素所在的位置
            int minIndex = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                //比较最小索引minIndex处的值和j索引处的值
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }
            //交换最小元素所在索引minIndex处的值和最小索引处的值
            exch(a, i, minIndex);
        }
    }

    //比较元素v是否大于元素w
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    //数组元素i和j交换位置
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
