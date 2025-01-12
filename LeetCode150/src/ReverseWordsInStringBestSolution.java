
public class ReverseWordsInStringBestSolution {
	
	//Why it is best because it is not using any trim, split or any Stringbuilder or String buffer
	
	public String reverseWords(String s) {
        if (s == null)
            return null;
        char[] a = s.toCharArray();
        int n = s.length();
        reverse(a, 0, n - 1);
        reverseWords(a, n);
        return cleanSpaces(a,n);
    }

    private void reverse(char[] arr, int strIdx, int endIdx) {
        int i = strIdx;
        int j = endIdx;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private void reverseWords(char[] a, int n) {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && a[i] == ' ')
                i++; // skip spaces
            while (j < i || j < n && a[j] != ' ')
                j++; // skip non spaces
            reverse(a, i, j - 1); // reverse the word
        }
    }

    private String cleanSpaces(char[] arr, int n) {
        int i=0, j =0;

        while(j<n) {
            while(j<n && arr[j] == ' ') {
                j++;
            }
            while(j<n && arr[j] != ' ') {
                arr[i++] = arr[j++];
            }
            while(j<n && arr[j] == ' ') {
                j++;
            }

            if(j<n) {
                arr[i++] = ' ';
            }
        }

        return new String(arr).substring(0,i);
    }

}
