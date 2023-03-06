package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
            if (Math.abs(c) > Math.abs(d))
                return 1;
            else if (Math.abs(c) < Math.abs(d))
                return -1;
            else if(c<d)
                return -1;
            else return 0;
        }


}
