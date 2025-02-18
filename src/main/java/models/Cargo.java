package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Cargo {
    private  int distance;
    private boolean fragile;
    private String dimension;
    private String cargo_load;

}
