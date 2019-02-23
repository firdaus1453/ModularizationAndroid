package me.firdaus1453.myappbundle

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log

/**
 * Created by firdaus1453 on 2/23/2019.
 */

// Mempersiapkan variable dengan nama package project kita
const val PARENT_PACKAGE = "me.firdaus1453"
const val PACKAGE_PROFILE = "$PARENT_PACKAGE.profil"
const val PACKAGE_LOGIN = "$PARENT_PACKAGE.login"
const val BUNDLE_KEY = "bundlekey"

fun openLoginActivity(context: Context, text: String){
    try {

        // Membuat intent
        val intent = Intent(context,
            Class.forName("$PACKAGE_LOGIN.LoginActivity"))
        // Menambahkan data menuju activity selanjutnya
        intent.putExtra(BUNDLE_KEY,text)
        context.startActivity(intent)

    }catch (e: Exception){
     Log.d("navigation", "Activity not found")
    }
}

fun openProfileActivity(context: Context){
    // Berpindah activity dengan membawa DEEP LINK
    val uri = Uri
        .parse("appbundle://page/firdaus")

    // Berpindah activity
    val intent = Intent(Intent.ACTION_VIEW,uri)
    context.startActivity(intent)
}
