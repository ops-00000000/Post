data class CommentsPost (
    val id:Int,
    val fromId:Int,
    val date:Int,
    val text:String,
    val donut:Donut,
    val replyToUser:Int,
    val replyToComment:Int
        )
