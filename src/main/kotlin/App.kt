data class App(
    val id:Int,
    var name:String,
    var photo130:String,
    var photo604:String
) : Attachment {
    override val type: String = "App"
}