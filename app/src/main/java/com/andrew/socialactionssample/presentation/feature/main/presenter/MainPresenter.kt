package com.andrew.socialactionssample.presentation.feature.main.presenter

import com.andrew.social.login.base.SocialType
import com.andrew.social.login.base.action.SocialLoginManager
import com.andrew.socialactionssample.di.PerActivity
import com.andrew.socialactionssample.presentation.feature.main.view.MainView
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import javax.inject.Inject

/**
 * Created by Andrew on 16.06.2018.
 */

@PerActivity
@InjectViewState
class MainPresenter @Inject constructor() : MvpPresenter<MainView>(),
        SocialLoginManager.LoginCallback {

    override fun onSuccess(socialType: SocialType, token: String, info: String) {
        viewState.updateToken(socialType, token, info)
    }

    override fun onError(error: Throwable) {
        error.printStackTrace()
    }
}