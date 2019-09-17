package com.example.astudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //만약 어떤 이미지파일을 res/drawable 에 넣고 사용하고 싶을 땐, R.drawable.xx~
        //R은 리소스를 대변하고. 그 밑 디렉토리 처리함
    }
}
