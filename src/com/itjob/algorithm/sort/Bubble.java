package com.itjob.algorithm.sort;


/*
 * 冒泡排序：相邻元素两两比较，将大的元素与其相邻的后一个元素相交换
 * 比较运算：（N-1）+(N-2)+……+2+1=N^2/2-N-2
 * 交换运算：（N-1）+(N-2)+……+2+1=N^2/2-N-2
 * * 时间复杂度：O(N^2)
 * */
public class Bubble {
    //对数组a中的元素进行排序
    public static void sort(Comparable[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //比较索引j和索引j+1处的值
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
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
