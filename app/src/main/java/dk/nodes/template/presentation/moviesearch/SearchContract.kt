package dk.nodes.template.presentation.moviesearch

import android.support.annotation.UiThread
import dk.nodes.arch.presentation.base.BasePresenter
import dk.nodes.arch.presentation.base.BaseView
import dk.nodes.template.domain.models.Movie
import dk.nodes.template.domain.repositories.favorite.FavouritesRepository
import dk.nodes.template.domain.repositories.favorite.MovieFavourite

interface SearchContract {
    enum class State {
        Loading, Favourites
    }

    @UiThread
    interface View : BaseView {

        fun onSearchQueryChanged(query : String)

        fun setState(state : State)

        fun setResults(searchResults: MutableList<Movie>)

        fun onMovieClicked(movie : Movie)

        fun showError(throwable : Throwable)

    }

    interface Presenter : BasePresenter<View> {

        fun search(query : String)

        fun onFavoriteAdded(favourite: MovieFavourite)
    }
}