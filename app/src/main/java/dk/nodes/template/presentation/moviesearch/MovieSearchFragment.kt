package dk.nodes.template.presentation.moviesearch

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dk.nodes.template.R
import dk.nodes.template.domain.models.Movie
import dk.nodes.template.presentation.base.BaseFragment
import javax.inject.Inject

class MovieSearchFragment : BaseFragment(), SearchContract.View {

    private val adapter = SearchAdapter()

    @Inject
    lateinit var presenter: SearchPresenter

    override fun injectDependencies() {
        component.inject(this)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) : View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onViewCreated(this, lifecycle)

        presenter.search("True Detective")

        // Setup adapter and attach it to the recyclerview
    }

    override fun onSearchQueryChanged(query: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setState(state: SearchContract.State) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setResults(searchResults: List<Movie>) {
        // fill adapter with results and call notifyDataSetChanged()
        adapter.searchResults.clear()
        adapter.searchResults.addAll(searchResults)
        adapter.notifyDataSetChanged()
    }

    override fun onMovieClicked(movie: Movie) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(msg: String) {
        Snackbar.make(view ?: return, msg, Snackbar.LENGTH_SHORT).show()
    }
}