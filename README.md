# SparkAppWeb




## Introduccion

Desarrollo de una aplicacion web utilizando spark que permite calcular la media y la desviacion estandar 

## Status

[![CircleCI](https://circleci.com/gh/USHIWAKA-SAMA/taller-arep.svg?style=svg)](https://app.circleci.com/jobs/github/USHIWAKA-SAMA/taller-arep)

### Prerequisitos

Verifique que Java está instalado
```
java version "1.8.0_60"
Java(TM) SE Runtime Environment (build 1.8.0_60-b27)
Java HotSpot(TM) 64-Bit Server VM (build 25.60-b23,
mixed mode)
```
```
java -version
```
Verifique que Maven está instalado
```
mvn --version
```
```
Apache Maven 3.3.9
(bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-
10T11:41:47-05:00)
Verifique que Git está instalado
git --version
git version 2.6.4
```
### Instalacion

Primero clone el repositorio con el comando 

```
git clone https://github.com/Drakocedo/SparkAppWeb.git
```

y compile el proyecto con el comando

```
mvn package
```

End with an example of getting some data out of the system or using it for a little demo

## Pruebas

Desde la carpeta
```
\SparkAppWeb
```

Para correr las pruebas ejecute el comando:
```
mvn test
```


## Deployment

Desde la carpeta
```
\SparkAppWeb
```

compile el proyecto con el comando

```
mvn package
```

Para correr la aplicacion utilice el comando 
```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.SparkWebApp"
```

## Herramientas

* [Spark](http://sparkjava.com/) - A micro framework for creating web applications in Kotlin and Java 8 with minimal effort
* [Maven](https://maven.apache.org/) - Dependency Management



## Autor

* **David Caycedo** - *Initial work* - [Git](https://github.com/Drakocedo)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

