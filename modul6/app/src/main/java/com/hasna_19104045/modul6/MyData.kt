package com.hasna_19104045.modul6

class MyData {
    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String
    ) : Parcelable
}