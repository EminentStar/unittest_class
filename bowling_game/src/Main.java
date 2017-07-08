public class Main {

    public enum MainCommand {
        SIGNIN(1), SIGNUP(2), EXIT(3);
        private int value;

        private MainCommand(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num = 1;
        for(MainCommand c : MainCommand.values()){
            System.out.println("Company Value: " + c.name() + " - Company Name: " + c.value);
        }

    }
}
