import kotlinx.browser.window
import react.*
import react.dom.*
import react.dom.html.ReactHTML.p

external interface VideoListProps : Props {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit // var of type: function
}

val VideoList = FC<VideoListProps> { props ->
    // useState: keep track of state across multiple invocations
    // by: gives useState delegatable property, make read write easier
    // ?: allow null
    for (video in props.videos) {
        p {
            key = video.id.toString()  // minor optimisation, selective refresh
            onClick = {
                props.onSelectVideo(video)
            }
            if (video == props.selectedVideo) {
                +"▶ "
            }
            +"${video.speaker}: ${video.title}"
        }
    }
}