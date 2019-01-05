public class _478GenerateRandomPointinaCircle {

    private final double radius;
    private final double x_center;
    private final double y_center;

    public _478GenerateRandomPointinaCircle(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double r = radius * Math.sqrt(Math.random());
        double angle = 2 * Math.PI * Math.random();
        double x = x_center + r * Math.cos(angle);
        double y = y_center + r * Math.sin(angle);
        return new double[] {x, y};
    }

}
