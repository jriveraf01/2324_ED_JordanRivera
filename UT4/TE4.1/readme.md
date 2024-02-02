### 1. Crear repositorio local y subir a GITHUB

1. Crea una carpeta llamada `UT4.1.a`.
2. Inicializa un repositorio local en la carpeta `UT4.1.a`. ¿Qué comando/s utilizas?

   ```
   git init
   ```

3. Revisa qué rama se ha creado por defecto. ¿Qué comando/s utilizas?

```
  git branch
```

4. Renombrar la rama por defecto a `main` en caso de que tenga otro nombre. ¿Qué comando/s utilizas?

```
git branch -m main

```

5. Agrega un fichero `README.md`.

   ```markdown
   # UT4.1.a

   Repositorio de prueba para la tarea 4.1.a
   ```

6. Agrega el fichero `README.md` al stage area. ¿Qué comando/s utilizas?

```
git add readme.md

```

7. Realiza un commit con el mensaje "Add README". ¿Qué comando/s utilizas?

```
git commit -m "Add readme"

```

8. Agrega otro fichero `01.xml` con siguiente texto.

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <libreria>
       <libro>
           <titulo>El Quijote</titulo>
           <autor>Miguel de Cervantes</autor>
           <editorial>Editorial Castalia</editorial>
           <fecha>1605</fecha>
           <genero>Novela</genero>
           <precio>20</precio>
       </libro>
   </libreria>
   ```

9. Agrega el fichero `01.xml` al stage area y realiza el commit "Add file 01.xml" ¿Qué comando/s utilizas?

```
git add 01.xml
git commit -m "Add file 01.xml"

```

10. Agrega una nueva rama llamada y posicionate directamente en ella con el mismo comando `fea/wac01`. ¿Qué comando/s utilizas? (busca en internet si no lo recuerdas)

```
git checkout -b fea/wac01

```

11. En qué rama estas ahora mismo? ¿Qué comando/s utilizas?

```
git branch

```

12. Estando en la rama `fea/wac01` agrega un fichero `02.xml, y agrega al área de stage y realiza commit "Add file 02".

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <libreria>
        <libro>
            <titulo>El Hobbit</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1937</fecha>
            <genero>Fantasía</genero>
            <precio>15</precio>
        </libro>
    </libreria>
    ```

```
git add 02.xml
git commit -m "Add file 02.xml"

```

13. Muestra el log utilizando solo una línea por commit con opciones gráficas. ¿Qué comando/s utilizas?

```
git log --oneline --graph

```

14. Posicionate de nuevo en la rama `main`, y crea otra rama `fea/wac02`, posicionandote direcamente en ella. Agrega un fichero `03.xml`, agrega al área de stage y realiza commit "Add file 03".

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <libreria>
        <libro>
            <titulo>El Señor de los Anillos</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1954</fecha>
            <genero>Fantasía</genero>
            <precio>25</precio>
        </libro>
    </libreria>
    ```

```
git checkout main
git checkout -b fea/wac02

```

15. Posicionate en la rama `main` y muestra los ficheros que hay en el directorio. ¿Qué comando/s utilizas?

```
git checkout main
ls

```

16. Realizar un merge de la rama `fea/wac01` en la rama `main`. (Indica los comandos utilizados y explica cada uno de ellos).

```
-git checkout main:

Este comando cambia de la rama actual a la rama especificada (main en este caso).

-git merge fea/wac01:

Este comando fusiona los cambios de la rama fea/wac01 en la rama actual.

-git add .
 git merge --continue:

Estos comandos añaden los archivos resueltos al área de stage y continúan con el proceso de fusión.

-git commit -m "Merge fea/wac01 into main":

Este comando realiza el commit final para confirmar el merge.
```

17. Muestra el estado del repositorio, el log, y los ficheros que hay en el directorio. (Imagen/gif visualizando los comandos).

```
-git status
-git log --oneline --graph
-ls
```

18. Elimina la rama `fea/wac01` sin posibilidad de recuperación. ¿Qué comando/s utilizas?

```
git branch -D fea/wac01

```

19. Realiza un merge de la rama `fea/wac02` en la rama `main`.

```
-git checkout main
-git merge fea/wac02

```

20. Muestra el estado del repositorio, el log, y los ficheros que hay en el directorio. (Imagen)

```
# Mostrar estado del repositorio
-git status

# Mostrar historial de commits con opciones gráficas
-git log --oneline --graph

# Listar los archivos y directorios en el directorio actual
-ls

```

