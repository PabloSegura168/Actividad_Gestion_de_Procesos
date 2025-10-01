# Actividad_Gestion_de_Procesos

Este repositorio contiene tres proyectos independientes relacionados con la gestión de procesos:

1. **Leer un archivo de texto:** Un programa que lee y muestra el contenido de un archivo de texto.
2. **Contar líneas con al menos 20 palabras:** Un programa que cuenta cuántas líneas del archivo tienen al menos 20 palabras.
3. **Contador de número de línea:** Un programa que imprime el número de línea junto al contenido leído, funcionando como complemento para el proyecto 1.

Cada uno de estos proyectos está diseñado para abordar tareas específicas relacionadas con el manejo y procesamiento de archivos de texto. El proyecto 3 puede utilizarse como complemento junto con el proyecto 1 para mejorar la visualización del contenido del archivo.

## Clonar el proyecto

Para obtener una copia local de este repositorio, sigue estos pasos:

1. Abre una terminal en tu computadora.
2. Ubica la carpeta donde deseas clonar el repositorio.
3. Ejecuta el siguiente comando:

```bash
git clone https://github.com/PabloSegura168/Actividad_Gestion_de_Procesos.git
```

Esto creará una carpeta llamada `Actividad_Gestion_de_Procesos` con todos los archivos del proyecto.

## Requisitos previos

- Tener instalado [Git](https://git-scm.com/).
- Tener instalado [Java](https://www.java.com/) para ejecutar archivos `.jar`.

## Ejecución de los archivos JAR y uso de tuberías

Cada proyecto se compila en un archivo `.jar` ejecutable. Para ejecutarlos, utiliza el siguiente comando en la terminal, reemplazando `archivo.jar` por el nombre correspondiente:

```bash
java -jar archivo.jar
```
```bash
java -jar leerArchivo.jar archivo.txt | java -jar contadorLineas.jar
```

En este ejemplo:

- `leerArchivo.jar` lee y muestra el contenido de `archivo.txt`.
- Su salida se pasa a través de la tubería (`|`) como entrada a `contadorLineas.jar`, que agrega el número de línea a cada línea mostrada.

Puedes combinar los programas según sea necesario, siempre que la salida de uno sea compatible con la entrada del siguiente.

---
