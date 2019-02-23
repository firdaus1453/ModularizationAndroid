package me.firdaus1453.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import me.firdaus1453.myappbundle.BUNDLE_KEY

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Menangkap data dari Intent
        val data = intent.getStringExtra(BUNDLE_KEY)
        // Menampilkan data yang sudah di ambil ke toast
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }
}
