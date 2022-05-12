package trabalho;

class Cliente {
    private String matricula;    
    private String nome;
    public Cliente(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
}
