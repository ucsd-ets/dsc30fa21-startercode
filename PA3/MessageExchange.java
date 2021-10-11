import java.util.ArrayList;

/**
 * MessageExchange interface declarations. DO NOT MODIFY.
 */
public interface MessageExchange {

    /**
     * Method returns the chat history log.
     * @param requester The user that requests this operation.
     * @return ArrayList<Message> Chat history log.
     */
    ArrayList<Message> getLog(User requester);

    /**
     * Method adds the given user to the room. This method
     * supports potential user validations. Return true if
     * the user meets the validation conditions and is added
     * to the chat room successfully. Otherwise, return false.
     * @param u User to add.
     * @return boolean If the user is added.
     */
    boolean addUser(User u);

    /**
     * Remove the given user from the room. No actions needed
     * if the user is not found in the room.
     * @param requester The user that requests this operation.
     * @param u User to remove.
     * @return boolean If the user is removed.
     */
    boolean removeUser(User requester, User u);

    /**
     * Get a copy of all users in this room.
     * @return ArrayList<User> all users
     */
    ArrayList<User> getUsers();

    /**
     * Record the given message to the chat log. This method
     * supports potential message validations. Return true if
     * the message meets the validation conditions and is added
     * to the chat log successfully. Otherwise, return false.
     * @param m Message to add.
     * @return boolean If the message is recorded.
     */
    boolean recordMessage(Message m);

}