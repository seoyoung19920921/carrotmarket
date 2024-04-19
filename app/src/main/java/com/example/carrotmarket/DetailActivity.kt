package com.example.carrotmarket

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.carrotmarket.MainActivity
import com.example.carrotmarket.databinding.ActivityDetailBinding
import com.example.carrotmarket.MyItem


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getItem = intent.getParcelableExtra<MyItem>("MyItem")
        if (getItem != null) {
            binding.photo.setImageResource(getItem.itemImage)
            binding.name.text = getItem.nickName
            binding.address.text = getItem.address
            binding.title.text = getItem.itemTitle
            binding.secondtitle.text = getItem.itemInfo
            binding.price.text = (String.format("%,d원", getItem.priceInfo))
        }

        val back: ImageButton = binding.backButton
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
