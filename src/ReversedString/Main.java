package ReversedString;

public class Main {
    public static void main(String[] args) {

        CharSequence rs = new ReversedString("Éj mélyből fölzengő");
        char ch = rs.charAt(0);
        System.out.println(ch);     //should print 'ő'
        CharSequence beg = rs.subSequence(0, 3);
        System.out.println(beg);        //should print "őgn"
        System.out.println(rs.toString()); // should print "őgnezlöf lőbylém jÉ"
    }
}
