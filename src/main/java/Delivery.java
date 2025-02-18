import models.Cargo;

public class Delivery {

    private static final int DISTANCE_30 = 300;
    private static final int DISTANCE_10 = 200;
    private static final int DISTANCE_2 = 100;
    private static final int DISTANCE_0 = 50;

    private static final int BIG_DIMENSION = 200;
    private static final int SMALl_DIMENSION = 100;
    private static final int FRAGILE_COST = 300;

    public static double calculateDelivery(Cargo cargo) {
        if (cargo.isFragile() && cargo.getDistance() > 30) {
            throw new IllegalArgumentException("Невозможно доставить хрупкий груз на дистанцию более 30 км.");
        }
        double result = getDistanceCost(cargo.getDistance());

        result += getDimensionCost(cargo.getDimension());

        if (cargo.isFragile()) {
            result += FRAGILE_COST;

        }

        result = result * getLoadCoefficient(cargo.getCargo_load());

        if (result <400){
            return 400;
        }
        return result;
    }

    private static double getLoadCoefficient(String loadType) {
        return switch (loadType) {
            case "VERY_HIGH" -> 1.6;
            case "HIGH" -> 1.4;
            case "INCREASED" -> 1.2;
            default -> 1.0;
        };
    }

    private static int getDistanceCost(int distance) {
        if (distance >= 30) {
            return DISTANCE_30;
        } else if (distance >= 10) {
            return DISTANCE_10;
        } else if (distance >= 2) {
            return DISTANCE_2;
        } else {
            return DISTANCE_0;
        }
    }

    private static int getDimensionCost(String dimension) {
        return switch (dimension) {
            case "BIG" -> BIG_DIMENSION;
            case "SMALL" -> SMALl_DIMENSION;
            default -> 0;
        };
    }
}
