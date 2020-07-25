package collections;
import java.util.Arrays;

public class List<E> 
{
    private int size = 0;
    private static final int listCapacity = 10;
    private Object listElements[];
 
    public List() {
        listElements = new Object[listCapacity];
    }
 
    private void ensureCapacity() {
        int newSize = listElements.length * 2;
        listElements = Arrays.copyOf(listElements, newSize);
    }
    
    public void add(E element) {
        if (size == listElements.length) {
            ensureCapacity();
        }
        listElements[size++] = element;
    }
    
   
     
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object item = listElements[index];
        int numElts = listElements.length - ( index + 1 ) ;
        System.arraycopy( listElements, index + 1, listElements, index, numElts ) ;
        size--;
        return (E) item;
    }
     
    
    public int size() {
        return size;
    }
     
    
}