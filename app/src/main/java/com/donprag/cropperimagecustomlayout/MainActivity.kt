package com.donprag.cropperimagecustomlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.donprag.cropperimagecustomlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnCropWithRatio.setOnClickListener {
            val intent = Intent(this@MainActivity, CropWithRatioActivity::class.java)
            startActivity(intent)
        }

        bind.btnCropWithoutRatio.setOnClickListener {
            val intent = Intent(this@MainActivity, CropWithoutRatioActivity::class.java)
            startActivity(intent)
        }
    }
}