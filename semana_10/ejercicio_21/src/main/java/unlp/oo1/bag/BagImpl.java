package unlp.oo1.bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<>();
    }

    @Override
    public boolean add(T element) {
        // Obtengo las ocurrencias actuales o 0 si no existe.
        int ocurrencias = this.elements.getOrDefault(element, 0);
        this.elements.put(element, ocurrencias+1);
        // Esta bien siempre devolver true ??
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        return this.elements.getOrDefault(element,0);
    }

    @Override
    public void removeOccurrence(T element) {
        int ocurrencias = this.elements.getOrDefault(element, 0);

        if(ocurrencias > 0){
            if (ocurrencias == 1){
                this.elements.remove(element);
            }else{
                this.elements.replace(element, ocurrencias-1);
            }
        }
    }

    @Override
    public void removeAll(T element) {
        this.elements.remove(element);
    }

    @Override
    public int size() {
        return this.elements.values().stream().mapToInt(v -> v).sum();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
