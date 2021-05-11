class WallService {
    var posts = emptyArray<Post>()
    var postID = emptyArray<Int>()
    var comments = emptyArray<CommentsPost>()
    var Att = emptyArray<Attachment>()

    fun createComment(comment: CommentsPost): Boolean {
        if (comment.id in postID) {
            comments += comment
            return true
        } else {
            throw PostNotFoundException("Post Not Found")
        }
    }

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
        val idPost = if (posts.isNotEmpty()) posts.last().id + 1 else 1
        posts += post
        post.id = idPost
        postID += post.id
        return posts.last()
    }

    fun edit(post: Post): Boolean {

        if (post in posts) {
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
}
