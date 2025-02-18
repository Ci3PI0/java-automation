import models.TestDataModel;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static testdata.TestData.*;

public class DeliveryTest {

    static Stream<TestDataModel> test_models() {
        return Stream.of(testData1, testData2, testData3, testData4, testData5, testData6);
    }

    @ParameterizedTest()
    @MethodSource("test_models")
    @Tags({@Tag("API"), @Tag("Positive"), @Tag("SMOKE")})
//    @DisplayName("Some Tests")

    void DeliveryPriceTest(TestDataModel model) {
        double result = Delivery.calculateDelivery(model.getCargo());
        System.out.println("Result is : " + result);
        Assertions.assertTrue(result != 0.0);
        Assertions.assertEquals(result, model.getExpectedResult());
    }

    @Test
    @Tag("Negative")
    @Tag("API")
    @Tag("SMOKE")
    @DisplayName("Negative calculation test")
    void NegativeDeliveryPriceTest() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, ()
                -> Delivery.calculateDelivery(testData7.getCargo()));
        System.out.println(thrown.getMessage());
        Assertions.assertEquals("Невозможно доставить хрупкий груз на дистанцию более 30 км.", thrown.getMessage());
    }

}
