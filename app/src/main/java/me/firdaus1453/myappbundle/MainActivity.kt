package me.firdaus1453.myappbundle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Membuat button onClickListener
        btnLogin.setOnClickListener {
            // Menjalankan function yang sudah dibuat pada AppNavigationRouter
            // Untuk berpindah Activity
            openLoginActivity(this@MainActivity,"HELLO FROM BAWA DATA LOGIN")
        }

        // Membuat button onClickListener
        btnProfile.setOnClickListener {
            // Menjalankan function yang sudah dibuat pada AppNavigationRouter
            // Untuk berpindah Activity
            openProfileActivity(this@MainActivity)
        }
    }
}
