data class Page(
    val id:Int,
    val groupId:Int,
    var title:String
) : Attachment {
    override val type: String ="Page"
}