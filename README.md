#  Vetor de Lutadores

Projeto desenvolvido em **Java** para praticar conceitos de **Programação Orientada a Objetos (POO)**.

> **Projeto desenvolvido 100% por mim, sem uso de Inteligência Artificial.**

O sistema cria objetos da classe `Lutador`, armazena esses lutadores em um **vetor** e utiliza métodos para apresentar suas informações, mostrar suas categorias e alterar seus resultados.

##  Sobre o projeto

Neste projeto foi criada a classe `Lutador`, que possui informações como:

* Nome
* Nacionalidade
* Idade
* Altura
* Peso
* Categoria
* Vitórias
* Derrotas
* Empates

No `Main`, é criado um vetor com espaço para 6 lutadores:

```java
Lutador l[] = new Lutador[6];
```

Depois, os lutadores são criados utilizando o construtor da classe:

```java
l[0] = new Lutador("pretty boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
```

##  Conceitos de Java utilizados

###  Encapsulamento

Um dos principais conceitos utilizados é o **encapsulamento**.

Os atributos da classe `Lutador` são `private`:

```java
private String nome;
private String nacionalidade;
private int idade;
private float altura;
private float peso;
private String categoria;
private int vitoria;
private int derrota;
private int empate;
```

Isso significa que esses atributos não podem ser acessados diretamente de outras classes.

Por exemplo, não é possível fazer:

```java
l[0].nome = "Novo nome";
```

O acesso é feito através dos métodos da própria classe.

##  Getters e  Setters

Foram utilizados **getters e setters** para controlar o acesso aos atributos privados.

### Setter

O setter é utilizado para alterar o valor de um atributo:

```java
public void setNome(String no) {
    this.nome = no;
}
```

### Getter

O getter é utilizado para obter o valor de um atributo:

```java
public String getNome() {
    return this.nome;
}
```

Esse padrão foi utilizado para os principais atributos da classe.

##  Construtor

A classe possui um construtor que recebe as informações do lutador:

```java
public Lutador(String no, String na, int id, float al, float pe,
               int vi, int de, int em) {
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitoria = vi;
    this.derrota = de;
    this.empate = em;
}
```

Assim, quando um novo objeto é criado, suas informações já podem ser definidas.

Exemplo:

```java
Lutador l = new Lutador(
    "pretty boy",
    "Franca",
    31,
    1.75f,
    68.9f,
    11,
    2,
    1
);
```

##  Categoria do lutador

A categoria é definida automaticamente de acordo com o peso.

O método `setCategoria()` verifica o peso e determina a categoria:

```text
Até 52.2 kg       → inválido
Até 78.3 kg       → leve
Até 83.9 kg       → médio
Até 120.2 kg      → pesado
Acima de 120.2 kg → inválido
```

Um detalhe importante é que o método `setPeso()` chama `setCategoria()`:

```java
public void setPeso(float pe) {
    this.peso = pe;
    this.setCategoria();
}
```

Dessa forma, quando o peso é definido, a categoria também é atualizada.

##  Métodos do lutador

### `apresentar()`

Exibe as informações do lutador:

```java
l[0].apresentar();
```

Mostra nome, nacionalidade, idade, altura, peso e histórico de lutas.

### `status()`

Mostra a categoria do lutador:

```java
l[0].status();
```

Exemplo:

```text
pretty boy é um peso leve
```

### `ganharLuta()`

Adiciona uma vitória ao histórico:

```java
public void ganharLuta() {
    this.setVitoria(this.getVitoria() + 1);
}
```

### `perderLuta()`

Adiciona uma derrota:

```java
public void perderLuta() {
    this.setDerrota(this.getDerrota() + 1);
}
```

### `empatarLuta()`

Adiciona um empate:

```java
public void empatarLuta() {
    this.setEmpate(this.getEmpate() + 1);
}
```

##  Vetor de objetos

O projeto também utiliza um **vetor de objetos**:

```java
Lutador l[] = new Lutador[6];
```

Isso cria um vetor capaz de armazenar até 6 objetos da classe `Lutador`.

Cada posição pode receber um lutador:

```java
l[0] = new Lutador(...);
l[1] = new Lutador(...);
```

##  `this`

A palavra-chave `this` é utilizada para fazer referência ao próprio objeto.

Exemplo:

```java
this.nome = no;
```

Nesse caso:

* `this.nome` → atributo do objeto
* `no` → parâmetro recebido pelo método

##  Conceitos praticados

Este projeto foi desenvolvido para praticar:

* ☕ Java
* 🧱 Programação Orientada a Objetos
* 🔒 Encapsulamento
* 🔐 Atributos `private`
* 📥 Getters
* 📤 Setters
* 🏗️ Construtores
* 🧩 Palavra-chave `this`
* 📦 Classes e objetos
* 🔢 Vetor de objetos
* ⚙️ Métodos
* 🔀 Estruturas condicionais
* `float`, `int`, `String` e `boolean`

##  Objetivo

O objetivo deste projeto é colocar em prática os conceitos de **Programação Orientada a Objetos em Java**, criando uma classe completa e trabalhando com seus atributos e comportamentos.

O projeto faz parte do meu processo de aprendizado em programação e foi desenvolvido por mim para praticar e entender melhor os fundamentos de Java.

---

###  Desenvolvido por Luana Guidine

**Java • POO • Encapsulamento • Getters & Setters • Construtores • Vetores**
