package com.hasna_19104045.modul9

import android.os.Parcelable

class SettingModel {
    @Parcelize
    data class SettingModel (
        var name: String? = null,
        var email: String? = null,
        var age: Int = 0,
        var phoneNumber: String? = null,
        var isDarkTheme: Boolean = false
    ): Parcelable
}