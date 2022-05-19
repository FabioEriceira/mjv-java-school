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

Disponibilizar o link do github do projeto bem descrito quanto às funcionalidades, implementações relevantes, participação dos membros da equipe, READEME com a jornada na plataforma e a API Rest documentada pelo Swagger em um ambiente Azure, Heroku ou OnPromisse.

### Critérios de Aceite - Expectativa da Entrega: 

1.	Apresentar a estrutura do projeto no github ou na IDE;

2.	Apresentar a API da plataforma devidamente documentada e preferencialmente no Heroku;

3.	Realizar uma demonstração de uma jornada de consumo dos recursos para conforme requisitados;

<h1>

<h2>
O PROJETO
</h2>
Apresentar a estrutura do projeto de uma LOCAÇÃO DE BIKES em uma API devidamente documentada conforme requisitos
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

1. Diagrama UML (Linguagem de Modelagem) de Classes do projeto
2. Diagrama ER (Entidade de Relacionamento) dos Bancos de dados
3. Cadastro de Equipamentos (bikes)
4. Cadastro de Cliente com seus Endereços
5. Locação das Bikes com seus pedidos
6. Pesquisas das informações nos bancos de dados.

<br>
<h1>

## IDEIA GERAL DA LOCACAO DE BIKES

Sabemos que um programa não nasce sem uma motivação e a jornada que nos foi passada é que devemos ser **bons usuários** para sermos **bons desenvolvedores**, então, tentando ser um bom usuário pensamos em uma idéia geral de locacao de bike.

Achamos que, para um melhor entendimento, é importante mostar esta idéia geral em um mapa, apesar de sabemos que para executar esta idéia, precisaríamos de todos estes módulos: compras, cadastros, locacao, devolucao, manutenção, relatórios, dashboards, etc, mas, para atender ao desafio irei apresentar apenas o que está em amarelo.

<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169309441-61a55293-2fcb-4929-a3d5-6c51e3fad7c8.png" />
 </div>
<br>


### EXPECTATIVA



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

#### 3. Cadastro de Equipamento (Bike)

##### JSON Cadastro
3.1. Cadastro de um equipamento (bike) no swagger

```
{
  "tipoEquipamento": "MTB",
  "fabricacao": "2019",
  "marca": "CALOI",
  "grupo": "SHIMANO TOURNEY",
  "qtdDisponivel": 3,
  "valorLocacao": 50
}
```

3.2. Fazer apresentação do RUD (Read, Update e Delete) desta inclusão no swaggar
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169022749-5079619b-801d-41fa-a738-570728714cd2.jpg" width="200px" />
 </div>
3.3. Incluir outros equipamentos via banco de dados.


```
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('MTB','2019','CALOI','SHIMANO TOURNEY',3,50);
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('SPEED','2020','SPECIALIZED','SRAM GX EAGLE',2,200);
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('SPEED','2020','OGGI','SHIMANO ALTUS',3,100);
INSERT INTO public.equipamento (tipo_equipamento,fabricacao,marca,grupo,qtd_disponivel,valor_locacao)
VALUES ('MTB','2021','SPECIALIZED','SRAM GX EAGLE',3,200);
```
<h1>

#### 4. Cadastro de Cliente com seus Endereços

##### JSON Cadastro
4.1. Cadastro de um Cliente no Swagger

```
{
  "id": 0,
  "cpf": "43743743791",
  "nome": "MANOEL DE MARIA",
  "telefone": "98987456321",
  "endereco": {
    "id": 0,
    "logradouro": "RUA ANAPURUS, 20, JARDIM RENASCENCA II",
    "cidade": "SAO LUIS",
    "estado": "MA",
    "cep": "65075450"
  }
}
```

4.2. Fazer apresentação do RUD (Read, Update e Delete) verificando que as tabelas de endereço e cliente estao ligadas via cascade, ou seja, o que fizer no banco de cliente fará no banco de endereço.
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169022749-5079619b-801d-41fa-a738-570728714cd2.jpg" width="200px" />
 </div>

<br>
4.3. Incluir via banco de dados clientes do boku no hero academy. 

4.3.1 - Primeiro os endereços, eles moram em São Luís :)

```
INSERT INTO public.endereco (logradouro,cidade,estado,cep)
	VALUES ('Praça São João, n.10, Centro ','São Luís ','MA','65010610');
INSERT INTO public.endereco (logradouro,cidade,estado,cep)
	VALUES ('Rua da Saavedra, n.01, Centro ','São Luís ','MA','65010620');
INSERT INTO public.endereco (logradouro,cidade,estado,cep)
	VALUES ('Rua Apolo, 350, Jrdm Renascença ','São Luís ','MA','65075-680');
```

4.3.2 - Agora os clientes ;)

```
INSERT INTO public.cliente (cpf,nome,telefone,endereco_id)
	VALUES ('25280369063','KATSUKI BAKUGO','98912345678',11);
INSERT INTO public.cliente (cpf,nome,telefone,endereco_id)
	VALUES ('25280369063','SHOTO TODOROKI','98912345678',12);
INSERT INTO public.cliente (cpf,nome,telefone,endereco_id)
	VALUES ('25280369063','IZUKU MIDORIYA','98912345678',13);
```

<h1>

#### 5. Locação das Bikes com seus pedidos

##### JSON Cadastro
5.1. Gerando uma locacação 

OBS. Iremos informar:
 * A data da locação e devolução;
 * O código do cliente;
 * O código do equipamento;
 * O subtotal, que é o valor da locacao do equipamento.

 A regra aqui é que: 
 * o programa irá calcular a quantidade de dias através das datas informadas e jogar na quantidade de dias de locação e;
 * Pegar o subtotal do(s) item(ns), multiplicar pela quantidade de dia(s), somar se tiver mais de um item e "subir" para o valor total e;
 * Subtrair da quantidade do estoque do equipamento.(cada equipamento locado é unico, então fará uma subtração de uma unidade).


```
{
  "id": 0,
  "dataRetirada": "2022-05-18T11:47:35.201Z",
  "dataDevolucao": "2022-05-20T11:47:35.201Z",
  "clienteId": 13,
  "valorFinal": 0,
  "itens": [
    {
      "id": 0,
      "equipamentoId": 16,
      "qtdDiasLocacao": 0,
      "subtotal": 200
    }
  ]
}

```
**Observar no banco de dados:** 
1. A inclusão de uma locação;
2. A inclusão de inclusão de itens;
3. O decremento do estoque do item locado.

<h1>

#### 6. Pesquisas das informações nos bancos de dados.

1. Se eu quiser saber de uma determinada locacao qual foi o valor total e qual foi o cliente?


```
select li.id, li.valor_final, c.nome 
from locacao li 
	inner join cliente c 
	on li.cliente_id = c.id 
where li.id = 1;	

```

2. E se eu quiser saber quais os equipamentos desta locacao, seus valores e data da retirada?

```
select li.id, li.valor_final, c.nome 
from locacao li 
	inner join cliente c 
	on li.cliente_id = c.id 
where li.id = 1;	

```

3. Será que tem como juntar mais informações? Tipo desta locacao, quais os equipamentos, quais os seus valores, quem locou, o seu endereço data de retirada e devolucao e valor final, será que é possível?

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
where li.locacao_id  = 1;

```