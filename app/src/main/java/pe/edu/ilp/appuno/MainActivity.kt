package pe.edu.ilp.appuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","Método onCreate")
        //Funcion suma
        var sumaValores = suma(25,50,80)
        println("La suma es : $sumaValores")
        //Funcion resta
        var restaResult = resta(50,21)
        println("La resta es: $restaResult")
        //Funcion que retorna el mayor valor
        var mayorResult = mayor(257,69);
        println("El mayor valor es: $mayorResult")
        //Funcion WHEN
        idiomaPais();
    }

    //Funciones
    fun suma(a:Int,b:Int,c:Int):Int{
        return a+b+c;
    }
    fun resta(a:Int,b:Int):Int{
        return a-b;
    }
    //Operadores condicionales
    // > mayor que; < menor que
    // Mayor o igual que (>=)
    // Menor o igual que (=<)
    // Igualdad (==)
    // Desigualdad (!=)
    fun mayor(a:Int,b:Int):Int{
        var mayorValor:Int
        /*
        if (a>b){
            mayorValor = a
        }else{
            mayorValor = b
        }
        */
        return if(a>b) a else b;
    }

    //Condicional WHEN

    fun idiomaPais(){

        var estado = "EEUU"
        when(estado){
            "España" -> {
                println("Su lenguaje es español")
            }
            "EEUU" -> {
            println("Su idioma es el Ingles")
            }
            "Peru"-> {
                println("Su idioma es el Español")
            }
            else->{
                println("Su idioma no se reconoce")
            }
        }

    }

}

