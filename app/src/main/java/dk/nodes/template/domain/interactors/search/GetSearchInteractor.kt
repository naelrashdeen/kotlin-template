package dk.nodes.template.domain.interactors.search

import dk.nodes.template.domain.models.Movie

interface GetSearchInteractor {
    interface GetSearchListener {
        fun onGetSearchSuccess(searchResults: MutableList<Movie>)
        fun onGetSearchError(throwable: Throwable)
    }

    var listener: GetSearchListener?

    fun execute(query: String)
}