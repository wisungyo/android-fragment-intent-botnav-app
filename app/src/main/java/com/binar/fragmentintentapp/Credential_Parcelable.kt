package com.binar.fragmentintentapp

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class Credential_Parcelable(var username: String?, var password: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeString(password)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Credential_Parcelable> {
        override fun createFromParcel(parcel: Parcel): Credential_Parcelable {
            return Credential_Parcelable(parcel)
        }

        override fun newArray(size: Int): Array<Credential_Parcelable?> {
            return arrayOfNulls(size)
        }
    }
}