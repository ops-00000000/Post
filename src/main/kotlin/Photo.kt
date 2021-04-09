 class Photo(
     override val type: Any,
     val id:Int,
     val albumId:Int,
     val ownerId:Int,
     val userId:Int,

 ) : Attachment{
 }

