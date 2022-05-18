<h1 align="center">
<br>
  <a href="https://www.mjvinnovation.com/pt-br/quem-somos/">
  <img src="https://www.mjvinnovation.com/wp-content/uploads/2020/12/mjv-icons-who-we-are-timeline-09-160x160.png" alt="mjv-estudo" width="120">
<br>

</h1>
<h1 align="center">
# MJV Projeto Final

#### Autor

- [Fábio Ericeira](https://github.com/FabioEriceira)
- [Projeto Final MJV School](https://github.com/FabioEriceira/mjv-java-school/tree/main/mjv-projeto-final)

Repositório contendo o código fonte do projeto final da School.
<h2>
Locação BIKE 
</h2>
<h1>

##### Tecnologias

* Java
* JPA Hibernate
* Postgre SQL
* Spring Boot
* Swagger

##### Outras ferramentas

- ⚛️ **Eclipse** — IDE utilizada para estudo da linguagem Java
- ⚛️ **Papyrus** — Ferramenta de edição gráfica para UML integrada ao Eclipse


##### Apresentação

1. Cadastro de cliente com seus endereços
2. Cadastro de equipamentos (bikes)
3. Locação das bikes com seus pedidos

##### JSON Cadastros

* Cadastrando a categoria BEBIDAS

```
{
  "descricao": "BEBIDAS"
}
```

* Cadastrando a categoria PIZZAS

```
{
  "descricao": "PIZZAS"
}
```

* Cadastrando o produto COCA COLA 2L

```
{
  "descricao": "COCA COLA 2L",
  "precoVenda": 7.75,
  "saldo": 30,
  "categoria": {
    "id": 1
  }
  
}
```

* Cadastrando o produto PIZZA 4 QUEIJOS GRANDE

```
{
  "descricao": "PIZZA 4 QUEIJOS GRANDE",
  "precoVenda": 32.00,
  "saldo": 25,
  "categoria": {
    "id": 2
  }
  
}
```

* Cadastrando um cliente

```
{
  "cpf": "89789789987",
  "nome": "GLEYSON SAMPAIO",
  "whatsapp": 89787776,
  "rg": "897878",
  "endereco": {
    "logradouro": "RUA DAS MARIAS",
    "numero": "8767",
    "bairro": "CENTRO"
  }
}

```


* Gerando um pedido

```
{
  "dataHora": "2022-05-17T12:22:25.334Z",
  "clienteId": 1,
  "itens": [
    {
      "produtoId": 1,
      "quantidade": 2,
      "valorUnitario": 7.75,
      "subtotal": 15.5
    },
    {
      "produtoId": 2,
      "quantidade": 1,
      "valorUnitario": 32.0,
      "subtotal": 32.0
    }
  ]
}

```
