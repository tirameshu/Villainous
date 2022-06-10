import kotlinx.browser.document
import react.*
import react.dom.render

fun main() {
    document.bgColor = "green"
    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    render(App.create(), container)
}