package com.donprag.cropperimagecustomlayout.helper

import android.graphics.Bitmap
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.request.RequestOptions
import java.io.ByteArrayOutputStream

fun ImageView.loadImageFrom(glideUrl: GlideUrl?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .priority(Priority.HIGH)
    Glide.with(this.context)
        .load(glideUrl)
        .apply(options)
        .into(this)
}

fun String.createGlideUrl(token: String): GlideUrl {
    val glideUrl = GlideUrl(
        this,
        LazyHeaders.Builder()
            .addHeader("Authorization", "Bearer $token")
            .build()
    )

    return glideUrl
}

fun ImageView.loadImageFrom(url: String?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .priority(Priority.HIGH)
    Glide.with(this.context)
        .load(url)
        .apply(options)
        .into(this)
}

fun ImageView.loadImageFrom(uri: Uri?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .priority(Priority.HIGH)
    Glide.with(this.context)
        .load(uri)
        .apply(options)
        .into(this)
}

fun ImageView.loadImageFrom(bitmap: Bitmap?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .priority(Priority.HIGH)
    Glide.with(this.context)
        .load(bitmap)
        .apply(options)
        .into(this)
}

fun ImageView.loadImageFrom(resDrawable: Int?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .priority(Priority.HIGH)
    Glide.with(this.context)
        .load(resDrawable)
        .apply(options)
        .into(this)
}

fun Bitmap.bitmapToByteArray(): ByteArray {
    val stream = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.PNG, 100, stream)
    return stream.toByteArray()
}