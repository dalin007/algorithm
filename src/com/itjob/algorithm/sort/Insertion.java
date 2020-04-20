package com.itjob.algorithm.sort;


/*
 * 插入排序：相邻元素两两比较，将大的元素与其相邻的后一个元素相交换
 * 比较运算：（N-1）+(N-2)+……+2+1=N^2/2-N-2
 * 交换运算：（N-1）+(N-2)+……+2+1=N^2/2-N-2
 * * 时间复杂度：O(N^2)
 * */
public class Insertion {
    //对数组a中的元素进行排序
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                //比较索引处的值和索引j-1处的值，如果索引j-1处的值比索引j处的值大，则交换数据，如果不大，那么就找到合适的位置了，退出循环即可。
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
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
