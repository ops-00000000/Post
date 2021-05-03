data class Post(
    var id: Int,
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
    val postSource: Any?,
    val geo: Geo?,
    var copyHistory: Array<Reposts>?,
    var singerId:Int,
    var canPin:Boolean,
    var canEdit:Boolean,
    var isPinned:Boolean,
    var markedAsAds:Boolean,
    var isFavorite:Boolean,
    var donut:Donut,
    var postponedId:Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (commets != other.commets) return false
        if (copyright != other.copyright) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false
        if (views != other.views) return false
        if (postType != other.postType) return false
        if (postSource != other.postSource) return false
        if (geo != other.geo) return false
        if (!copyHistory.contentEquals(other.copyHistory)) return false
        if (singerId != other.singerId) return false
        if (canPin != other.canPin) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAds != other.markedAsAds) return false
        if (isFavorite != other.isFavorite) return false
        if (donut != other.donut) return false
        if (postponedId != other.postponedId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + fromId
        result = 31 * result + createdBy
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + replyOwnerId
        result = 31 * result + replyPostId
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + commets.hashCode()
        result = 31 * result + copyright.hashCode()
        result = 31 * result + likes.hashCode()
        result = 31 * result + reposts.hashCode()
        result = 31 * result + views.hashCode()
        result = 31 * result + postType.hashCode()
        result = 31 * result + (postSource?.hashCode() ?: 0)
        result = 31 * result + (geo?.hashCode() ?: 0)
        result = 31 * result + copyHistory.contentHashCode()
        result = 31 * result + singerId
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + postponedId
        return result
    }
}
