
public class IsSubSequence {
	
	public boolean isSubsequence(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();
        int sPtr = 0;
        int tPtr = 0;

        if(sLen<0) {
            return true;
        }

        if(sLen > tLen) {
            return false;
        }

        while(sPtr < sLen && tPtr < tLen) {
            if(s.charAt(sPtr) == t.charAt(tPtr)) {
                sPtr++;
            }
            tPtr++;
        }

        if(sPtr == sLen) {
            return true;
        }

        return false;
        
    }

}
