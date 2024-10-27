package com.donprag.cropperimagecustomlayout

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.donprag.cropperimagecustomlayout.databinding.ActivityResultCropBinding
import com.donprag.cropperimagecustomlayout.helper.loadImageFrom

class ResultCropActivity : AppCompatActivity() {
    private lateinit var bind: ActivityResultCropBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityResultCropBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val byteArray = intent.getByteArrayExtra("intent-key")
        if (byteArray != null) {
            val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)

            val imageWidth = bitmap.width
            val imageHeight = bitmap.height

            val ratioString = "$imageWidth:$imageHeight"

            val layoutParams = bind.ivResult.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.dimensionRatio = ratioString
            bind.ivResult.layoutParams = layoutParams

            bind.ivResult.loadImageFrom(bitmap)
        }
    }
}