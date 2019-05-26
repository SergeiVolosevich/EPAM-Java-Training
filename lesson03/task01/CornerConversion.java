class CornerConversion {
    public static double toRadians(int degrees) {
        return degrees * (3.141592/180);
    }

    public static double toDegrees(double radians) {
        return (radians * 180) / 3.141592;
    }
}