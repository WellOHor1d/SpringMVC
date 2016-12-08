package springmvc.service;

import springmvc.domain.Product;

/**
 * Created by XY on 2016/12/7.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