21. Vuelve a la rama `fea/wac02` y modifica el fichero `03.xml` añadiendo un nuevo libro.

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <libreria>
        <libro>
            <titulo>El Señor de los Anillos</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1954</fecha>
            <genero>Fantasía</genero>
            <precio>25</precio>
        </libro>
        <libro>
            <titulo>El Silmarillion</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1977</fecha>
            <genero>Fantasía</genero>
            <precio>25</precio>
        </libro>
    </libreria>
    ```

    Agrega al área de stage y realiza commit "Update 03 file. Add book El Silmarillion".

22. Posicionate en la rama `main`, muestra el estado y muestra el contenido del fichero `cat 03.xml`. (Imagen visualizando comandos)

23. Realiza un merge de la rama `fea/wac02` en la rama `main`.
24. Muestra el estado del repositorio, y muestra el contenido del fichero `03.xml`. (Imagen visualizando comandos)
25. Ahora, en la rama `main` modifica el fichero `03.xml` incluyendo un nuevo libro.

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <libreria>
        <libro>
            <titulo>El Señor de los Anillos</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1954</fecha>
            <genero>Fantasía</genero>
            <precio>25</precio>
        </libro>
        <libro>
            <titulo>El Silmarillion</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1977</fecha>
            <genero>Fantasía</genero>
            <precio>25</precio>
        </libro>
        <libro>
            <titulo>El Hobbit</titulo>
            <autor>J.R.R. Tolkien</autor>
            <editorial>Minotauro</editorial>
            <fecha>1937</fecha>
            <genero>Fantasía</genero>
            <precio>15</precio>
        </libro>
    </libreria>
    ```

    Agrega al área de stage y realiza commit "Update 03 file. Add book El Hobbit".

26. Agrega un nuevo fichero `04.xml` sobre libros ciencia-ficcion, en la rama `main`.

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <libreria>
        <libro>
            <titulo>El fin de la eternidad</titulo>
            <autor>Isaac Asimov</autor>
            <editorial>Edhasa</editorial>
            <fecha>1955</fecha>
            <genero>Ciencia ficción</genero>
            <precio>20</precio>
        </libro>
    </liberia>
    ```

    Agrega al área de stage y realiza commit "Add 04 file. Add cienca-ficcion books".

27. Muestra el estado, log una línea y los ficheros que hay en el directorio. (Imagen visualizando comandos)
28. Vuelve un commit atrás, y muestra el estado, log una línea y los ficheros que hay en el directorio. (Imagen visualizando comandos)
29. Vuelve al commit anterior, y muestra el estado, log una línea y los ficheros que hay en el directorio. (Imagen visualizando comandos)
30. Posicionate de nuevo en el último commit, y muestra el estado, log una línea y los ficheros que hay en el directorio. (Imagen visualizando comandos)

### 2. Crear repositorio remoto y subir a GITHUB

1. Crea un repositorio remoto en GITHUB llamado `EEDD_{NombreApellido}_TE4.1` público, vacio, sin nada.
2. Agrega el repositorio remoto a tu repositorio local. ¿Qué comando/s utilizas?
3. Muestra los repositorios remotos que tienes configurados. ¿Qué comando/s utilizas?
4. Sube la rama `main` al repositorio remoto. ¿Qué comando/s utilizas?
5. Muestra el log de la rama `main` con opciones gráficas. ¿Qué comando/s utilizas?
6. Posicionate en la rama `fea/wac02` y sube la rama `fea/wac02` al repositorio remoto. ¿Qué comando/s utilizas?

7. Ahora desde GITHUB en la rama `fea\wac02`, modifica el fichero `03.xml` añadiendo un nuevo libro.

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <libreria>
       <libro>
           <titulo>El Señor de los Anillos</titulo>
           <autor>J.R.R. Tolkien</autor>
           <editorial>Minotauro</editorial>
           <fecha>1954</fecha>
           <genero>Fantasía</genero>
           <precio>25</precio>
       </libro>
       <libro>
           <titulo>El Silmarillion</titulo>
           <autor>J.R.R. Tolkien</autor>
           <editorial>Minotauro</editorial>
           <fecha>1977</fecha>
           <genero>Fantasía</genero>
           <precio>25</precio>
       </libro>
       <libro>
           <titulo>El Hobbit</titulo>
           <autor>J.R.R. Tolkien</autor>
           <editorial>Minotauro</editorial>
           <fecha>1937</fecha>
           <genero>Fantasía</genero>
           <precio>15</precio>
       </libro>
       <libro>
           <titulo>El hombre bicentenario</titulo>
           <autor>Isaac Asimov</autor>
           <editorial>Edhasa</editorial>
           <fecha>1976</fecha>
           <genero>Ciencia ficción</genero>
           <precio>20</precio>
   </libreria>
   ```

   Realiza un commit con el mensaje "Update 03 file. Add book El hombre bicentenario".
   (Muestra pantallazo de GITHUB con el commit realizado)

8. Ahora obten los cambios sin acualizar el repositorio local (`git fetch origin`).
9. Muestra un log del repositorio local con opciones gráficas. (Incluye imagen)
10. Ahora actualiza el repositorio local con los cambios del repositorio remoto (`git pull origin fea/wac02`).
11. Muestra un log del repositorio local con opciones gráficas. (Incluye imagen)
12. Haz un merge de la rama `fea/wac02` en la rama `main`. Muestra estado, log, y el contenido fichero `03.xml` (Incluye imagen)
13. Sube la rama `main` al repositorio remoto. ¿Qué comando/s utilizas?
14. Elimina la rama local `fea/wac02` sin posibilidad de recuperación. ¿Qué comando/s utilizas?
15. Elimina la rama remota `fea/wac02` sin posibilidad de recuperación (git push origin --delete fea/wac02).
16. Muestra desde GITHUB las ramas que tienes el en repositorio remoto. (Incluye imagen)
17. Para finalizar, muestra el log del repositorio local con opciones gráficas. (Incluye imagen)

### 3. Enlace repositorio remoto

1. Incluye el enlace al repositorio remoto en este punto para que el profesor pueda acceder a él.
