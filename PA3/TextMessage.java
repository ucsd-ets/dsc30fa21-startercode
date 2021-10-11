public class TextMessage extends Message {

    // Error message to use in OperationDeniedException
    private static final String EXCEED_MAX_LENGTH =
            "Your input exceeded the maximum length limit.";

    // input validation criteria
    private static final int MAX_TEXT_LENGTH = 500;

    public TextMessage(User sender, String text)
            throws OperationDeniedException {
        /* TODO */
    }

    // Yuxuan [16:38:36.868882500]: A sample text message.
    public String getContents() {
        /* TODO */
        return null;
    }

}
