package com.app.youtubeedu.presenter

import com.app.youtubeedu.contract.DetailContract
import com.app.youtubeedu.data.Video
import com.app.youtubeedu.interactor.RelatedVideoLoaderInteractor

class VideoDetailsPresenter(
    private val interactor: RelatedVideoLoaderInteractor,
    private val router: DetailContract.Router
) : BasePresenter<DetailContract.View>(), DetailContract.Presenter {

    override fun onBackClick() {
        TODO("not yet implemented")
    }

    override fun loadRelatedVideoList(video: Video) {
        TODO("not yet implemented")
    }

    override fun onItemClick(video: Video) {
        TODO("not yet implemented")
    }

    override fun playVideo(video: Video) {
        TODO("Not yet implemented")
    }

}