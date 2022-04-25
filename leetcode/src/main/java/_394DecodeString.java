public class _394DecodeString {

    public String decodeString(String s) {
        return "";
    }

    public String decodeString(String start, String end) {
        String decoded = "";
        for (int i = 0; i < end.length(); i++) {
            if (Character.isLetter(end.charAt(i))) {
                decoded += end.charAt(i);
            }
        }
        return "";
    }

}
