/**
 * Hash table interface.
 */
public interface IHashTable {
    /**
     * Insert the string value into the hash table.
     *
     * @param value value to insert
     * @throws NullPointerException if value is null
     * @return true if the value was inserted, false if the value was already
     *         present
     */
    boolean insert(String value);

    /**
     * Delete the given value from the hash table.
     *
     * @param value value to delete
     * @throws NullPointerException if value is null
     * @return true if the value was deleted, false if the value was not found
     */
    boolean delete(String value);

    /**
     * Check if the given value is present in the hash table.
     *
     * @param value value to look up
     * @throws NullPointerException if value is null
     * @return true if the value was found, false if the value was not found
     */
    boolean lookup(String value);

    /**
     * Return the number of elements currently stored in the hashtable.
     * 
     * @return number of elements
     */
    int size();

    /**
     * Get the total capacity of the hash table.
     * 
     * @return total capacity
     */
    int capacity();
}
