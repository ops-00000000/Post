data class Album(
    val id:Int,
    var thumb:Any,
    val ownerId:Int,
    var title:String,
    var description:String,
    val created:Int,
    val updated:Int,
    val size:Int
) :Attachment {
    override val type: String = "Album"
}