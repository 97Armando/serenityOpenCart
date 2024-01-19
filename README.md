##### Proyecto de Pruebas OpenCart con Serenity BDD y Screenplay

##### Descripción
Este proyecto utiliza Serenity BDD con el patrón de diseño Screenplay para
realizar pruebas automatizadas del proceso de compras sobre la aplicacion Open Cart.

1. Prerequisitos:

    - Maquina local con el sistema operativo Windows 10 o Windows validado en ambas versiones
    - IDE IntelliJ version 2023.3.2
    - Descargando de forma local los paquetes de construccion del proyecto en este caso se uso gradle 7.6.1
      O de otra forma tambien se cuenta con la configuracion de gradlew que se utiliza para ejecutar Gradle de manera consistente
      en diferentes entornos sin necesidad de instalar Gradle previamente.
    - JDK JAVA versión 8 (debe estar configurado en la variable de entorno del sistema)
    - Dependencias GRADLE que se encuentran disponibles en maven repository https://mvnrepository.com/ entre las principales
      junit-bom:5.9.1
      junit-jupiter
      serenity-core:3.6.23
      serenity-junit:3.6.23
      serenity-cucumber:3.6.23
      serenity-screenplay-webdriver:3.6.23
      junit:4.13.2
      serenity-screenplay:3.6.23
      maven-compiler-plugin:3.11.0
      serenity-maven-plugin:3.6.23

2. Comandos de instalación

    - Instalacion mediante descarga de .zip con los binarios de gradle y configuracion de variables de entorno

3. Instrucciones para ejecutar los test
   - Realizar la descarga o la clonacion del repositorio serenityOpenCart (https://github.com/97Armando/serenityOpenCart.git)
   - Descomprimir el archivo y abrir en el IDE
   - Verificar la instalacion de dependencias
   - Abrir el terminal del IDE y ejecutar el siguiente comando ./gradlew clean test ó
     Ejecutar desde archivo, identificar RunnerTest.java y buscar el icono de RUN al dar click derecho sobre él.

4. Información adicional
   - Instalar las dependencias puede tomar su tiempo, tambien se debe otorgar permisos firewall se lo ha realizado automatico.
   - Para validar el informe se puede dirigir al directorio target/xxxxxxx.html y buscar un archivo de extension .html 
     similar al creado en la ultima ejecucion 506c3062d2e6f64a21ea02776bee32d9ffcba941e147ef8d42bfe1a442c4cd56.html

5. Referencias:
   https://serenity-bdd.github.io/docs/screenplay/screenplay_fundamentals

TEST OK!    