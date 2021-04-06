Primo rápido

fun main (args: Array <String>) {

    val n = readLine () !!. toInt ()

    for (numeros in 1..n) {
      var ehPrimo = true
      
        val a = readLine () !!. toDouble()
        var raiz = Math.sqrt(a)
        
        for (b in 2..(raiz).toInt()){
          if ((a % b.toDouble()) == 0.0){
            ehPrimo = false
            break
          }
        }
        
        if (ehPrimo) println("Prime")
        else println("Not Prime")
        }
        }