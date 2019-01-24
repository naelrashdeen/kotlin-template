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
        return searchResults.size
    }

    override fun onBindViewHolder(holder: SearchAdapter.SearchViewHolder, position: Int) {
        val movie = searchResults[position]
        holder.bind(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapter.SearchViewHolder {
        // 1: val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        // 2: return SearchViewHolder(view)
    }

    inner class SearchViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        // private val movieTitleTextView = itemView.findViewById<Button>(R.id.movieTitleTextView)
        // private val increaseCountBtn = itemView.findViewById<Button>(R.id.increaseCountBtn)

        fun bind(movie: Movie) {
            // set title on title textview on the parent view ^ view
            // set image on imageview via glide
            // movieTitleTextView.text = movie.title
        }
    }

}