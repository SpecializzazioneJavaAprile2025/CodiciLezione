public class GenericClass <T,B,O,D> {
    private T data;
    private B data2;
    private O data3;
    private D data4;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}
