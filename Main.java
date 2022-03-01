package trivia;

import trivia.Pregunta;
import trivia.Respuesta;
import trivia.Cuestionario;

import java.util.List;

    public class Main {
        private static Object resultado;
        public static void main(String[] args) {
        System.out.println("Comienza el Juego ");
        Cuestionario c = new Cuestionario();
        c.agregarPregunta(new Pregunta("¿Cuanto mide el valor logico de tipo boolean?", List.of(new Respuesta("1 bit", true
                )
                ,
                new Respuesta("1 byte", false)
        )));
        c.agregarPregunta(new Pregunta("¿Que tipo de fichero cierra el flujo de lectura", List.of(
                new Respuesta("void close", true
                )
                ,
                new Respuesta("static close", false)
        )));
        c.agregarPregunta(new Pregunta("¿Cual de los siguientes package no existe en el lenguaje de java",
                List.of(
                new Respuesta("java io", true
                )
                ,
                new Respuesta("java pet", false)
        )));
        c.agregarPregunta(new Pregunta("Sino se especifica una superclase se asume que se hereda de la clase",
                List.of(
                new Respuesta("object", true
                )
                ,
                new Respuesta("abstract", false)
        )));
        c.agregarPregunta(new Pregunta("Cuantos tipos de datos simples existen en el lenguaje de programaciòn java",
                List.of(
                new Respuesta("9 tipos", true
                )
                ,
                new Respuesta("15 tipos", false)
        )));
        c.agregarPregunta(new Pregunta("Se define como la clase que termina la cadena de una herencia", List.of(
                new Respuesta("Final", true
                )
                ,
                new Respuesta("Abstract", false)
        )));
        c.agregarPregunta(new Pregunta("¿Que es una clase ABSTRACTA?", List.of(
                new Respuesta("UNA CLASE QUE NO PUEDE SER INSTANCIADA", true
                )
                ,
                new Respuesta("UNS CLASE QUE PUEDE SER INSTANCIADA", false)
        )));
        c.agregarPregunta(new Pregunta("Java es un lenguaje que distingue letras mayusculas y minusculas",
                List.of(
                new Respuesta("Si", true
                )
                ,
                new Respuesta("No", false)
        )));
        c.agregarPregunta(new Pregunta("¿Cuando se invoca el metodo Main?", List.of(
                new Respuesta("Cuando se ejecuta un programa Java", true
                )
                ,
                new Respuesta("Cuando se ejecuta un programa python", false)
        )));
        c.agregarPregunta(new Pregunta("¿El polimorfismo se puede aplicar para el metodo overloading?", List.of(
                new Respuesta("No", true
                )
                ,
                new Respuesta("Si", false)
        )));

        c.preguntar();
        c.imprimirResultados();




        }

    }



















