import java.time.LocalDate;

public abstract class Message {

    // Error message to use in OperationDeniedException
    protected static final String DENIED_USER_GROUP =
            "This operation is disabled in your user group.";

    // instance variables
    private LocalDate date;
    private User sender;
    protected String contents;

    public Message(User sender) {
        this.date = LocalDate.now();
        /* TODO */
    }

    public LocalDate getDate() {
        return date;
    }

    public User getSender() {
        /* TODO */
        return null;
    }

    public abstract String getContents();

}