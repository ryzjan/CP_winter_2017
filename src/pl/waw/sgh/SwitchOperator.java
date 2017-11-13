package pl.waw.sgh;

public class SwitchOperator {
    public static void main(String[] args) {
        final String PL="Poland";
        final String US="United States";
        final String GB="Great Britain";

        //String country = "Great Britain";
        String country = "United States";
        //String country = "United ...";
        //String country = "Poland";

        switch (country){
            case PL:
                System.out.println("Witaj!");
                break;
            case GB:
                System.out.println("Hi!");
                break;
            case US:
                System.out.println("Hello!");
                break;
            default:
                System.out.println("I have no idea how to greet you!");


        }

    }
}
