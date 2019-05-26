class WeightConversion {
    public static int toGrams(int weight) {
        return weight * 1000;
    }

    public static long toMilligrams(int weight) {
        return weight * 1000_000L;
    }

    public static double toTons(int weight) {
        return weight / 1000.0;
    }
}