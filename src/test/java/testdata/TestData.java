package testdata;

import models.Cargo;
import models.TestDataModel;

public class TestData {
    static Cargo cargo1 = new Cargo(60, false, "SMALL", "");
    static Cargo cargo2 = new Cargo(30, false, "BIG", "VERY_HIGH");
    static Cargo cargo3 = new Cargo(60, false, "SMALL", "HIGH");
    static Cargo cargo4 = new Cargo(60, false, "SMALL", "INCREASED");
    static Cargo cargo5 = new Cargo(25, true, "BIG", "VERY_HIGH");
    static Cargo cargo6 = new Cargo(1, true, "BIG", "VERY_HIGH");
    static Cargo cargo7 = new Cargo(31, true, "BIG", "VERY_HIGH");


    public static final TestDataModel testData1 = new TestDataModel(cargo1, 400.0);
    public static final TestDataModel testData2 = new TestDataModel(cargo2, 800.0);
    public static final TestDataModel testData3 = new TestDataModel(cargo3, 560.0);
    public static final TestDataModel testData4 = new TestDataModel(cargo4, 480.0);
    public static final TestDataModel testData5 = new TestDataModel(cargo5, 1120.0);
    public static final TestDataModel testData6 = new TestDataModel(cargo6, 880.0);
    public static final TestDataModel testData7 = new TestDataModel(cargo7, 0);


}
