package HO.sort;

import java.util.List;

import HO.list.Comparator;

public class SelectionSort<T> extends Swapper<T> implements Sortable<T> {

    @Override
    public void sort(List<T> list, Comparator<T> comparator) {
        //  selection sort!!! dari kiri cari paling minimum => taro paling kiri..
        int minimum = 0;
        for (int i = 0; i < list.size(); i++) {

            minimum = i;
            //jalan ke kanan!
            for (int e = i + 1; e < list.size(); e++) {
                if (comparator.compare(list.get(e), list.get(minimum)) < 0) {

                    minimum = e;
                }
            }
            swap(list, i, minimum);
        }
    }

}