package pl.waw.sgh;



public class EmailCheck {
    public static void main(String[] args) {

        final String EMAIL_OK="user@sgh.pl";
        final String EMAIL_NOT_OK1="@sgh.pl";
        final String EMAIL_NOT_OK2="user";
        final String EMAIL_NOT_OK3="user@sghpl";
        final String EMAIL_NOT_OK4="user@.pl";
        final String EMAIL_NOT_OK5="user@sgh.";
        final String EMAIL_NOT_OK6="user@@sgh.pl";

        String email=EMAIL_OK;


            if (email.startsWith("@")) {
                System.out.println("Given address doesn't contain username!");
            }

            if (!email.contains("@")) {
                System.out.println("Given address doesn't contain @!");
            }

            if ((email.lastIndexOf(".") + 1) < email.lastIndexOf("@")) {
                System.out.println("Given address doesn't contain a valid domain!");
            }
            int a = email.lastIndexOf("@");
            int b = (email.lastIndexOf("."));
            int c = b - 1;

            if (a == c) {
                System.out.println("Given address contains . directly after @!");
            }
            if ((email.length() - 1) == email.lastIndexOf(".")) {
                System.out.println("Given address contains . at the end!");
            }
            if (email.indexOf("@")!=email.lastIndexOf("@")) {
                System.out.println("Given address contains more than one @!");
        }
        if (((email.startsWith("@"))||(!email.contains("@"))||((email.lastIndexOf(".") + 1) < email.lastIndexOf("@"))||(a == c))||((email.length() - 1) == email.lastIndexOf("."))||(email.indexOf("@")!=email.lastIndexOf("@"))) {
            System.out.println("Email address not OK!");
        }
        else{
            System.out.println("Email address OK!");
        }




        }









    }

