# Banistmo
El objetivo general es implementar la automatizacion hacia la pagina web https://www.bancolombia.com/personas, específicamente al flujo que tiene la aplicacion para poder comprobar el reglamento de inversion virutal. A manera de obtener un sistema que pueda ser ejecutado para realizar la validacion del PDF.

#HERRAMIENTAS UTILIZADAS Se emplea el IDE de IntelliJ. Se usa el driver de google en su ultima version 123.0.6312.59 para ejecucion de la automatizacion. SerenityBDD, Screenplay, lenguaje Gherkin, Cucumber.

#ESTRATEGIA DE AUTOMATIZACIÓN. El proyecto hace uso del patrón Screenplay, con Cucumber y Gradle. Screenplay se orienta en el usuario y específicamente en las tareas, además utiliza los principios S.O.L.I.D. Con este patrón de pruebas se pueden escribir en un lenguaje más natural y entendible. El proyecto se estructura de la siguiente manera: Task: Son las tareas que realiza el actor a nivel de negocio. User-Interface: Donde se realiza el mapeo de los target con los que el usuario interactúa. Question: Donde se realizan los Assert y las verificaciones del proceso. Model: Clases donde se encuentran los objetos complejos de negocio. Feature: Donde se narran los casos de prueba utilizando el lenguaje Gherkin.

#DESCRIPCIÓN GENERAL AUTOMATIZACION

La automatizacion fue el flujo para llegar hasta el reglamento de inversion virtual, por lo cual lo primero fue extraer los xpahts de la pagina de Bancolombia, luego en la tarea de Tasks se realizo el flujo para llegar hasta el documento anteriormente mencionado y por ultimo se realizo la validacion del URL.
#Escenario
Feature:  The user enters and performs the virtual investment
  Scenario: The user search for the legal document
    Given the user enter the page
    When the user is going to download the document
    Then the user should see the document

#Validacion
En la validaciones que se planteo a realizar fueron hechas a partir de la url del documento, debido a que, la validacion de todo el documento requeria tiempo para poder llegar a una solucion. 

#TENER EN CUENTA ANTES DE EJECUTAR LA AUTOMATIZACIÓN

Tener el driver de la ultima version de google chrome dentro del proyecto.

#Comandos de Git

git init

git remote add origin 

git checkout -b feature/retobanitsmo

git pull origin feature/retobanitsmo

git status (muestra diferencias entre archvos locales y remoto)

git add . (prepara los archivos)

git status (muestra los archivos preparados)

git commit -m "comentario"

git status (muestra el estado del versionamiento)

git push origin feature/retobanitsmo (Se sube todo al repositorio 


