# HD Delivery
## Solução Digital desenvolvida em Java com Spring Boot e React integrada com mecanismo de geolocalização

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/heliohdd/hdsdeliver-sds2/blob/main/LICENSE) 
<!--[![Netlify Status](https://api.netlify.com/api/v1/badges/aec2d68f-8264-40f1-aaaf-499abfc5d7dd/deploy-status)](https://app.netlify.com/sites/heliodourado/deploys) -->

# Sobre o projeto
Experimente o funcionamento do aplicativo conferindo aqui [<strong>a versão em modo produção <i>"on cloud".</i> </strong>](https://heliodouradohdd.netlify.app/)

HD Delivery é uma aplicação full stack web e mobile desenvolvida durante a 2ª edição da **Semana DevSuperior** que foi um evento online, organizado por iniciativa da [DevSuperior](https://devsuperior.com "Site da DevSuperior"), com o objetivo de criar uma demonstração do uso de tecnologias modernas com destaque para o <strong>React</strong> no <i>"front-end web"</i> e <strong>React Native</strong> no <i>"front-end mobile"</i>.

Esta aplicação consiste em um <strong>Sistema de Gerenciamento</strong> de pedido e entrega de refeições fornecidas por uma rede de restaurantes e fast food. Para tal os clientes registram seus pedidos através da <i>"versão web"</i>, e as entregas são gerenciadas e entregues através da <i>"versão mobile"</i>.

### Layout

Tecnicamente falando o projeto todo foi desenvolvido envolvendo <i>"back-end"</i>, <i>"front-end web"</i> e <i>"front-end mobile"</i>.

Veja abaixo as telas que compõem o aplicativo posicionando o cursor sobre as imagens para conferir sua descrição.

## Layouts do <strong><i>"front-end web"</i></strong>

![Web 1](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web1.png "Tela inicial web")
![Web 2](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web2.png "Tela para selecionar os itens")
![Web 3](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web3.png "Tela para selecionar o local de entrega")
![Web 4](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web4.png "Confirmação do pedido")

## Layouts do <strong><i>"front-end mobile"</i></strong>

![Mobile 1](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile1.png "Tela inicial mobile")
![Mobile 2](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile2.png "Listagem dos pedidos a entregar")
![Mobile 3](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile3.png "Opções para o pedido selecionado")
![Mobile 4](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile5.png "Aplicativo GoogleMaps acionado automaticamente")
![Mobile 5](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile7.png "Local da entrega")
![Mobile 6](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile8.png "Registro de entrega realizada")
![Mobile 7](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile9.png "Consulta à listagem dos pedidos atualizada")
![Mobile 8](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile10.png "Repete se todo o ciclo de entrega do próximo pedido")

# Modelo conceitual

Abaixo é apresentado o modelo conceitual utilizado para o desenvolvimento desta aplicação.

![Modelo Conceitual](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/modelo-conceitual.png)

# Tecnologias utilizadas

Abaixo são listadas as tecnologias utilizadas para o desenvolvimento desta aplicação.

## Back-end

 Confira a documentação da API conforme especificação Open API 3.0 neste link: 
 [documentação](https://app.swaggerhub.com/apis-docs/heliohdd/api-hd_delivery/1.0.0).

- <b>Java 11 LTS</b> - (versão com suporte prolongado)
- <b>Spring Boot 2.4.1</b> - (versão estável atual do framework)
- <b>JPA/Hibernate</b> - (mapeamento ORM)
- <b>Maven</b> - (gerenciamento de dependências)
- <b>H2</b> - (banco de dados em memória)
- <b>Postman</b> - (testes durante o desenvolvimento)
## Front-end web
- <b>HTML5/CSS3/JS/TypeScript</b> - (desenvolvimento web)
- <b>React JSX</b> - (gerar aplicação web responsiva)
- <b>React Router</b> - (para rotas avançadas no React)
- <b>React-ApexCharts</b> - (para incluir interface gráfica sofisticada ao projeto)
- <b>Axios</b> - (para fazer requisições HTTP no ambiente Node.js)
## Front-end mobile
- <b>React Native</b> - (geração da Aplicação mobile)
- <b>Expo</b> - (integra o processo de desenvolvimento com o dispositivo mobile Android/iOS)

## Integração com API's
- <b>Mapbox Geocoding API</b> - (para a utilização de geolocalização no front-end web)
- <b>Google Maps API</b> - (para a utilização de geolocalização no front-end mobile)

# Implantação do Projeto
O projeto foi implatado na nuvem através da plataforma PaaS <strong>Heroku</strong> com entrega contínua (Github Actions) para a parte do back-end, dispondo assim de um ambiente que oferece alta disponibilidade e escalabilidade permitindo ao Sistema ótimos níveis de performance e funcionabilidade.

Para o front-end web foi utilizada a plataforma <strong>Netlify</strong> e o front-end mobile foi desenvolvido para ser implantado nas lojas mobile Android/iOS.

Para o armazenamento dos dados foi utilizado o Banco de Dados <strong>Postgresql</strong>.

# Como testar o projeto localmente?

Pré-requisitos:
- [Java 11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
- [npm v14](https://nodejs.org/en)
- [expo](https://expo.io)

**Clonar o repositório**

```
$ git clone https://github.com/heliohdd/project-sds2.git
```

**Executar o projeto**

## Back end

```
$ cd project-sds2/backend

$ ./mvnw spring-boot:run
```


## Front end web

```
$ cd hdsdeliver-sds2/front-web

$ npm start
```
<!--
## Front end mobile

```
$ cd hdsdeliver-sds2/front-mobile

$ npm start
```
-->
# Autor
Hélio Dourado

[![LinkedIn Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/heliohdd/)](https://www.linkedin.com/in/heliohdd/)
