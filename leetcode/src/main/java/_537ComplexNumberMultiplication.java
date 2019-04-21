public class _537ComplexNumberMultiplication {

    public String complexNumberMultiply(String a, String b) {
        int ai = a.indexOf('+');
        int bi = b.indexOf('+');
        short ra = Short.parseShort(a.substring(0, ai));
        short ca = Short.parseShort(a.substring(ai + 1, a.length() - 1));
        short rb = Short.parseShort(b.substring(0, bi));
        short cb = Short.parseShort(b.substring(bi + 1, b.length() - 1));
        return (ra * rb - ca * cb) + "+" + (ra * cb + ca * rb) + "i";
    }

}
