import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return name;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date thedate = new Date();
        return "The Day is " +thedate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return conversation;
    }
}
