# Interacción con Imágenes - Android App

Este proyecto es una aplicación de Android creada en **Kotlin** que permite la selección y visualización de imágenes utilizando **Spinners**. Implementa la navegación entre actividades y la persistencia de la selección de imágenes incluso al rotar el dispositivo.

## Descripción del proyecto

La aplicación tiene dos pantallas principales:

1. **MainActivity**: Contiene un `Spinner` que permite al usuario seleccionar diferentes nombres de imágenes y un botón para navegar a la siguiente pantalla.
2. **ImageActivity**: Muestra la imagen seleccionada por el usuario en la primera pantalla y permite regresar a la `MainActivity` manteniendo la selección del `Spinner` aún si se rota el dispositivo.

### Características principales

- **Selección de imágenes**: Los usuarios pueden elegir un nombre de imagen a través de un `Spinner`.
- **Navegación entre actividades**: Después de seleccionar una imagen, se puede visualizar la imagen en una nueva actividad.
- **Persistencia de estado**: Al girar el dispositivo, la selección del `Spinner` no se pierde.
## Requisitos previos

- **Android Studio** instalado en tu computadora.
- **Conocimientos básicos de Kotlin y Android Development**.
- **SDK de Android** configurado (compileSdkVersion 33).

## Instalación y configuración

Sigue estos pasos para descargar y ejecutar el proyecto en tu entorno local:

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tuusuario/interaccionconimagenes.git
    ```

2. Abre el proyecto en Android Studio:

    - Ve a `File > Open` y selecciona la carpeta del proyecto que acabas de clonar.
    
3. Asegúrate de tener las dependencias correctas en el archivo **build.gradle**:

    ```gradle
    dependencies {
        implementation 'androidx.appcompat:appcompat:1.6.1'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
        implementation 'androidx.core:core-ktx:1.9.0'
        implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.7.0'
    }
    ```

4. Sincroniza tu proyecto con Gradle. Ve al menú superior y selecciona **File > Sync Project with Gradle Files**.

5. Ejecuta el proyecto conectando tu dispositivo físico o utilizando un emulador.

## Uso

1. Selecciona una imagen del `Spinner` en la pantalla principal.
2. Haz clic en el botón **Siguiente** para navegar a la siguiente actividad y ver la imagen seleccionada.
3. En la segunda pantalla, puedes regresar a la pantalla anterior usando el botón **Volver**.

## Archivos clave

- **MainActivity.kt**: Contiene la lógica para la selección de imágenes con el `Spinner` y la navegación a la segunda actividad.
- **ImageActivity.kt**: Muestra la imagen seleccionada y permite regresar a la actividad principal.
- **activity_main.xml**: Diseño de la interfaz principal con el `Spinner` y el botón.
- **activity_image.xml**: Diseño de la interfaz de la segunda actividad, que contiene un `ImageView` para mostrar la imagen seleccionada.
- **AndroidManifest.xml**: Configuración de las actividades y permisos necesarios para la app.

## Problemas conocidos

- **Rotación de dispositivo**: Si el dispositivo se rota varias veces rápidamente, puede ocurrir que la actividad principal pierda el estado temporalmente.
  
## Contribuciones

Si quieres contribuir a este proyecto:

1. Haz un **fork** de este repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-feature`).
3. Realiza los cambios necesarios y haz **commit** (`git commit -am 'Añadir nueva feature'`).
4. Envía los cambios a la rama principal (`git push origin feature/nueva-feature`).
5. Abre un **Pull Request**.

## Licencia

Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo [LICENSE](LICENSE).

