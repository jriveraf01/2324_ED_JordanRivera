# TE2.1 - Configuración de Eclipse y JetBrains IntelliJ IDEA

En esta tarea de aprendizaje, aprenderás a instalar el JDK y JREs en Windows y Linux, y a configurar Eclipse y JetBrains IntelliJ IDEA.

## Recursos

- [Instalación del JDK en Linux](https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html)
- [Instalación del JDK en Windows](https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html)

### Objetivos

- Conocer cómo instalar el JDK/JRE en Windows y Linux.
- Conocer cómo configurar Eclipse y JetBrains IntelliJ IDEA para utilizar un JDK.
- Conocer cómo configurar Windows y Linux a nivel de sistema para utilizar diferentes versiones de Java.
- Conocer cómo instalar y usar la herramienta SDKMan para instalar diferentes versiones de Java en Linux/MacOS/Windows.

### Recursos

**GIF Videos**

- [Software crear GIFs animados para Windows](https://www.screentogif.com/)
- [Software crear GIFs animados para Linux](https://github.com/phw/peek)
- [Herramienta Online GIF](https://ezgif.com/video-to-gif)

### Entrega

El documento justificativo de la realización de la tarea se realizará en formato `Markdown`, el nombre del fichero será `readme.md` y estará dentro de la carpeta `UT2\TE2.1` dentro del repositorio oficial del alumno para la asignatura.

El fichero `readme.md` debe contener los siguientes apartados:

- Cada uno de los puntos de la tarea.

### 1. Configuración de Java en Windows y Linux

1. Revisa la configuración de tu máquina a través del terminal e indica la versión de Java que tienes instalada.

```bash
# Comprueba la versión de Java instalada
$> java -version
# Comprueba donde está instalado Java
$> where java
# Busca todas las versiones de Java instaladas
$> which java
```

📎 _Adjunta una imagen de los comandos anteriores y responde a las siguientes preguntas_

    ¿Qué versión de Java tienes instalada?

    ¿Cuantas versiones de Java tienes instaladas? ¿ Por qué?

    Si tienes más de una versión indica todas las versiones y rutas de instalación.

![.](/img/ej1t2.png)
    

2. Variables de entorno.

  ![.](/img/ej2t2.png)
  ![.](/img/ej2at2.png)
  ![.](/img/ej2bt2.png)

   - Muestra a través de interfaz (imagen) (Usuarios y sistema)
   - Muestra a nvel de comandos (imagen) (Solo usuario) (`set`)
   - Muestra el contenido de la variable `PATH` (`echo %PATH%`) y de la variable `JAVA_HOME` (`echo %JAVA_HOME%`)

3. Instala el JDK 19 la implementación de Adoptium (Windows)

   - Ves a la página de [Adoptium](https://adoptium.net/) y descarga la versión de Java 19 para Windows y la arquitectura de tu PC (x32/x64).
     ![.](/img/ej3t2.gif)

   - Una vez instalado, muestra la versión de Java instalada y la ruta de instalación. (a través de comandos y adjunta una imagen)
     (`java -version` y `where java`)
     ![.](/img/ej3at2.png)

   - ¿ La versión de Java que te muestra es la 19? ¿ Por qué?
   
   No porque al descargar de su página he descargado la versión mas reciente la cuál es la 21.0.2

4. Configura tu sistema para que utilice la versión de Java 19 como versión por defecto a nivel de usuario. (Si ya lo tienes explica por qué)

   - ¿ Cómo has configurado tu sistema para que utilice la versión de Java 19 como versión por defecto?

   Por error lo hice con la versión actualizada de java que es la versión 21.0.2 pero se realizaria de la misma manera con la versión 19 solo que tendrias que descargar en la página de oracle la versión 19.

   ```
   Paso 1:
   Instalar Java 21.0.2:
   Descarga e instala la versión 21.0.2 de Java en tu sistema desde el sitio web oficial de Oracle o desde la fuente de tu elección.

   Paso 2:
   Configurar la variable de entorno JAVA_HOME:

   ·Abre el Panel de control.
   
   ·Haz clic en "Sistema y seguridad" y luego en "Sistema".
   
   ·Haz clic en "Configuración avanzada del sistema" en el panel izquierdo.
   
   ·En la ventana Propiedades del sistema, ve a la pestaña "Opciones avanzadas" y haz clic en "Variables de entorno".
   
   ·En la sección "Variables del usuario", haz clic en "Nuevo" para agregar una nueva variable de entorno.
   
   ·Ingresa JAVA_HOME como nombre de la variable y la ruta de instalación de Java 21.0.2 como valor. Por ejemplo, C:\Program Files\Java\jdk-21.0.2.
   
   ·Haz clic en "Aceptar" para guardar la variable de entorno.
   
   Paso3:
   Actualizar la variable PATH:

   ·En la misma ventana de "Variables de entorno", busca la variable PATH en la sección "Variables del usuario" y selecciónala.
   
   ·Haz clic en "Editar".
   
   ·En la ventana Editar variable de entorno, haz clic en "Nuevo" y agrega la ruta al directorio bin de Java 21.0.2. Por ejemplo, C:\Program Files\Java\jdk-21.0.2\bin.
   
   ·Haz clic en "Aceptar" para guardar los cambios.
   
   ·Verificar la configuración:

   Abre una nueva ventana del símbolo del sistema (CMD) y escribe java -version. Deberías ver que se utiliza la versión 21.0.2 de Java.
   
   
   Siguiendo estos pasos, has configurado la versión 21.0.2 de Java como la versión por defecto a nivel de usuario en tu sistema Windows.
   ```

### 2. Utilización de SDKMan

5. Instala SDKMan en Windows. (_Para ello puedes seguir la guía disponible [aquí](../docs/doc_sdkman.md)_)

   - Instala SDKMan en Windows e explica los pasos que has seguido, adjunta una captura final de SDK funcionando.

      Lo he descargado mediante el codigo que te ofrece la página de SDKMan el cuál debes de usar en la aplicación de Git Bash.
      
   - Muestra la versión de SDKMan instalada

      ![.](/img/ej1p2t2.png)

   - ¿ Dónde se ha instalado SDKMan? ¿ Por qué?

      ![.](/img/ej1ap2t2.png)

   - Muestra las versiones de Java que tienes instaladas a través de SDKMan

      ![.](/img/ej1bp2t2.png)

   - ¿ Qué ventajas tiene instalar SDKMan?

      Descargar SDKMan simplifica la gestión de las herramientas de desarrollo de software, proporcionando un medio eficaz para instalar, gestionar y cambiar entre múltiples versiones de SDK en diferentes entornos de desarrollo.

   - ¿ Instala la versión de Jara 8.0_302-zulu a través de SDKMan ?

      ![.](/img/ej1cp2t2.png)

   - ¿ Instala la versión de Java 11.0.12-zulu a través de SDKMan ?

      ![.](/img/ej1dp2t2.png)

   - ¿ Instala la versión de Java 17.0.0-zulu a través de SDKMan ?

      ![.](/img/ej1ep2t2.png)



6. Configura tu sistema para que utilice la versión de Java 17.0.0 como versión por defecto a nivel de usuario. (Para que las aplicaciones que ejecutes utilicen esta versión de Java)

   - ¿ Qué tienes hacer o comando tienes que utilizar (SDKMAN) para que una aplicación ejecutada desde la interfaz (Windows o Linux) utilize esa versión de Java?

      -sdk use java 17.0.0-zulu



   - ¿ Qué variable de Entorno tienes que modificar para que una aplicación ejecutada desde la interfaz (Windows o Linux) utilize esa versión de Java?

      -JAVA_HOME

7. Si necesitas compilar una aplicación de Java desde la terminal, fuera del IDE, y necesita compilarse con la version de Java 8, ¿ Cómo lo harías?

   - ¿ Qué comando de SDKMAN tienes que utilizar para que a nivel de la terminal actual use la versión de Java 8?

      -sdk use java 8.0.302-zulu


   - ¿ Qué comando utilizas para compilar una aplicación de Java ?

      -El comando javac y el nombre de la App estilo:
      javac MiAplicacion.java

8. Un proyecto en el que estas trabajando, necesita la versión de Java 11, pero requieres compilarlo con esa versión, pero no quieres tener siempre que recordar esto, y quieres que se active automáticamente esa versión una vez accedas al directorio del proyecto.

   - ¿ Cómo puedes realizar esto con SDKMAN ? (indica los comandos que tienes que utilizar y la configuración de la herramienta)

      Debes de realizar un archivo dentro de tu proyecto con el nombre de .sdkmanrc y en el debes de utilizar el comando de: sdk use java 11.0.12-zulu

   - Haz una captura de pantalla entrando y saliendo del directorio del proyecto, para ver cono se activa y desactiva una versión y otra de Java.

      ![.](/img/ej8t2.png)



9. Ahora en Eclipse, configura el JDK 17 descargado con SDKMAN, como JDK por defecto.

   - ¿ Cómo has configurado Eclipse para que utilice el JDK 17 descargado con SDKMAN? (Muestra una captura de pantalla)

      ![.](/img/ej9t2.png)

   - Inicia un nuevo proyecto (TE21-Paso9) en Eclipse y muestra la versión de Java que aparece por defecto para el Workspace. (Muestra una captura de pantalla)

      ![.](/img/ej9at2.png)
      ![.](/img/ej9bt2.png)

   - Cambia la versión de Java del proyecto para que utilize la versión de Java 8. (Muestra una captura de pantalla)

   ![.](/img/ej9ct2.png)

### 3. Utilización de JetBrains IntelliJ IDEA y Eclipse

10. Crea un nuevo proyecto en IntelliJ IDEA (TE21-Paso10) y configura en ese directorio, con SDKMAN para que utilize la versión de Java 11.

- Ahora al abrir IntellJ IDEA, debe activar esa versión automaticamente, pues detectar la configuración. (Incluye una captura de pantalla o GIF de la configuración)

11. Importar el proyecto TE21-Paso9 en IntelliJ IDEA que has creado en Eclipse.

- Revisa la configuración de la versión de Java que utiliza el proyecto ¿Es la misma que utiliza Eclipse?. (Muestra una captura de pantalla)
  Explica según tu opinión y en base a la configuración aplicada al proyecto de Eclipse realizada en el paso 9, si debe ser la misma versión de JDK en ambos proyectos o si esto depende de otras configuraciones extenas al proyecto.

12. Crea un nuevo proyecto en IntelliJ IDEA (TE21-Paso12) que se guarde en la carpeta TE21-Paso12.

- Configura el proyecto para que utilice la versión de Java 17 descargada con SDKMAN. (Muestra una captura de pantalla de la configuración del fichero .sdkmanrc)
- Agrega otro módulo al proyecto, que se guarde en la carpeta Modulo2.
- Agrega otro módulo al proyecto, que se guarde en la carpeta Modulo3.

(Muestra una captura de pantalla de la estructura del proyecto en IntelliJ IDEA)

- Vincula el proyecto principal, con los módulos 2 y 3. (Muestra una captura de pantalla de la configuración de los módulos)

13. En el módulo 2, crea una clase que se llame `Utilidades` y que tenga un método que se llame `calculadora` y que tenga los métodos de suma, resta, multiplicación y división.

(Muestra el código de la clase `Utilidades` con un bloque de código)

14. En el módulo 3, crea una clase llamada `Conversor` que tenga un método que se llame `Texto_to_Uppercase` que convierta un texto a mayúsculas, y otro método que se llame `Texto_to_Lowercase` que convierta un texto a minúsculas.

(Muestra el código de la clase `Conversor` con un bloque de código)

15. En el módulo principal, crea una clase llamada `Principal` que tenga un método `main` que instancie las clases `Utilidades` y `Conversor` y que muestre por consola el resultado de las operaciones de la clase `Utilidades` y el resultado de las operaciones de la clase `Conversor`.

(Muestra un gif donde se muestre la ejecución del programa, en depuración y se visualice que no existen errores de compilación ni ejecución).
