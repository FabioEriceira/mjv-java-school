<h1 align="center">
<br>
  <a href="https://www.mjvinnovation.com/pt-br/quem-somos/">
  <img src="https://www.mjvinnovation.com/wp-content/uploads/2020/12/mjv-icons-who-we-are-timeline-09-160x160.png" alt="mjv-estudo" width="120">
<br>

</h1>
<h1 align="center">
# MJV Projeto Final
</h1>

##### Repositório contendo o código fonte do projeto final da School.
<h2>
O DESAFIO
</h2>

### Obrigatoriedades:
Apresentar a API sua aplicação devidamente documentada para uma demonstração de uma jornada de consumo dos recursos pertinentes a proposta do teu projeto.

### Orientações: 
Detalhar no README do projeto modelo de consumo de endpoint para facilitar a utilização da API:

### Forma de entrega: 

Disponibilizar o link do github do projeto bem descrito quanto às funcionalidades, implementações relevantes, participação dos membros da equipe, README com a jornada na plataforma e a API Rest documentada pelo Swagger em um ambiente Azure, Heroku ou OnPromisse.

### Critérios de Aceite - Expectativa da Entrega: 

1.	Apresentar a estrutura do projeto no github ou na IDE;

2.	Apresentar a API da plataforma devidamente documentada e preferencialmente no Heroku;

3.	Realizar uma demonstração de uma jornada de consumo dos recursos conforme requisitados;

<h2>
O PROJETO
</h2>
A jornada será então: Apresentar a estrutura do projeto de uma LOCAÇÃO DE BIKES em uma API devidamente documentada conforme requisitos

<br>

#####  Alunos participantes (Ordem Alfabética) / Github

