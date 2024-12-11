public class Fornecedor {
    // Atributos da classe
    private int id;
    private String fornecedor;
    private String telefone;
    private String email;

    // Construtor vazio
    public Fornecedor() {
        // Não faz nada, apenas cria o objeto vazio
    }

    // Construtor completo
    public Fornecedor(int id, String fornecedor, String telefone, String email) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.telefone = telefone;
        this.email = email;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para fornecedor
    public String getFornecedor() {
        return fornecedor;
    }

    // Setter para fornecedor
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    // Getter para telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter para telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString
    @Override
    public String toString() {
        return "Fornecedor{" +
               "id=" + id +
               ", fornecedor='" + fornecedor + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
