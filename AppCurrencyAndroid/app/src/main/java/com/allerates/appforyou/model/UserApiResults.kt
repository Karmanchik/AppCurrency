package com.allerates.appforyou.model

data class RegEmail(var auth_key: String)

data class ConfirmMailResult(
        var status: String,
        var message: String
)

data class ActivateUser(
        var status: String,
        var ActivateUser: Boolean
)

data class UserInfoResult (
    var query_content: Array<UserInfo>,
    var img_content: String
)

class UserInfo(
    var ExName: String,
    var ExImage: String,
    var ExUserID: String,
    var UserPhone: String,
    var ExMail: String,
    var MainCurrency: String,
    var Auth_key: String,
    var ActivateUser: String,
    var SurName: String
)

data class SendRecoveryMailResult(
        var status: String,
        var message: String
)

data class BasicResult(
        var status: String,
        var message: String
)