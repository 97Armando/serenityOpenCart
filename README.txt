##### Proyecto de Pruebas OpenCart con Serenity BDD y Screenplay

##### Descripción
Este proyecto utiliza Serenity BDD con el patrón de diseño Screenplay para
realizar pruebas automatizadas del proceso de compras sobre la aplicacion Open Cart.

##### Configuración del Proyecto
Instalar dependencias asegúrarse de tener todas las necesarias.
Se lo puede realizar:

    - Descargando de forma local los paquetes de construccion del proyecto en este caso se uso gradle 7.6.1
    - O tambien se cuenta con la configuracion de gradlew que se utiliza para ejecutar Gradle de manera consistente
      en diferentes entornos sin necesidad de instalar Gradle previamente.

##### Configuración del Entorno
    - Configuracion de variables de entorno del constructor gradle como de la version de JAVA(8) para su correcto funcionamiento
    - Configuración de WebDriver
    - Configuracion de archivos de configuracion

##### Ejecucion de pruebas
    - Ejecucion mediante terminal con el siguiente comando
      ./gradlew clean test
    - Ejecucion desde archivo, identificar RunnerTest.java y buscar el icono de RUN al dar click derecho sobre él.