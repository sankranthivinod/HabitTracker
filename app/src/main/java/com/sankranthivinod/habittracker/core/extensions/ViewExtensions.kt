package com.sankranthivinod.habittracker.core.extensions

import android.widget.Toast
import android.content.Context

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
