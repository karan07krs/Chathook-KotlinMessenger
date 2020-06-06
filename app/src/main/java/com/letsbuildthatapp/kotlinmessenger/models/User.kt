package com.letsbuildthatapp.kotlinmessenger.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// managing user details argument

@Parcelize
class User(val uid: String, val username: String, val profileImageUrl: String): Parcelable {
  constructor() : this("", "", "")
}