package com.example.carrotmarket

import MyAdapter
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carrotmarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding  // 뷰 바인딩을 위한 변수 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 레이아웃을 메모리에 로드
        setContentView(binding.root)  // 로드된 레이아웃을 화면에 표시

        val carrotMarketData = Itemlist.getCarrotMarketData()  // 데이터 소스로부터 데이터를 가져옴
        val adapter = MyAdapter(carrotMarketData)  // 어댑터 생성
        adapter.setOnClickListener(object : MyAdapter.OnClickListener {
            override fun onClick(position: Int, model: MyItem) {
                Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("MyItem", model)  // 인텐트에 데이터 객체 추가
                    startActivity(this)  // DetailActivity 시작
                }
            }
        })

        binding.recyclerview.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@MainActivity)  // 리사이클러뷰 설정
        }

        binding.bellImage.setOnClickListener {  // 알림 아이콘 클릭 이벤트 핸들러
            notification()
        }
    }

    private fun notification() {
        val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val builder: NotificationCompat.Builder

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channelId = "one-channel"
            val channelName = "my Channel One"
            val channel =
                NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(channel)
            builder = NotificationCompat.Builder(this, channelId)
        } else {
            builder = NotificationCompat.Builder(this)
        }



        builder.apply {
            setContentTitle("키워드 알림")
            setContentText("키워드 알림이 도착했습니다~!")
            setSmallIcon(R.drawable.ic_notify)
        }
        manager.notify(1, builder.build())

    }


    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        AlertDialog.Builder(this).apply {
            setTitle("종료")
            setMessage("종료하시겠습니까?")
            setIcon(R.drawable.ic_mask)
            setPositiveButton("확인") { _, _ -> finish() }
            setNegativeButton("취소", null)
            show()
        }
    }
}
