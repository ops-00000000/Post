fun main() {
    val donut = Donut(false, 1, 1, false, "all")
    val photos = Photo(1, 1, 1, 1)
    val commentPost= CommentsPost(1,2,1,"///",donut,1,1)
    val comments = Comments(1, false, false, false, true)
    val copyright = Copyright(1, "...", "...", "...")
    val likes = Likes(1, false, true, true)
    val reposts = Reposts(1, false)
    val views = Views(1)
    val geo: Geo = Geo("...", "...", "...")
    val post = Post(
        1,
        1,
        1,
        1,
        1,
        "1",
        1,
        1,
        false,
        comments,
        copyright,
        likes,
        reposts,
        views,
        "post",
        null,
        geo,
        null,
        1,
        true,
        true,
        true,
        true,
        true,
        donut,
        1
    )

    service.addAtt(photos)
    service.add(post)
    println(service.createComment(commentPost))
    service.edit(post)
}

var service = WallService()



