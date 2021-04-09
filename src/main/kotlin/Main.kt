
fun main(){

    val photos = Photo("photo",1,1,1,1)

    val comments = Comments(1,false,false,false,true)
    val copyright = Copyright(1,"...","...","...")
    val likes = Likes(1,false,true,true)
    val reposts = Reposts(1,false)
    val views = Views(1)
    val donut = Donut(false,1,1,false,"all")
    val geo:Geo = Geo("...","...","...")
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
var WallService = emptyArray<Post>()
var postID:Array<Int> = emptyArray()
var Att = emptyArray<Attachment>()

fun addAtt(type: Attachment ):Attachment {
    when(type){
        is Photo -> { val photo = type; Att += photo}
        is Graffiti -> {val graffiti = type; Att += graffiti}
        is App -> {val app = type; Att += app}
        is Page -> {val page = type; Att += page}
        is Album -> {val album = type; Att += album}
    }

TODO()
}

fun add(post:Post):Post {
    WallService += post
    postID += post.id
    return post
}


fun edit(post:Post):Boolean{

    if (post in WallService){
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
        WallService += post
        return  true
    }
    else{
        return false
    }
}
