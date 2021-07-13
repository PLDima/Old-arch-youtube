package com.app.youtubeedu.router

import android.content.Context
import com.app.youtubeedu.contract.SearchContract
import com.app.youtubeedu.data.Video
import com.app.youtubeedu.view.DetailsActivity

class SearchRouter(private val context: Context) : BaseRouter(context), SearchContract.Router {

    override fun openVideoDetails(video: Video) {
        val intent = DetailsActivity.newIntent(context, video)
        context.startActivity(intent)
    }
}