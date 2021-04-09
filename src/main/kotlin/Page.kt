class Page(
    override val type: Any,
    val id:Int,
    val groupId:Int,
    var title:String
) : Attachment {
}