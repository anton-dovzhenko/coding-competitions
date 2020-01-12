public class _223RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long s1 = (C - A) * (D - B);
        long s2 = (G - E) * (H - F);
        // Intersection rectangle
        long s3 = 0;
        long width = Math.min((long) C, (long) G) - Math.max((long) A, (long) E);
        long height = Math.min((long) D, (long) H) - Math.max((long) B, (long) F);
        if (width > 0 && height > 0) {
            s3 = -width * height;
        }
        return (int) (s3 + s1 + s2);
    }

}
