fun main() {

    val photos = Photo(1, 1, 1, 1)

    val comments = Comments(1, false, false, false, true)
    val copyright = Copyright(1, "...", "...", "...")
    val likes = Likes(1, false, true, true)
    val reposts = Reposts(1, false)
    val views = Views(1)
    val donut = Donut(false, 1, 1, false, "all")
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

    addAtt(photos)
    add(post)
    edit(post)
}

var service = WallService()
var Att = emptyArray<Attachment>()

fun addAtt(type: Attachment): Attachment {
    when (type.type) {
        "Photo" -> {
            val photo = type; Att += photo
        }
        "Graffiti" -> {
            val graffiti = type; Att += graffiti
        }
        "App" -> {
            val app = type; Att += app
        }
       "Page" -> {
            val page = type; Att += page
        }
       "Album" -> {
            val album = type; Att += album
        }
    }

    return type
}

fun add(post: Post): Post {
   service.posts += post
    service.postID += post.id
    return post
}


fun edit(post: Post): Boolean {

    if (post in service.posts) {
        post.canEdit = post.canEdit
        post.canPin = post.canPin
        post.commets = post.commets
        post.copyright = post.copyright
        post.createdBy = post.createdBy
        post.donut = post.donut
        post.friendsOnly = post.friendsOnly
        post.fromId = post.fromId
        post.isFavorite = post.isFavorite
        post.isPinned = post.isPinned
        post.likes = post.likes
        post.markedAsAds = post.markedAsAds
        post.ownerId = post.ownerId
        post.postType = post.postType
        post.postponedId = post.postponedId
        post.replyOwnerId = post.replyOwnerId
        post.replyPostId = post.replyPostId
        post.reposts = post.reposts
        post.singerId = post.singerId
        post.text = post.text
        post.views = post.views
        service.posts += post
        return true
    } else {
        return false
    }
}
