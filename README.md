### Proyecto ANTLR - Analizador Clima
# Alumno: Alfredo Pirrelo
# Legajo: 52081
## Para Clonar el repositorio
```bash
git clone https://github.com/Alpirrello/52081.git
```
## IMPORTANTE
- Para ejecutar el proyecto, **debe correrse desde el archivo `Clima.g4`** (usando F5, etc. para los errores léxicos/sintácticos) **O desde la terminal con `node .\index.js` (recomendado, ya que esta también ""ejecutara" el código del mismo)**
- Se cambio el tiempo que se imprime en la consola de:
 minutos -> segundos
 ya que esto sino supondria de un tiempo de espera extremadamente largo para su ejecución...
 - Para terminar la ejecución en la terminal presione Ctrl+C

## Aclaraciones
- **No usar acentos** en las palabras.
- Al colocar **temperatura**, se debe agregar al final del número el símbolo: `°`  
  Ejemplo: `20°`
- Al colocar **humedad**, se debe agregar al final del número el símbolo: `%`  
  Ejemplo: `85%`

# Ejemplos validos de temperatura/humedad

```text
cuando temperatura sube de 20° hacer activar riego;
cuando humedad sube de 85% hacer activar riego;
```
# Tambien hay mas ejemplos en los archivos:
**`input_correcto_2.txt` y `input_correcto_2.txt`**