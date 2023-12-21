package project;

public class Validation {
    public static Boolean isValidName(String name) {
        if (name == null || name.isEmpty() || name.length() >= 20) {
            return false;
        }

        // Check if each character is a letter
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
public static Boolean isEmailValid(String email){
    return email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");

}
    public static Boolean isPhoneNumberValid(String phoneNumber ) {
        return phoneNumber.length() == 11 &&
                (phoneNumber.startsWith("012")
                        || phoneNumber.startsWith("011")
                        || phoneNumber.startsWith("010") || phoneNumber.startsWith("015"));
    }

    public static Boolean isZipValid(String Zip){
        return Zip.length() == 5;

    }}
