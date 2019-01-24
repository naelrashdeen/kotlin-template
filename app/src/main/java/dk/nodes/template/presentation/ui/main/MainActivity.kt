package dk.nodes.template.presentation.ui.main

import android.os.Bundle
import dk.nodes.template.R
import dk.nodes.template.domain.models.Post
import dk.nodes.template.presentation.base.BaseActivity
import dk.nodes.template.presentation.moviesearch.MovieSearchFragment
import kotlinx.android.synthetic.main.activity_main.*
import net.hockeyapp.android.UpdateManager
import timber.log.Timber
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {
    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun injectDependencies() {
        component.inject(this)
        presenter.onViewCreated(this, lifecycle)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = MovieSearchFragment()

        fragmentTransaction.replace(
                R.id.mainContentFl,
                fragment,
                fragment.javaClass.simpleName
        )

        fragmentTransaction.commit()

    }

    override fun onDestroy() {
        super.onDestroy()
        // If we checked for hockey updates, unregister
        UpdateManager.unregister()
    }

    override fun showPosts(posts: List<Post>) {
        for (post in posts) {
            Timber.e(post.toString())
        }
    }

    override fun showError(msg: String) {
        Timber.e(msg)
    }
}
