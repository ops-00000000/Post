import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


class WallServiceTest {

    @Test
    fun shouldThrow() {
        val service = WallService()
        val donut = Donut(false, 1, 1, false, "all")
        val commentPost = CommentsPost(1, 2, 1, "///", donut, 1, 1)
        assertThrows(PostNotFoundException::class.java) {
            service.createComment(commentPost)
        }
    }

    @Test
    fun DoesNotThrow() {
        val donut = Donut(false, 1, 1, false, "all")
        val commentPost = CommentsPost(1, 2, 1, "///", donut, 1, 1)
        val comments = Comments(1, false, false, false, true)
        val copyright = Copyright(1, "...", "...", "...")
        val likes = Likes(1, false, true, true)
        val reposts = Reposts(1, false)
        val views = Views(1)
        val geo: Geo = Geo("...", "...", "...")
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

        service.add(post)
        service.createComment(commentPost)
        assertTrue(service.createComment(commentPost))

    }


    @Test
    fun addTest() {

        val comments = Comments(1, false, false, false, true)
        val copyright = Copyright(1, "...", "...", "...")
        val likes = Likes(1, false, true, true)
        val reposts = Reposts(1, false)
        val views = Views(1)
        val donut = Donut(false, 1, 1, false, "all")
        val geo: Geo = Geo("...", "...", "...")
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


        service.add(post)
        for (post in service.posts) {
            val actual = post.id
            assertFalse(actual < 0)
        }


    }


}

var service = WallService()


@Test
fun updateExisting() {
    val comments = Comments(1, false, false, false, true)
    val copyright = Copyright(1, "...", "...", "...")
    val likes = Likes(1, false, true, true)
    val reposts = Reposts(1, false)
    val views = Views(1)
    val donut = Donut(false, 1, 1, false, "all")
    val geo: Geo = Geo("...", "...", "...")
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


    service.add(post)
    service.add(post1)
    service.add(post2)
    val result = service.edit(post1)


    assertTrue(result)
}

@Test
fun noUpdateExisting() {
    val comments = Comments(1, false, false, false, true)
    val copyright = Copyright(1, "...", "...", "...")
    val likes = Likes(1, false, true, true)
    val reposts = Reposts(1, false)
    val views = Views(1)
    val donut = Donut(false, 1, 1, false, "all")
    val geo: Geo = Geo("...", "...", "...")
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

    service.add(post)
    service.add(post1)
    service.add(post2)
    val result = service.edit(post3)


    assertFalse(result)
}
