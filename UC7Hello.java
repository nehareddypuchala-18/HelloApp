public class UC7Hello {
    public static void main(String[] args) {

        if (args.length > 0) {
            // Join all arguments with space
            String message = String.join(" ", args);
            System.out.println("Hello " + message);
        } else {
            // Default message
            System.out.println("Hello User");
        }
    }
}