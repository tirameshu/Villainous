import kotlinx.browser.document
import react.*
import react.css.css
import react.dom.render
import csstype.Position
import csstype.px
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import kotlinx.serialization.Serializable

fun main() {
    document.bgColor = "green"
    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    render(App.create(), container)
}