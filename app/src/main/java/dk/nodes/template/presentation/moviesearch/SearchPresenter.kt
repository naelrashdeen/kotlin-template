package dk.nodes.template.presentation.moviesearch

import android.arch.lifecycle.Lifecycle
import dk.nodes.arch.presentation.base.BasePresenterImpl
import dk.nodes.template.domain.interactors.search.GetSearchInteractor
import dk.nodes.template.domain.interactors.search.SearchMoviesInteractor
import dk.nodes.template.domain.models.Movie
import dk.nodes.template.domain.repositories.favorite.FavouritesRepository
import dk.nodes.template.domain.repositories.favorite.MovieFavourite
import javax.inject.Inject

class SearchPresenter @Inject constructor(
        private val getSearchInteractor : GetSearchInteractor,
        private val searchMoviesInteractor: SearchMoviesInteractor,
        private val favouritesRepository: FavouritesRepository
) :
        BasePresenterImpl<SearchContract.View>(),
        SearchContract.Presenter,
        GetSearchInteractor.GetSearchListener,
        SearchMoviesInteractor.GetMoviesListener {


    override fun onViewCreated(view: SearchContract.View, lifecycle: Lifecycle) {
        super.onViewCreated(view, lifecycle)
    }


    override fun search(query: String) {
        TODO("not implemented")
    }

    override fun onFavoriteAdded(favourite: MovieFavourite) {
        TODO("not implemented")
    }

    override fun onSearchMoviesSuccess(results: List<SearchMoviesInteractor.SearchResult>) {
        TODO("not implemented")
    }

    override fun onSearchMoviesError(throwable: Throwable) {
        TODO("not implemented")
    }

    override fun onGetSearchSuccess(searchResults: MutableList<Movie>) {
        TODO("not implemented")
    }

    override fun onGetSearchError(throwable: Throwable) {
        TODO("not implemented")
    }

}
