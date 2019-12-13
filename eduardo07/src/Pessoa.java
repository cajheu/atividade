public class Pessoa {
   
        private String nome;
        private String identidade;
        private String nascimento;

    public String getIdentidade() {return identidade;}

    public String getNascimento() {return nascimento;}

    public String getNome() {return nome;}

    public void setIdentidade(String identidade) {this.identidade = identidade;}

    public void setNascimento(String nascimento) {this.nascimento = nascimento;}

    public void setNome(String nome) {this.nome = nome;}
   
    public Pessoa(){ }
   
    public Pessoa (String nome, String identidade, String nascimento){
        this.nome = nome;
        this.identidade = identidade;
        this.nascimento = nascimento;
       
     }
   }