package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Product;

public interface IProductDAO {
    Product getProductById(int id);

}