- [Fábio Ericeira](https://github.com/FabioEriceira)

- [Paulo Ricardo](https://github.com/Paulo-Ultra)

- [Renato Gonçalves](https://github.com/Renato-RJ)

##### Tecnologias

* Java
* JPA Hibernate
* Postgre SQL
* Spring Boot
* Swagger

##### Outras ferramentas

- **Eclipse** — IDE utilizada para estudo da linguagem Java
- **Papyrus** — Ferramenta de edição gráfica para UML integrada ao Eclipse

##### Apresentação conterá

1. Diagrama UML (Linguagem de Modelagem) de Classes do projeto;
2. Diagrama ER (Entidade de Relacionamento) dos Bancos de dados;
3. Estrutura da aplicação na ide Eclipse padrão MVC (Model-View-Controller);
4. Cadastro de Equipamento que são as bikes para locação;
5. Cadastro de Cliente com seus Endereços;
6. Locação das Bikes com seus pedidos;
7. Pesquisas das informações nos bancos de dados.

<br>
<h1>

## IDEIA GERAL DA LOCAÇÃO DE BIKES

Sabemos que um programa não nasce sem uma motivação e a jornada que nos foi passada é que devemos ser **bons usuários** para sermos **bons desenvolvedores**, então, tentando ser um bom usuário pensamos em uma idéia geral de locação de bike.

Achamos que, para um melhor entendimento, é importante mostar esta idéia geral em um mapa, apesar de sabemos que para executar esta idéia, precisaríamos de todos estes módulos: compras, cadastros, locação, devolução, manutenção, relatórios, dashboards, etc, mas, para atender aos requisitos do desafio, foi feito os módulos destacados, que serão apresentados.

##### Expectativa

1. Executar uma locação de uma ou mais bikes para um cliente e, ao locar diminuir no estoque a bike locada.
2. Verificar estas informações nos bancos de dados.
3. Fazer uma consulta referente a estas informações.


<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169337348-6b2cbacc-da1d-4ed5-89cb-e5ca78dd9a00.png" />
 </div>
<br>

## ESTRUTURA

#### 1. Diagrama UML (Unified Modeling Language) - Linguagem de Notação ou Linguagem de Modelagem Unificada do Projeto
<br>
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169041303-50e84b75-1bd9-49dd-ad14-93d90c148398.png" width="1200px" />
 </div>
<br>
<h1>

#### 2. Diagrama ER (Entidade de Relacionamento)
<br>
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169039572-bfceee9a-5e87-4bb5-b59e-9b885fe3996f.png" width="500px" />
 </div>
<br>
<h1>

#### 3. ESTRUTURA DA APLICAÇÃO - PADRÃO MVC (MODEL-VIEW-CONTROLLER)
<br>

Algumas definições do padrão MVC

* Controller - camada intermediária entre a camada de apresentação (swagger) e a camada de negócios (model);
* enums - conjunto fixo de valores (SPEED e MTB);
* model - classe de modelos de dados; 
* dto - usado como parte da infra da aplicação. Serve para especificar qual banco será usado;
* repository - Trabalha como uma porta de acesso a outra camada, algumas vezes com a dto;
* LocacaoCustomRepository - usando para fazer as pesquisas no banco de dados através de nativeQuery;
* NativeQuery - é um processo que tem como objetivo executar o código SQL em uma consulta;
* Service - responsável pela lógica do negócio na aplicação, é aqui é que quando ocorre a locação, faço a diminuição da quantidade do item do estoque.

<br>

### Estrutura
```
 com.mjv.projetofinal
   controller
     ClienteController
     EquipamentoController
     LocacaoController
 enums
   TipoEquipamento
 model
   cadastro 
     Cliente
     Endereco
     Equipamento
   locacao 
     dto
       LocacaoListagem
       LocacaoLIstagem2
     Locacao
     LocacaoItem
 repository
   ClienteRepository
   EndereçoRepository
   EquipamentoRepository
   LocacaoRepository
   LocacaoCustomRepository 
   LocacaoItemRepository
   LocacaoRepository
 service
   LocacaoService
 MjvProjetoFinalApplication.java
```

## Cadastros

#### 4. Cadastro de Equipamento (Bike)

##### JSON Cadastro
4.1. Cadastro de um equipamento (bike) no swagger

```
{
  "id": 0,
  "tipoEquipamento": "MTB",
  "fabricacao": "2019",
  "marca": "CALOI",
  "grupo": "SHIMANO TOURNEY",
  "qtdDisponivel": 5,
  "valorLocacao": 50
}
```

4.2. Fazer apresentação do RUD (Read, Update e Delete) desta inclusão no swaggar
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169022749-5079619b-801d-41fa-a738-570728714cd2.jpg" width="200px" />
 </div>
 <br>

4.3. Incluir outros equipamentos via SQL no banco de dados de equipamento.

```
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('MTB','2019','CALOI','SHIMANO TOURNEY',5,50);
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('SPEED','2020','SPECIALIZED','SRAM GX EAGLE',5,200);
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('SPEED','2020','OGGI','SHIMANO ALTUS',5,100);
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('MTB','2021','SPECIALIZED','SRAM GX EAGLE',5,200);
```
<h1>

#### 5. Cadastro de Cliente com seus Endereços

##### JSON Cadastro
5.1. Cadastro de um Cliente no Swagger

```
{
  "id": 0,
  "cpf": "25280369063",
  "nome": "KATSUKI BAKUGO",
  "telefone": "98912345678",
  "endereco": {
    "id": 0,
    "logradouro": "Rua Anapurus, 20, Jardim RENASCENCA II",
    "cidade": "SAO LUIS",
    "estado": "MA",
    "cep": "65075450"
  }
}

```

5.2. Fazer apresentação do RUD (Read, Update e Delete) verificando que as tabelas de endereço e cliente estao ligadas via cascade, ou seja, o que fizer no banco de cliente fará no banco de endereço.
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169022749-5079619b-801d-41fa-a738-570728714cd2.jpg" width="200px" />
 </div>

<br>
5.3. Incluir outros clientes com seus endereços

```
{
  "id": 0,
  "cpf": "25280369063",
  "nome": "KATSUKI BAKUGO",
  "telefone": "98912345678",
  "endereco": {
    "id": 0,
    "logradouro": "Rua Anapurus, 20, Jardim RENASCENCA II",
    "cidade": "SAO LUIS",
    "estado": "MA",
    "cep": "65075450"
  }
}

{
  "id": 0,
  "cpf": "49924023056",
  "nome": "SHOTO TODOROKI",
  "telefone": "98981427777",
  "endereco": {
    "id": 0,
    "logradouro": "Rua da Saavedra, n.01, Centro",
    "cidade": "SAO LUIS",
    "estado": "MA",
    "cep": "65010620"
  }
}

{
  "id": 0,
  "cpf": "25280369063",
  "nome": "IZUKU MIDORIYA",
  "telefone": "98987654112",
  "endereco": {
    "id": 0,
    "logradouro": "Rua Apolo, 350, Jardim Renascença I",
    "cidade": "SAO LUIS",
    "estado": "MA",
    "cep": "65075450"
  }
}

```


<h1>

#### 6. Locação das Bikes com seus pedidos
6.1. Gerando uma locacação 

OBS. Iremos informar:
 * A data da locação e devolução;
 * O código do cliente;
 * O código do equipamento;
 * O subtotal, que é o valor da locacao do equipamento.

 A regra aqui é que: 
 * o programa irá calcular a quantidade de dias através das datas informadas e jogar na quantidade de dias de locação e;
 * Pegar o subtotal do(s) item(ns), multiplicar pela quantidade de dia(s), se tiver mais de um item, somar e "subir" para o valor total e;
 * Subtrair da quantidade do estoque do equipamento.(cada equipamento locado é unico, então fará uma subtração de uma unidade).

##### JSON Cadastro

```
{
  "id": 0,
  "dataRetirada": "2022-05-19T11:47:35.201Z",
  "dataDevolucao": "2022-05-20T11:47:35.201Z",
  "clienteId": 2,
  "valorFinal": 0,
  "itens": [
    {
      "id": 0,
      "equipamentoId": 2,
      "qtdDiasLocacao": 0,
      "subtotal": 50
    }
  ]
}

```
**Observar no banco de dados:** 
1. A inclusão de uma locação;
2. A inclusão de inclusão de itens;
3. O decremento do estoque do item locado.

```
{
  "id": 0,
  "dataRetirada": "2022-05-19T20:24:24.426Z",
  "dataDevolucao": "2022-05-20T20:24:24.426Z",
  "clienteId": 3,
  "valorFinal": 0,
  "itens": [
    {
      "id": 0,
      "equipamentoId": 4,
      "qtdDiasLocacao": 0,
      "subtotal": 50
    },
    {
      "id": 0,
      "equipamentoId": 5,
      "qtdDiasLocacao": 0,
      "subtotal": 200
    }
  ]
}


{
  "id": 0,
  "dataRetirada": "2022-05-19T11:47:35.201Z",
  "dataDevolucao": "2022-05-22T11:47:35.201Z",
  "clienteId": 4,
  "valorFinal": 0,
  "itens": [
    {
      "id": 0,
      "equipamentoId": 2,
      "qtdDiasLocacao": 0,
      "subtotal": 200
    },
    {
      "id": 0,
      "equipamentoId": 3,
      "qtdDiasLocacao": 0,
      "subtotal": 100
    },
    {
      "id": 0,
      "equipamentoId": 4,
      "qtdDiasLocacao": 0,
      "subtotal": 200
    }
  ]
}


```





<h1>

#### 7. Pesquisas das informações nos bancos de dados.

	


7.1. Se eu quiser saber informação das locacões, com as data de retirada e devolucao e qual foi o valor total e qual cliente locou?
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169363376-8ad1eed4-b439-4e0d-a622-5c30dd173cf1.png" width="1000px" />
</div>


7.2. E se eu quiser saber mais detalhes de determinada locacao, como: equipamentos desta locacao, seus valores e data da retirada?

<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169363351-85ea64f4-d065-4d83-accc-d83068045f08.png" width="1000px" />
</div>

<br>

Ainda criei no próprio banco de dados um scripts para mostra todas as informações da locacao, para brincar um pouco.

```
select  li.locacao_id, e.tipo_equipamento, e.grupo, li.subtotal, c.nome, e2.logradouro, l.data_retirada, l.data_devolucao , l.valor_final  
from locacao_item li 
	inner join locacao l 
	on li.locacao_id = l.id 
	inner join equipamento e 
	on li.equipamento_id  = e.id 
	inner join cliente c 
	on l.cliente_id = c.id 
	inner join endereco e2 
	on c.endereco_id  = e2.id 
where li.locacao_id  = 3;
```

