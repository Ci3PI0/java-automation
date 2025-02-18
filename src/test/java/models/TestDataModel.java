package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TestDataModel {
    private Cargo cargo;
    private double expectedResult;

    @Override
    public String toString() {
        return "Test for " + cargo.getDimension() + " cargo, distance: " + cargo.getDistance();
    }
}
