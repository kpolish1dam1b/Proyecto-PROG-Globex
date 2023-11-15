public class Productos {
    public enum Type {RAM, Graficas, Placas, Fuentes, SSD;}

    private Type type;
    private float price;
    private long id;
    private String modelo;

    public Productos(Type type, float price, long id, String modelo) {
        this.type = type;
        this.price = price;
        this.id = id;
        this.modelo = modelo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    //método para cambiar precio
    public void setPrice(float price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}