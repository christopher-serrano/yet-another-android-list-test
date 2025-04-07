package site.cjserrano.anothermovielist.data.remote.model

import com.google.gson.annotations.SerializedName

data class Director(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)