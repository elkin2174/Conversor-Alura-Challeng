
<h1 align="center">  Conversor de moneda/temperatura </h1>

<p align="center">
  <img src="https://img.shields.io/badge/Status-Finalizado-green"><img src="https://img.shields.io/badge/Code-JAVA-yellowgreen">
  </p> 
Este es un proyecto hecho JAVA, utilizando la libreria JOptionpanel.

Este tiene la finalidad de ser una aplicacion para la conversion de divisas y de temperatura
esta aplicacion tiene la capacidad de realizar la conversion entre las divisas de:

<div aling="center">   
    <table>
        <tr>
            <td rowspan="6">Pesos colombianos</td>
            <td rowspan="6"><====></td>
            <td>Dolar</td>
        </tr>
        <tr>
            <td>Euro</td>
        </tr>
        <tr>
            <td>Libra Esterlina</td>
        </tr>
        <tr>
            <td>Yen</td>
        </tr>
        <tr>
            <td>Won</td>
        </tr>
    </table>
  <div>
    
 y una conversion entre las temperaturas de Centigrados, Farengeit y Kelvin.

## :hammer:Funcionalidades del proyecto
    
Este proyecto cuenta con dos fuciones principales la primera de para convertir moneda y la segunda para convertir temperatura.
- `Funcionalidad 1`: realizar la conversion de pesos colombianos a distitas monedas y viceversa.
    - para esto se implemeto la clase ConverMoneda.java. en la cual se encuentran dos metodos:
        - `ElegirCoversion`: Este metodo solicita al usuario mediante una ventana emergente generada con la libreria JOptionpane 
                             que escoja la opcion que de desea convertir y retorna la opcion escogida para ser utilizada posteriormente.
        - `convertir`: la cual contiene toda la logica para realizar la conversion, pedir la cantidad de moneda y realizar la convercion.
- `Funcionalidad 2`: Realizar la conversión de temperatura.
    - para esto cuaenta con algunos metodos:
      - `ElegirCoversion`: al igual que la clase para convertir moneda, este solicita al usuria la conversion a realizar.
      - `convertiXAY`: En este caso se implemetaron varios metodos, uno para cada conversion. estos utilizan la logica para convertir un
                       temperatura insertada y devolver su equivalente en la otra temperatura deseada.

    

    


      
