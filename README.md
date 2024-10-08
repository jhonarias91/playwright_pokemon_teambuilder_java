# Pokémon Showdown Team Builder Automatización con Playwright y Java

Este proyecto automatiza la creación de equipos en la plataforma **Pokémon Showdown**. El código utiliza **Playwright** para manejar la automatización de navegador y **JUnit 5** para la estructura de pruebas. La configuración del equipo, movimientos y estadísticas se gestiona de manera data-driven mediante un archivo JSON que define los datos de los Pokémon y sus configuraciones.

## Estructura del Proyecto

El proyecto sigue un patrón basado en **Page Object Model (POM)** para gestionar la interacción con las diferentes páginas de la aplicación web.

- `BasePage`: Página padre con un único atributo Page de la cual heredarán las demás Pages.
- `MainPage`: Página principal de Pokémon Showdown.
- `TeamBuilderPage`: Página donde se crean equipos de Pokémon.
- `MovePage`: Página para asignar movimientos y habilidades a los Pokémon.
- `StatPage`: Página para asignar EVs y estadísticas.
- `PokemonSearchPage`: Página para buscar Pokémon por nombre.
- `BaseTest`: Clase base que inicializa el entorno de Playwright y define la configuración común de pruebas.

### Tecnologías Utilizadas:
- **Java 17**
- **Playwright**
- **JUnit 5**
- **Maven**
- **JSON** para datos dinámicos

## Instalación

### Requisitos:
- **Java 17** o superior.
- **Maven**.
- **Playwright**.

### Paso 1: Clona el Repositorio

```bash
git clone https://github.com/jhonarias91/playwright_pokemon_teambuilder_java.git
```
## Paso 2: Instala Dependencias de Maven
Una vez clonado el repositorio, navega hasta la carpeta raíz del proyecto y ejecuta:
```bash
mvn clean install
```
Esto descargará todas las dependencias necesarias, incluyendo JUnit 5 y Playwright.

Paso 3: Ejecución de las Pruebas
Puedes ejecutar las pruebas utilizando el siguiente comando de Maven:
```bash
mvn test 
```
Esto lanzará el navegador (si está configurado para modo headless=false) y ejecutará el flujo automatizado de creación del equipo en Pokémon Showdown.

Puede ajustar el modo headless en la clase BaseTest.java cambiando IS_HEADLESS a true o false.

## Uso de Page Object Model (POM)
El proyecto utiliza el patrón Page Object Model (POM) para separar la lógica de interacción con las páginas web y las pruebas. Esto facilita el mantenimiento y mejora la legibilidad.

MainPage: Esta clase contiene los métodos para navegar a la página principal de Pokémon Showdown y al equipo constructor.
TeamBuilderPage: Aquí se manejan las acciones relacionadas con la creación de equipos y la selección de formatos y generaciones.
MovePage: Encargada de asignar los movimientos, habilidades y objetos a los Pokémon.
StatPage: Asigna los EVs y valida que los valores sumen correctamente.
PokemonSearchPage: Se encarga de buscar los Pokémon por nombre.

# Flujo de Prueba:

1. Navega a la página de Pokémon Showdown.
2. Crea un nuevo equipo.
3. Selecciona la generación y el formato (por ejemplo, [Gen 7] Ubers).
4. Agrega Pokémon al equipo, junto con sus movimientos, habilidades y estadísticas.
5. Valida que el equipo cumple con las reglas del formato.
6. Data-Driven con JSON
7. El archivo pokemon_data_driven.json se utiliza para definir los equipos de Pokémon, con los nombres, objetos, habilidades, movimientos y estadísticas (EVs).
8. Este archivo se carga al inicio de la prueba (@BeforeAll), lo que permite ejecutar las pruebas para diferentes configuraciones de equipos sin necesidad de modificar el código de prueba.

# Notas Finales
Autor: Jhon Arias

```javascript
Este `README.md` cubre los aspectos principales de tu proyecto: cómo configurarlo, cómo funciona el data-driven testing con JSON, 
y el uso de Page Object Model para gestionar las interacciones con las páginas web. 
```

Una implementación de esta prueba usando typeScript la puede encontrar en:
[Playwright TypeScript](https://github.com/jhonarias91/playwright_pokemon_teambuilder_workshop)
