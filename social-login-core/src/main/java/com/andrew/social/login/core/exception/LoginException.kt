package com.andrew.social.login.core.exception

import com.andrew.social.login.core.SocialType

/**
 * Created by Andrew on 04.08.2018
 */

class LoginException(val social: SocialType) : Exception()