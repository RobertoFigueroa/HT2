import java.util.Vector;

public class Pile<T> implements Stack<T> {

    private Vector<T> Data = new Vector<T>(2,0);

    @Override
    public void push(T item) {
        Data.add(item);
    }

    @Override
    public T pop() {  //saca el útlimo elemento
        T item = Data.lastElement();
        Data.remove(-1);
        return item;
    }

    @Override
    public T peek() {
        return Data.lastElement();
    }

    @Override
    public boolean empty() {
        return Data.isEmpty();
    }

    @Override
    public int size() {
        return Data.size();
    }
}
