# Angular Frontend Shop App
<img alt="spring-boot-angular" src="https://miro.medium.com/max/2600/1*e_GNttaJ14fRHslfQYx6eA.png" width="500">

> This application has been made with monolithic architecture. The frontend of application is angular, backend is spring-boot and database is mongoDB.

## Installation of Frontend

### Clone repository

```bash
git clone https://github.com/aferen/monolithic-shop-angular-springboot.git
cd monolithic-shop-angular-springboot
```

#### Install Angular-Cli globally 

```bash
npm install -g @angular/cli
```

#### Install NPM packages

```bash
npm install
```

#### Run development server

```bash
npm run start
```

Runs a webpack-development server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
- User Test Accounts
  - admin: `email:admin@admin.com | password:12345`
  - user: `email:user@user.com | password:12345`
#### Build app for prod

```bash
npm run build
```

###### Note: 
> This application has been cloned from the following [link](https://github.com/monobasic/Angular-Reactive-Demo-Shop) and the backend of the application has been changed from google firebase to spring-boot.


## Installation of Backend
 
#### Create Mongo database and import data

```bash
mongorestore  data/
```

#### Set env for mongo and jwt security

```bash
export MONGO_URI=mongodb://localhost:27017/shop
export JWT_BASE64_SECRET=$(openssl rand -base64 64)
```

#### Run the app
	
Note: Images were pixelated because of license reasons.

You can run the spring boot app by typing the following command

```bash
./mvnw
```

The server will start on port 8080.

You can also package the application in the form of a `jar` file and then run it

```bash
./mvnw package
java -jar target/spring-boot-shop-0.0.1-SNAPSHOT.jar
```
###### Note: 
> Mongodb data has been provided from the following [link](https://github.com/monobasic/Angular-Reactive-Demo-Shop).

