package HO.sort;

import java.util.List;

import HO.list.Comparator;

public interface Sortable<T> {
    public void sort(List<T> list, Comparator<T> comparator);
}