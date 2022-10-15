package com.example.tp1

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity


class PickImageActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var pickImageBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_image)
        imageView = findViewById(R.id.imgView)
        pickImageBtn = findViewById(R.id.pickImageButton)

        pickImageBtn.setOnClickListener { view ->
            loadImage(view)
        }
    }
    fun loadImage(view: View){
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI )
        pickImage.launch(intent)
    }
    val pickImage = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if (result.resultCode == RESULT_OK){
            val uriImage = result.data?.data
            imageView.setImageURI(uriImage)
        }
    }
}