//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if ((cigars >= 40) && (cigars <= 60)) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}