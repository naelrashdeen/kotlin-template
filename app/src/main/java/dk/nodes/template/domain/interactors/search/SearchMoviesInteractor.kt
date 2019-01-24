package dk.nodes.template.domain.interactors.search

import dk.nodes.template.domain.models.Movie
import io.reactivex.disposables.Disposable

interface SearchMoviesInteractor {

    data class SearchResult(
            val movie: Movie,
            val isFavorite: Boolean
            )

    interface GetMoviesListener {
        fun onSearchMoviesSuccess(results: List<SearchResult>)
        fun onSearchMoviesError(throwable: Throwable)
    }

    var listener: GetMoviesListener?

    fun execute(doOnce: Boolean = false): Disposable
}