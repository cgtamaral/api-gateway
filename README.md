# API Gateway

API Gateway é uma API simples construida em Java com Spring Cloud Gateway para direcionamento de chamadas a serviços de um e-commerce fictício. 
Esta API foi elaborada como parte do trabalho de conclusão da disciplina de Arquitetura de Nuvens do curso de pós-graduação em Arquitetura de Software na PUC Minas.

#### Pré-Requisitos
- Eclipse Photon ou superior com Spring Boot Tools;
- Java JDK 8 ou superior;
- Apache Maven versão 3.6.0;

#### Instalação e execução da aplicação em ambiente local
- Clonar o projeto em um diretório desejado;
- Importar o código fonte no Eclipse, selecionar a opção **Existing Maven Projects**; 
- Editar o arquivo **application.properties** e alterar o valor do parametro **spring.profiles.active** para **dev**;
- Na aba **Project Explorer**, clicar no projeto com o botão direito do mouse e selecionar a opção run ou debug, **Spring Boot Applications**;

#### Serviços direcionados pelo Gateway

##### Catalog microservice
- Microserviço desenvolvido em NodeJS
- **[catalog-microservice](https://github.com/lucashdp/catalog-microservice)**

##### Basket microservice
- Microserviço desenvolvido em NodeJS
- **[basket-microservice](https://github.com/lucashdp/basket-microservice)**

##### Locations microservice
- Microserviço desenvolvido em .NET Core
- **[locations-microservice](https://github.com/lucashdp/locations-microservice)**

##### Ordering microservice
- Microserviço desenvolvido em Java
- **[ordering-microservice](https://github.com/cgtamaral/ordering-microservice)**

##### Marketing microservice
- Microserviço desenvolvido em Java
- **[marketing-microservice](https://github.com/cgtamaral/marketing-microservice)**

##### Identity microservice
- Microserviço desenvolvido em Java
- **[identity-microservice](https://github.com/cgtamaral/identity-microservice)**
#### Deploy Heroku

A aplicação encontra-se disponivel no ambiente do Heroku, para visualizar os serviços existentes acessar a aplicação através do link 
()
