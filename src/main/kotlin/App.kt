import kotlinx.coroutines.async
import react.*
import react.dom.*
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import react.css.css
import csstype.Position
import csstype.px
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img

val unwatchedVideos = listOf(
    Video(1, "Opening Keynote", "Andrey Breslav", "https://youtu.be/PsaFVLr8t4E"),
    Video(2, "Dissecting the stdlib", "Huyen Tue Dao", "https://youtu.be/Fzt_9I733Yg"),
    Video(3, "Kotlin and Spring Boot", "Nicolas Frankel", "https://youtu.be/pSiZVAeReeg")
)

val App = FC<Props> {
    // typesafe HTML goes here, starting with the first h1 tag!
    h1 {
        +"Hello, Hui Ren!"
    }
    div {
        h3 {
            +"Videos to watch"
        }
        VideoList{
            videos = unwatchedVideos
        }
    }
    div {
        css {
            position = Position.absolute
            top = 10.px
            right = 100.px
        }
        h3 {
            +"John Doe: Building and breaking things"
        }
        img {
            src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
        }
    }
}