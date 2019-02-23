package me.firdaus1453.profil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        // Menangkap data uri dari intent
        val name = intent.data.lastPathSegment
        // Menampilkan data yang sudah di ambil ke toast
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}
