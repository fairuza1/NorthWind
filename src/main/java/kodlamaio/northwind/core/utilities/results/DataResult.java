package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

    private T data;

    public DataResult(T data, boolean success, String message) {
        super(success, message);//base sınıfın constructeer çalıştırmaya yarar
        //boolen ve string olanı result yapacak diğerini ise t yapacak
        this.data = data;
    }
    public DataResult(T data, boolean success) {
        super(success);//base sınıfın constructeer çalıştırmaya yarar
        //boolen ve string olanı result yapacak diğerini ise t yapacak
        this.data = data;
    }

    public T getData(){
        return this.data;

    }
}
