import java.util.ArrayList;

public abstract class User {

    // Error message to use in OperationDeniedException
    protected static final String JOIN_ROOM_FAILED =
            "Failed to join the chat room.";
    protected static final String INVALID_MSG_TYPE =
            "Cannot send this type of message to the specified room.";

    // instance variables
    protected String username;
    protected String bio;
    protected ArrayList<MessageExchange> rooms;

    public User(String username, String bio) {
        /* TODO */
    }

    public void setBio(String newBio) {
        /* TODO */
    }

    public String displayBio() {
        /* TODO */
        return null;
    }

    public void joinRoom(MessageExchange me) throws OperationDeniedException {
        /* TODO */
    }

    public void quitRoom(MessageExchange me) {
        /* TODO */
    }

    public void sendMessage(MessageExchange me, String contents, int lines) {
        /* TODO */
    }

    public abstract String fetchMessage(MessageExchange me);

    public abstract String displayName();
}
