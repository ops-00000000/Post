data class Photo(
    val id:Int,
    val albumId:Int,
    val ownerId:Int,
    val userId:Int
) : Attachment {
    override val type: String = "Photo"
}

