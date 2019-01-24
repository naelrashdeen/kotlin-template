package dk.nodes.template.presentation.moviesearch

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import dk.nodes.template.domain.models.Movie
import dk.nodes.template.util.MovieList

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    var onMovieClickedListener : ((movie : Movie) -> Unit) ? = null
    var searchResults: MutableList<Movie> = arrayListOf()

    private val selectedList : MovieList
    get() {
        return searchResults
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: SearchAdapter.SearchViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapter.SearchViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class SearchViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }

}