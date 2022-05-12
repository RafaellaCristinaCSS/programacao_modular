package trabalho;

 class Livro {
    private String codigo;
    private  String titulo;
    
    public Livro(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
