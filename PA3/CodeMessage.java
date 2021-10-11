
public class CodeMessage extends Message {

    // Error message to use in OperationDeniedException
    private static final String INVALID_INPUT =
            "The source path is not valid.";

    // Error message to use in OperationDeniedException for the invalid line number
    private static final String INVALID_CODE =
            "The files are not long enough.";

    // input validation criteria
    private static final String[] ACCEPTABLE_EXTENSIONS =
            new String[] {"html", "java", "py", "mjs", "ipynb", "md", "yml"};

    // instance variable
    private String extension;
    private int lines;

    public CodeMessage(User sender, String codeSource, int lines)
                        throws OperationDeniedException {
        /* TODO */
    }

    public String getContents() {
        /* TODO */
        return null;
    }

    public String getExtension() {
        /* TODO */
        return null;
    }

    public int getLines() {
        /* TODO */
        return 0;
    }

}
