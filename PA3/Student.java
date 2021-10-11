import java.util.ArrayList;

public class Student extends User {

    // Message to append when fetching non-text message
    private static final String FETCH_DENIED_MSG =
            "This message cannot be fetched because you are not a premium user.";

    // max number of messages to fetch
    private static final int MAX_MSG_SIZE = 100;

    public Student(String username, String bio) {
        /* TODO */
    }

    public String fetchMessage(MessageExchange me) {
        /* TODO */
        return null;
    }

    public String displayName() {
        /* TODO */
        return null;
    }
}
