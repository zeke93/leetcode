package cn.hackcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 341. Flatten Nested List Iterator
 */
public class FlattenNestedListIterator implements Iterator<Integer> {

    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    private List<Integer> results = new ArrayList<>();
    private Iterator<Integer> iterator = null;

    public void traverse(List<NestedInteger> nestedList) {
        if (nestedList != null) {
            Iterator<NestedInteger> iterator = nestedList.iterator();
            while (iterator.hasNext()) {
                NestedInteger nestedInteger = iterator.next();
                if (nestedInteger.isInteger()) {
                    results.add(nestedInteger.getInteger());
                } else {
                    traverse(nestedInteger.getList());
                }
            }
        }
    }

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        traverse(nestedList);
        iterator = results.iterator();
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}