package String_;

public class DynamicPassword {
    public String dynamicPassword(String password, int target) {
        char[] newPassword = new char[password.length()];
        for(int i = target; i < password.length(); i++){
            newPassword[i - target] = password.charAt(i);
        }
        for(int i = 0; i<target; i++){
            newPassword[password.length()-target+i] = password.charAt(i);
        }

        return new String(newPassword);
    }
}
