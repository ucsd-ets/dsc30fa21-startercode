/*
 * Name: TODO
 * PID: TODO
 */

import java.util.Arrays;

/**
 * TODO
 * 
 * @author TODO
 * @since TODO
 */
public class HashTable implements IHashTable {

    /* the bridge for lazy deletion */
    private static final String BRIDGE = new String("[BRIDGE]".toCharArray());

    /* instance variables */
    private int size; // number of elements stored
    private String[] table; // data table

    public HashTable() {
        /* TODO */
    }

    public HashTable(int capacity) {
        /* TODO */
    }

    @Override
    public boolean insert(String value) {
        /* TODO */
        return false;
    }

    @Override
    public boolean delete(String value) {
        /* TODO */
        return false;
    }

    @Override
    public boolean lookup(String value) {
        /* TODO */
        return false;
    }

    @Override
    public int size() {
        /* TODO */
        return -1;
    }

    @Override
    public int capacity() {
        /* TODO */
        return -1;
    }

    public String getStatsLog() {
        /* TODO */
        return null;
    }

    private void rehash() {
        /* TODO */
    }

    private int hashString(String value) {
        /* TODO */
        return -1;
    }

    /**
     * Returns the string representation of the hash table.
     * This method internally uses the string representation of the table array.
     * DO NOT MODIFY. You can use it to test your code.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return Arrays.toString(table);
    }
}
