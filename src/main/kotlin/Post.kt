data class Post(
    val id: Int,
    var ownerId:Int,
    var fromId:Int,
    var createdBy:Int,
    val date:Int ,
    var text:String,
    var replyOwnerId:Int,
    var replyPostId:Int,
    var friendsOnly:Boolean,
    var commets:Comments,
var copyright:Copyright,
var likes:Likes,
var reposts:Reposts,
var views:Views,
var postType:String,
var singerId:Int,
var canPin:Boolean,
var canEdit:Boolean,
var isPinned:Boolean,
var markedAsAds:Boolean,
var isFavorite:Boolean,
var donut:Donut,
var postponedId:Int
)
