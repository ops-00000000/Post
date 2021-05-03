class WallService {
    var posts = emptyArray<Post>()
    var postID = emptyArray<Int>()
    var comments = emptyArray<CommentsPost>()

    fun createComment(comment: CommentsPost):Boolean{
        if (comment.id in postID) {
            comments += comment
            return true
        } else {
            throw PostNotFoundException("Post Not Found")
        }
    }
}
