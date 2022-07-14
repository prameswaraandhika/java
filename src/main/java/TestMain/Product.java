package TestMain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Andhika
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product {

    private List<ProductWarehouse> datas;
}
