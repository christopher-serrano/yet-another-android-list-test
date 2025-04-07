package site.cjserrano.anothermovielist.data.local.database.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import site.cjserrano.anothermovielist.data.remote.model.Director
import site.cjserrano.anothermovielist.data.remote.model.Genre
import site.cjserrano.anothermovielist.data.remote.model.Star

object MovieDataConverter {

    @TypeConverter
    @JvmStatic
    fun fromGenreList(list: List<Genre>): String? {
        val type = object : TypeToken<List<Genre>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toGenreList(list: String?): List<Genre>? {
        val type = object : TypeToken<List<Genre>>() {}.type
        return Gson().fromJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromDirectorList(list: List<Director>): String? {
        val type = object : TypeToken<List<Director>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toDirectorList(list: String?): List<Director>? {
        val type = object : TypeToken<List<Director>>() {}.type
        return Gson().fromJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromStarList(list: List<Star>): String? {
        val type = object : TypeToken<List<Star>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toStarList(list: String?): List<Star>? {
        val type = object : TypeToken<List<Star>>() {}.type
        return Gson().fromJson(list, type)
    }
}
