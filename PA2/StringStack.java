/*
    Name: TODO
    PID:  TODO
 */

import java.util.EmptyStackException;

/**
 * TODO
 * @author TODO
 * @since  TODO
 */
public class StringStack {

    /* instance variables, feel free to add more if you need */
    private String[] data;
    private int nElems;
    private double loadFactor;
    private double shrinkFactor;

    public StringStack(int capacity, double loadF, double shrinkF) {
        /* TODO */
    }

    public StringStack(int capacity, double loadF) {
        /* TODO */
    }

    public StringStack(int capacity) {
        /* TODO */
    }

    public boolean isEmpty() {
        /* TODO */
        return false;
    }

    public void clear() {
        /* TODO */
    }

    public int size() {
        /* TODO */
        return 0;
    }

    public int capacity() {
        /* TODO */
        return 0;
    }

    public String peek() {
        /* TODO */
        return null;
    }

    public void push(String element) {
        /* TODO */
    }

    public String pop() {
        /* TODO */
        return null;
    }

    public void multiPush(String[] elements) {
        /* TODO */
    }

    public String[] multiPop(int amount) {
        /* TODO */
        return null;
    }
}