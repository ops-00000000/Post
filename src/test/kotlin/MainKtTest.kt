import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun addTest() {

        val comments = Comments(1,false,false,false,true)
        val copyright = Copyright(1,"...","...","...")
        val likes = Likes(1,false,true,true)
        val reposts = Reposts(1,false)
        val views = Views(1)
        val donut = Donut(false,1,1,false,"all")
        val geo:Geo = Geo("...","...","...")
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )


        add(post)
 for (post in WallService){
     val actual = post.id
     assertFalse(actual < 0)
 }





    }


}
class WallServiceTest {
    @Test
    fun updateExisting() {
        val comments = Comments(1,false,false,false,true)
        val copyright = Copyright(1,"...","...","...")
        val likes = Likes(1,false,true,true)
        val reposts = Reposts(1,false)
        val views = Views(1)
        val donut = Donut(false,1,1,false,"all")
        val geo:Geo = Geo("...","...","...")
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )

        val post1 = Post(
            2,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )

        val post2 = Post(
            3,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )


        add(post)
        add(post1)
        add(post2)
       val result = edit(post1)


        assertTrue(result)
    }

    @Test
    fun noUpdateExisting() {
        val comments = Comments(1,false,false,false,true)
        val copyright = Copyright(1,"...","...","...")
        val likes = Likes(1,false,true,true)
        val reposts = Reposts(1,false)
        val views = Views(1)
        val donut = Donut(false,1,1,false,"all")
        val geo:Geo = Geo("...","...","...")
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )

        val post1 = Post(
            2,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )

        val post2 = Post(
            3,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )

        val post3 = Post(
            4,
            1,
            1,
            1,
            1,
            "1",
            1,
            1,
            false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            "post",
            null,
            geo,
            null,
            1,
            true,
            true,
            true,
            true,
            true,
            donut,
            1
        )

        add(post)
        add(post1)
        add(post2)
        val result = edit(post3)


        assertFalse(result)
    }

}