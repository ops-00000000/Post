data class Graffiti(
    val id:Int,
    val ownerId:Int,
    var photo130:String,
    var photo604:String
) : Attachment {
    override val type: String = "Graffiti"
}