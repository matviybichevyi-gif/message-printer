public class MessagePrinter {
    
 feature/update-welcome
    public static String getWelcomeMessage() {
		return "Hello! Welcome to Git and GitHub Tutorial!";
main
	}
    
    public static String getDateMessage() {
        return "Today is: " + java.time.LocalDate.now();
    }
    public static String getTimeMessage() {
		return "Current time: " + java.time.LocalTime.now();
	}

    public static void main(String[] args) {
    System.out.println(getWelcomeMessage());
    System.out.println(getDateMessage());
    System.out.println(getTimeMessage());
    System.out.println("Learning remote repositories!");
    System.out.println(getGoodbyeMessage());
}

	public static String getGoodbyeMessage() {
		return "Thank you for using MessagePrinter!";
	}
	
}
