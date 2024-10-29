package ar.edu.info.unlp.ejercicio16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet extends HashSet<Integer> {
    private Set<Integer> setInterno;
    // Si quisiera mantener el orden en el que se ingresaron los numeros podria utilizar LinkedHashSet
    // Tambien puedo utilizar un TreeSet si quisiera que los elementos esten ordenados de forma ascendente o descendente.
    

    public EvenNumberSet(){
        // setInterno = new HashSet<>();
    }

    // RE-IMPLEMENTADOS
    @Override
    public boolean add(Integer numero) {
        if(numero % 2 == 0){
            return super.add(numero);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        if (c.stream().allMatch(i -> i%2 == 0)){
            return super.addAll(c);
        }
        return false;
    }

    /*
    // DELEGADOS AL setInterno
    @Override
    public int size() {
        return setInterno.size();
    }

    @Override
    public boolean isEmpty() {
        return setInterno.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return setInterno.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return setInterno.iterator();
    }

    @Override
    public Object[] toArray() {
        return setInterno.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return setInterno.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return setInterno.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return setInterno.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return setInterno.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return setInterno.removeAll(c);
    }

    @Override
    public void clear() {
        setInterno.clear();
    }
    */
}
