import kotlinx.browser.window
import react.*
import react.dom.*
import react.dom.html.ReactHTML.p

external interface VideoListProps : Props {
    var videos: List<Video>
}

val VideoList = FC<VideoListProps> { props ->
    // useState: keep track of state across multiple invocations
    // by: gives useState delegatable property, make read write easier
    // ?: allow null
    var selectedVideo: Video? by useState(null)
    for (video in props.videos) {
        p {
            key = video.id.toString()  // minor optimisation, selective refresh
            onClick = {
                selectedVideo = video
            }
            if (video == selectedVideo) {
                +"▶ "
            }
            +"${video.speaker}: ${video.title}"
        }
    }
}