# Tarea
1.	¿Qué es un repositorio en Git y cómo se diferencia de un proyecto normal?
Un repositorio en Git es una carpeta del proyecto que además guarda el historial completo de todo lo que ha pasado en él, no solo contiene archivos sino también versiones, cambios, autores y fechas, a diferencia de un proyecto normal donde si algo se daña no hay forma sencilla de volver atrás.
2.	¿Cuáles son las tres áreas principales de Git?
Git trabaja con tres espacios que se complementan, el Working Directory que es donde uno edita normalmente los archivos, el Staging Area que funciona como una zona de preparación donde se decide qué cambios sí van a guardarse, y el Repository que ya es el historial definitivo donde quedan registrados los commits.
3.	¿Cómo representa Git los cambios internamente?
Git guarda la información mediante objetos llamados blob para el contenido de archivos, tree para representar carpetas, commit para registrar cambios y tag para marcar versiones importantes, en lugar de guardar diferencias pequeñas lo que hace es almacenar una especie de fotografía completa del proyecto en cada versión.
4.	¿Cómo se crea un commit y qué información almacena?
Un commit se crea después de preparar los cambios en staging, ese commit guarda quién hizo el cambio, cuándo lo hizo, un mensaje que explica qué se modificó y una referencia al estado anterior del proyecto, funcionando como un punto de control.
5.	Diferencia entre git pull y git fetch
git fetch trae los cambios del repositorio remoto pero no los mezcla todavía, sirve para revisar primero, mientras que git pull sí descarga y fusiona automáticamente esos cambios con la rama local.
6.	¿Qué es un branch?
Un branch o rama es simplemente una línea alternativa de desarrollo, permite trabajar en nuevas ideas sin afectar la versión principal, Git no duplica archivos sino que usa punteros que señalan a distintos commits, por eso crear ramas es rápido y liviano.
7.	¿Cómo se realiza un merge y qué conflictos pueden surgir?
El merge une los cambios de dos ramas en una sola, los conflictos aparecen cuando ambas modifican la misma parte de un archivo, entonces Git no decide por sí solo sino que el programador revisa, corrige y define cuál versión queda.
8.	¿Cómo funciona el área de staging?
El comando git add envía cambios al staging, allí se selecciona exactamente qué se va a confirmar, si se omite este paso Git no incluye los archivos en el commit porque entiende que aún están en trabajo.
9.	¿Qué es el archivo .gitignore?
Es un archivo donde se indica qué cosas Git no debe seguir, como archivos temporales, configuraciones personales o dependencias que se pueden volver a generar, ayuda a mantener limpio el repositorio.
10.	Diferencia entre commit amend y un nuevo commit
El amend modifica el último commit como si se corrigiera algo recién hecho, mientras que un nuevo commit agrega otro registro más al historial sin tocar el anterior.
11.	¿Cómo se utiliza git stash?
git stash guarda cambios de forma temporal sin hacer commit, sirve cuando se necesita cambiar de tarea rápido o moverse a otra rama sin perder lo que se estaba haciendo.
12.	¿Qué mecanismos ofrece Git para deshacer cambios?
git reset permite retroceder el historial, git revert crea un commit que anula otro sin borrar el registro, git checkout deja volver a versiones anteriores de archivos o ramas, cada uno se usa según la situación.
13.	¿Cómo funciona la configuración de remotos?
Los remotos conectan el repositorio local con otros en internet, origin suele ser el principal y upstream se usa cuando se trabaja con forks, permiten enviar y recibir cambios entre distintos repositorios.
14.	¿Cómo inspeccionar el historial de commits?
Con git log se ve el historial, con git diff se comparan cambios entre versiones y con git show se revisa el detalle de un commit específico.
Programación en Java
15.	¿Cuáles son los tipos de datos primitivos en Java?
Son los tipos básicos que almacenan valores directamente como int para enteros, double o float para decimales, char para caracteres, boolean para valores lógicos y otros como byte, short y long que varían en tamaño.
16.	¿Cómo funcionan las estructuras de control de flujo?
Permiten que el programa tome decisiones o repita acciones, if y else evalúan condiciones, switch maneja múltiples casos posibles y los bucles como for, while o do while repiten instrucciones mientras se cumpla una condición.
17.	¿Por qué es importante usar nombres significativos?
Porque el código debe poder entenderse al leerlo, un buen nombre explica la función de la variable o del método sin necesidad de comentarios, facilita el mantenimiento y evita confusiones cuando el proyecto crece.
18.	¿Qué es la Programación Orientada a Objetos?
Es una forma de programar basada en representar el mundo real mediante objetos que combinan datos y comportamientos, permite construir sistemas más organizados, reutilizables y fáciles de escalar.
19.	¿Cuáles son los cuatro pilares de la POO?
Encapsulación que protege la información interna, abstracción que muestra solo lo necesario, herencia que permite reutilizar código entre clases y polimorfismo que permite usar una misma estructura con distintos comportamientos.
20.	¿Qué es la herencia en POO y cómo se utiliza en Java?
La herencia permite que una clase tome características de otra usando extends, así se reutilizan métodos y atributos evitando repetir lógica y facilitando la organización del sistema.
21.	¿Qué son los modificadores de acceso?
Son palabras clave que controlan desde dónde se puede acceder a una clase o método, public permite acceso total, private limita a la misma clase, protected permite acceso por herencia o paquete y el acceso por defecto funciona dentro del mismo paquete.
22.	¿Qué es una variable de entorno y por qué son importantes?
Es un valor configurado en el sistema operativo que los programas usan como referencia, en Java se utilizan para indicar rutas como donde está instalado el JDK, sin ellas muchas herramientas no sabrían cómo ejecutarse correctamente.
