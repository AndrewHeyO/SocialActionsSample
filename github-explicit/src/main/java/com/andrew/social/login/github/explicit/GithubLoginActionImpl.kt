package com.andrew.social.login.github.explicit

import android.app.Activity
import android.text.TextUtils
import com.andrew.social.login.core.SocialType
import com.andrew.social.login.core.randomString
import com.andrew.social.login.core.web.BaseWebSocialLoginAction

/**
 * Created by Andrew on 15.07.2018
 */

class GithubLoginActionImpl(
    activity: Activity,
    clientId: String,
    redirectUrl: String,
    scope: String = ""
) : BaseWebSocialLoginAction(activity) {

    override val socialType: SocialType = SocialType.GITHUB

    override var url = "https://github.com/login/oauth/authorize" +
        "?client_id=$clientId" +
        "&redirect_uri=$redirectUrl" +
        "&state=${randomString()}" +
        if (!TextUtils.isEmpty(scope)) "&scope=$scope" else ""
}