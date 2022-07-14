package TestMain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andhika
 */
public class NewClass {

    public static void main(String[] args) {
        List<ProductWarehouse> data = new ArrayList<>();
        data.add(ProductWarehouse.builder().id(1).nameProduct("Indomie").brandProduct("Indofood").build());
        Product product;
        product = (Product.builder().datas(data).build());

        data.add(ProductWarehouse.builder().id(2).nameProduct("Sedaap").brandProduct("Indofood").build());
        product = (Product.builder().datas(data).build());

        data.add(ProductWarehouse.builder().id(3).nameProduct("Burjo").brandProduct("Indofood").build());
        product = (Product.builder().datas(data).build());

        for (ProductWarehouse data1 : product.getDatas()) {
            System.out.println(data1.getId());
            System.out.println(data1.getNameProduct());
            System.out.println(data1.getBrandProduct());
        }
//        data.add(ProductWarehouse.builder().id(2).nameProduct("Mie Sedap").brandProduct("Indofood").build());
//        data.add(ProductWarehouse.builder().id(3).nameProduct("Indomie").brandProduct("Indofood").build());
//
//        for (ProductWarehouse productWarehouse : product.getData()) {
//            System.out.println(productWarehouse.getId());
//            System.out.println(productWarehouse.getNameProduct());
//            System.out.println(productWarehouse.getBrandProduct());
        System.out.println("");
        System.out.println("");
    }
}
