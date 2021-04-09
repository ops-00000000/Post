class Graffiti(
    override val type: Any,
    val id:Int,
    val ownerId:Int,
    var photo130:String,
    var photo604:String
) : Attachment {
}