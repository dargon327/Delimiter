
import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token) {


        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < token.length; i++) {
            if (token[i].equals(openDel) || token[i].equals(closeDel)) {
                str.add(token[i]);
            }
        }
        return str;
        // To be implemented.

    }

    public boolean isBalanced(ArrayList delimiters) {
        int opend = 0;
        for (int i = 0; i < delimiters.size();i++) {
            if (delimiters.get(i).equals(openDel)) {
                opend++;
            }
            if (delimiters.get(i).equals(closeDel)) {
                opend--;
            }
            if (opend < 0) {
                return false;
            }
        }
        if (opend == 0) {
            return true;
        }
        return false;
    }

    public String getCloseDel() {
        return closeDel;
    }

    public String getOpenDel() {
        return openDel;
    }

    public void setCloseDel(String closeDel) {
        this.closeDel = closeDel;
    }

    public void setOpenDel(String openDel) {
        this.openDel = openDel;
    }
}