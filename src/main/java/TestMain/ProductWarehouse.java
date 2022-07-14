package TestMain;

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

class ProductWarehouse {

    private long id;
    private String nameProduct;
    private String brandProduct;

}
