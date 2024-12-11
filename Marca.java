public class Marca {
    // Atributos da classe
    private int id;
    private String marca;

    // Construtor vazio
    public Marca() {
        // Não faz nada, apenas cria o objeto vazio
    }

    // Construtor completo
    public Marca(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método toString
    @Override
    public String toString() {
        return "Marca{" +
               "id=" + id +
               ", marca='" + marca + '\'' +
               '}';
    }
}
