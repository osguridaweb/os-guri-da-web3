public class Produto {
    // Atributos da classe
    private int id;
    private String nome;
    private String descricao;
    private int estoque;
    private int idFornecedor;
    private int idMarca;
    private String modelo;

    // Construtor vazio
    public Produto() {
        // Não faz nada, apenas cria o objeto vazio
    }

    // Construtor completo
    public Produto(int id, String nome, String descricao, int estoque, int idFornecedor, int idMarca, String modelo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.idFornecedor = idFornecedor;
        this.idMarca = idMarca;
        this.modelo = modelo;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para descricao
    public String getDescricao() {
        return descricao;
    }

    // Setter para descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para estoque
    public int getEstoque() {
        return estoque;
    }

    // Setter para estoque
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Getter para idFornecedor
    public int getIdFornecedor() {
        return idFornecedor;
    }

    // Setter para idFornecedor
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    // Getter para idMarca
    public int getIdMarca() {
        return idMarca;
    }

    // Setter para idMarca
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    // Getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Produto{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", descricao='" + descricao + '\'' +
               ", estoque=" + estoque +
               ", idFornecedor=" + idFornecedor +
               ", idMarca=" + idMarca +
               ", modelo='" + modelo + '\'' +
               '}';
    }
}
