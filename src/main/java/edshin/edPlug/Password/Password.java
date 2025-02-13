package edshin.edPlug.Password;

public class Password {
    public int[] getPasswords(String[] info) {
        int[] pw = new int[4];
        pw[0] = Integer.parseInt(info[0]);
        pw[1] = Integer.parseInt(info[1]);
        pw[2] = Integer.parseInt(info[2]);
        pw[3] = Integer.parseInt(info[3]);
        return pw;
    }
}