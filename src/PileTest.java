import org.junit.Test;

import static org.junit.Assert.*;

public class PileTest {

    @Test
    public void pop() {
        Pile<Integer> myPile = new Pile<>();
        myPile.push(10);
        assertSame(myPile.pop(),10);
    }

    @Test
    public void peek() {
        Pile<Integer> myPile = new Pile<>();
        myPile.push(10);
        myPile.push(9);
        assertSame(myPile.pop(),9);
    }

    @Test
    public void empty() {
        Pile<Integer> myPile = new Pile<>();
        assertTrue( myPile.empty()==true);
    }


    @Test
    public void size() {
        Pile<Integer> myPile = new Pile<>();
        assertSame("Failes",myPile.size(),0);
    }
}