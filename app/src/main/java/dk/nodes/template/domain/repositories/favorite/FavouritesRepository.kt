package dk.nodes.template.domain.repositories.favorite

import dk.nodes.template.domain.models.Movie

sealed class Favourite

data class MovieFavourite(val position: Int = -1,
                          val movie: Movie){
    fun from(movie : Movie) = MovieFavourite(movie = movie)
}

interface FavouritesRepository {

}