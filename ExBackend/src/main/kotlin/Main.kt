
import java.net.URL

fun main(args: Array<String>) {

    val url = URL("https://api.themoviedb.org/3/movie/550?api_key=8f0a4d2f9ab65d0866a04598cd906fdd")
    val rep = url.readText()
    println(rep)
}