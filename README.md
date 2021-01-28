# DS Delivery 
## Projeto Semana DevSuperior - DS Deliver 2

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/heliohdd/hdsdeliver-sds2/blob/main/LICENSE) 
[![Netlify Status](https://api.netlify.com/api/v1/badges/aec2d68f-8264-40f1-aaaf-499abfc5d7dd/deploy-status)](https://app.netlify.com/sites/heliodourado/deploys) 

# Sobre o projeto
https://heliodourado.netlify.app

DS Delivery é uma aplicação full stack web e mobile desenvolvida durante a 2ª edição da **Semana DevSuperior**,
evento organizado por iniciativa da [DevSuperior](https://devsuperior.com "Site da DevSuperior").

Esta aplicação consiste em um sistema de gerenciamento de pedidos e de entrega de uma rede de restaurantes e fast food.
Os clientes registram seu pedido através da versão web,  e as entregas são gerenciadas e entregues através da versão mobile.

### Layout mobile
![Mobile 1](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile1.png)
![Mobile 2](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile2.png)
![Mobile 3](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile3.png)
![Mobile 4](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile5.png)
![Mobile 5](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile7.png)
![Mobile 6](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile8.png)
![Mobile 7](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile9.png)
![Mobile 8](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/mobile10.png)


### Layout web
![Web 1](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web1.png)
![Web 2](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web2.png)
![Web 3](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web3.png)
![Web 4](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web4.png)
![Web 5](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web5.png)
![Web 6](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web6.png)
![Web 7](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/web7.png)

### Modelo conceitual
![Modelo Conceitual](https://github.com/heliohdd/assets/blob/main/raw/main/sds2/modelo-conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## API
- Mapbox
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositóio
git clone https://github.com/heliohdd/hdsdeliver-sds2.git
# entrar na pasta do projeto back end
cd backend
# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/heliohdd/hdsdeliver-sds2.git
# entrar na pasta do projeto front end web
cd front-web
# instalar dependências
npm install
# executar o projeto
npm start
```
## Front end mobile
Pré-requisitos: npm / expo

```bash
# clonar repositório
git clone https://github.com/heliohdd/hdsdeliver-sds2.git
# entrar na pasta do projeto front end web
cd front-mobile
# instalar dependências
expo install @react-navigation/stack @react-native-community/masked-view react-native-screens react-native-gesture-handler @react-navigation/native expo-app-loading @expo-google-fonts/open-sans expo-font
# executar o projeto
npm start
```

# Autor
Hélio Dourado

https://www.linkedin.com/in/heliohdd/
