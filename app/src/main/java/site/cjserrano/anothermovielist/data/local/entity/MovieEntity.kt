package site.cjserrano.anothermovielist.data.local.entity

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import site.cjserrano.anothermovielist.data.remote.model.Director
import site.cjserrano.anothermovielist.data.remote.model.Genre
import site.cjserrano.anothermovielist.data.remote.model.Star

@Entity(tableName = "movies")
data class MovieEntity(
    val image: String? = null,
    val fullTitle: String? = null,
    val runtimeMins: String? = null,
    val year: String? = null,
    val directors: String? = null,
    val genreList: List<Genre?>? = null,
    val metacriticRating: String? = null,
    val directorList: List<Director?>? = null,
    val stars: String? = null,
    val title: String? = null,
    val imDbRating: String? = null,
    val runtimeStr: String? = null,
    val imDbRatingCount: String? = null,
    val plot: String? = null,
    val genres: String? = null,
    val contentRating: String? = null,
    val starList: List<Star?>? = null,
    val id: String? = null,
    val releaseState: String? = null
) : BaseEntity()