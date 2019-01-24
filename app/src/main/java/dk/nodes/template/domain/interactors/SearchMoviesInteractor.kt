package dk.nodes.template.domain.interactors

import dk.nodes.arch.domain.executor.Executor
import dk.nodes.arch.domain.interactor.BaseInteractor
import dk.nodes.template.BuildConfig
import dk.nodes.template.domain.models.Movie
import dk.nodes.template.domain.models.Post
import dk.nodes.template.domain.repositories.PostRepository
import dk.nodes.template.domain.repositories.RepositoryException
import dk.nodes.template.network.rest.Api

class SearchMoviesInteractorTest(
        executor: Executor,
        private val api: Api
) : BaseInteractor(executor) {
    var input : Input? = null
    var output : Output? = null

    data class Input(val searchText: String)

    interface Output {
        fun onMoviesLoaded(posts: List<Movie>)
        fun onError(msg : String)
    }

    override fun execute() {
        val searchText = input?.searchText ?: "Matrix"
        try {
            val moviesResponse = api.searchMovies(searchText, BuildConfig.API_KEY).execute()
            if(moviesResponse.isSuccessful) {
                runOnUIThread {
                    output?.onMoviesLoaded(moviesResponse.body()?.results ?: emptyList())
                }
            } else {
                output?.onError("Unknown error: ${moviesResponse.code()}")
            }
        } catch (e: Exception) {
            runOnUIThread {
                output?.onError(e.message ?: "Unknown error")
            }
        }
    }
}