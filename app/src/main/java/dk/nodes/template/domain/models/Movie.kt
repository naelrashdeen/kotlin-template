package dk.nodes.template.domain.models

import com.google.gson.annotations.SerializedName

data class Movie(
        val id: String,
        val title : String,
        @SerializedName("poster_path")
        val posterPath: String
)