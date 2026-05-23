
Docker es una herramienta que permite ejecutar aplicaciones dentro de contenedores ligeros y portables.

---

## 📦 ¿Qué es un contenedor?

Un contenedor es un entorno aislado que incluye todo lo necesario para ejecutar una aplicación:

- Dependencias
- Librerías
- Variables de entorno
- Configuración de red (puertos)

Esto evita conflictos entre aplicaciones en un mismo servidor.

---

## ⚙️ Docker vs Máquinas Virtuales

### 🟢 Docker (Contenedores)
- No virtualiza hardware completo
- Comparte el kernel del sistema operativo del host
- Más ligero y rápido
- Arranque casi inmediato

### 🔴 Máquinas Virtuales
- Virtualizan hardware completo
- Incluyen un sistema operativo completo
- Más pesadas y lentas

---

## 🧠 Importante sobre el kernel

Docker utiliza el kernel del sistema operativo anfitrión:

- Linux usa kernel Linux
- Windows usa kernel Windows

👉 Por eso:
- No se pueden ejecutar contenedores Linux en Windows directamente
- Ni contenedores Windows en Linux directamente

### 🔧 Solución en Windows
Se utiliza **WSL (Windows Subsystem for Linux)** para ejecutar un kernel Linux.

---

## 🧪 Casos de uso de Docker

Docker es ampliamente utilizado en:

- Bases de datos (MySQL, PostgreSQL, MongoDB)
- Microservicios
- APIs backend
- Entornos de desarrollo
- Despliegue de aplicaciones

---

## 📄 Dockerfile

Un **Dockerfile** es un archivo de texto que contiene las instrucciones para construir una imagen Docker.

En él se define:

- Imagen base (Node, PHP, Python, etc.)
- Dependencias a instalar
- Archivos a copiar
- Puertos expuestos
- Comandos de ejecución

---

## 🏗️ Construcción de una imagen

Para crear una imagen desde un Dockerfile:

```bash
docker build -t nombre_imagen .
```

---

## 🚀 Ejecución de un contenedor

Para ejecutar un contenedor y mapear puertos:

```bash
docker run -p 3001:3000 nombre_imagen
```

## 📌 Explicación de puertos:

3001 → puerto del host (tu máquina)  
3000 → puerto del contenedor (aplicación)

---

## 💡 Idea clave

Docker permite empaquetar una aplicación junto con todas sus dependencias para que funcione igual en cualquier entorno:

- Desarrollo
- Testing
- Producción  