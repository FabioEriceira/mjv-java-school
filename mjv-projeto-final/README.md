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

- **Eclipse** — IDE utilizada para estudo da linguagem Java
- **Papyrus** — Ferramenta de edição gráfica para UML integrada ao Eclipse


##### Apresentação

1. Diagrama UML do projeto.
2. 
3. Cadastro de Equipamentos (bikes)
4. Cadastro de Cliente com seus Endereços
5. Locação das Bikes com seus pedidos
<br>
<h1>

#### 1. Diagrama UML (Unified Modeling Language) - Linguagem de Notação ou Linguagem de Modelagem Unificada do Projeto



<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169039572-bfceee9a-5e87-4bb5-b59e-9b885fe3996f.png" width="600px" />
 </div>

<br>
<h1>

<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169041303-50e84b75-1bd9-49dd-ad14-93d90c148398.png" width="1200px" />
 </div>



#### 1. Cadastro de Equipamento (Bike)

##### JSON Cadastro
1.1. Cadastro de um equipamento (bike) no swagger

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

1.2. Fazer apresentação do RUD (Read, Update e Delete) desta inclusão no swaggar
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169022749-5079619b-801d-41fa-a738-570728714cd2.jpg" width="200px" />
 </div>
1.3. Incluir outros equipamentos via banco de dados.


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

#### 2. Cadastro de Cliente com seus Endereços

##### JSON Cadastro
1.1. Cadastro de um Cliente no Swagger

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

1.2. Fazer apresentação do RUD (Read, Update e Delete) verificando que as tabelas de endereço e cliente estao ligadas via cascade, ou seja, o que fizer no banco de cliente fará no banco de endereço.
<div align="center">
  <img src="https://user-images.githubusercontent.com/96257601/169022749-5079619b-801d-41fa-a738-570728714cd2.jpg" width="200px" />
 </div>

<br>
1.3. Incluir via banco de dados clientes do boku no hero academy. 

1.3.1 - Primeiro os endereços, eles moram em São Luís :)

```
INSERT INTO public.endereco (logradouro,cidade,estado,cep)
	VALUES ('Praça São João, n.10, Centro ','São Luís ','MA','65010610');
INSERT INTO public.endereco (logradouro,cidade,estado,cep)
	VALUES ('Rua da Saavedra, n.01, Centro ','São Luís ','MA','65010620');
INSERT INTO public.endereco (logradouro,cidade,estado,cep)
	VALUES ('Rua Apolo, 350, Jrdm Renascença ','São Luís ','MA','65075-680');
```

1.3.2 - Agora os clientes ;)

```
INSERT INTO public.cliente (cpf,nome,telefone,endereco_id)
	VALUES ('25280369063','KATSUKI BAKUGO','98912345678',11);
INSERT INTO public.cliente (cpf,nome,telefone,endereco_id)
	VALUES ('25280369063','SHOTO TODOROKI','98912345678',12);
INSERT INTO public.cliente (cpf,nome,telefone,endereco_id)
	VALUES ('25280369063','IZUKU MIDORIYA','98912345678',13);
```

<h1>

#### 3. Locação das Bikes com seus pedidos

##### JSON Cadastro
3.1. Gerando uma locacação 

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

