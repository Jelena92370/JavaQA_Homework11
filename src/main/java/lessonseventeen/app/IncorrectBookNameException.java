package lessonseventeen.app;

public class IncorrectBookNameException extends RuntimeException{
    public IncorrectBookNameException(String message) {
        super(message);
    }
}
