public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;



    public void setNome(String no) {
    this.nome = no;
    }

    public String getNome() {
    return this.nome;
    }

    public void setNacionalidade(String na) {
    this.nacionalidade = na;
    }

    public String getNacionalidade() {
    return this.nacionalidade;
    }

    public void setIdade(int id) {
    this.idade = id;
    }

    public int getIdade() {
    return this.idade;
    }

    public void setAltura(float al) {
    this.altura = al;
    }

    public float getAltura() {
    return this.altura;
    }

    public void setPeso(float pe) {
    this.peso = pe;
    this.setCategoria();
    }

    public float getPeso() {
    return this.peso;
    }

    public void setCategoria() {
   if( this.peso < 52.2 ){
        this.categoria = "invalido";
   } else if (peso <= 78.3) {
       this.categoria = "leve";
   }else if (peso <= 83.9) {
       this.categoria = "medio";
   }else if (peso <= 120.2) {
       this.categoria = "pesado";
   }else{
       this.categoria = "invalido";
   }
   
    }

    public String getCategoria() {
    return this.categoria;
    }

public void setVitoria(int vi) {
    this.vitoria = vi;
}

public int getVitoria() {
    return this.vitoria;
}

public void setDerrota(int de) {
    this.derrota = de;
}

public int getDerrota() {
    return this.derrota;
}

public void setEmpate(int em) {
    this.empate = em;
}

public int getEmpate() {
    return this.empate;
}


//metdos
public void apresentar(){
    System.out.println("--------------------------------------------------");
System.out.println("Chegou a hora do: " + this.getNome());
System.out.println("Diretamente de " + this.getNacionalidade());
System.out.println("com " + getIdade() + "anos e " + getAltura() + "metros");
System.out.println("pesando " + this.getPeso() + "kg");
System.out.println(this.getVitoria() + " vitorias");
System.out.println(this.getEmpate() + " Empates");
System.out.println(this.getDerrota() + " Derrotas");
System.out.println("--------------------------------------------------");

}
public void status(){
    System.out.println(this.getNome() + " é um peso " + this.getCategoria());
}
public void ganharLuta(){
    this.setVitoria(this.getVitoria() + 1);
}
public void perderLuta(){
    this.setDerrota(this.getDerrota() + 1);
}
public void empatarLuta(){
    this.setEmpate(this.getEmpate() + 1);
}

//metodos especiais
public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe); 
    this.vitoria = vi;
    this.derrota = de;
    this.empate = em;
}

}
