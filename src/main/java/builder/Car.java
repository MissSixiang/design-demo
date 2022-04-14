package builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String engine = "普通标准的发动机";

    private String gear = "普通标准的齿轮";

    private String door = "普通标准的车门";

    private String wheel = "普通标准的轮胎";
}
