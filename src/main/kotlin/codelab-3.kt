fun main() {

    /*val favoriteActor = null
    println(favoriteActor)
     */

//variables anulables y no anulables

    /*var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
     */

//valor Int
    /*var number: Int? = 10
    println(number)
    number = null
    println(number)
     */

//variables anulables
    /*var favoriteActor: String = "Sandra Oh"
    println(favoriteActor.length)
     */

    /*var favoriteActor: String? = null
    println(favoriteActor?.length)
     */

   /* var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor!!.length)
    */

    /*var favoriteActor: String? = "Sandra Oh"
    val lengthOfName = if(favoriteActor != null) {
        favoriteActor.length
    }else {
        0
    }
    println("El número de caracteres en el nombre de tu actor favorito es $lengthOfName.")

     */
// operador Elvis

    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("El número de caracteres en el nombre de tu actor favorito es $lengthOfName.")


}
