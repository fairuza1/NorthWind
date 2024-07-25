package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository <Product,Integer>{

//JpaReppositıry implement ettiğimiz için findall gibi tüm verileri yada tek veriyi getirecek.
    //ekleme içinde  hızlı bir ortam veiryor

}
