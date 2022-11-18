package com.example.greme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.greme.databinding.ActivityMoreInformationBinding

class MoreInformationActivity : AppCompatActivity() {
    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityMoreInformationBinding? = null
    // 매번 null 체크를 할 필요없이 편의성을 위해 바인딩 변수 재선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 바인딩
        mBinding = ActivityMoreInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(this, R.array.city_array, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        binding.spinnerCity.adapter = adapter

        // Create an ArrayAdapter
        val adapter2 = ArrayAdapter.createFromResource(this, R.array.gu_array, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        binding.spinnerGu.adapter = adapter2

        // Create an ArrayAdapter
        val adapter3 = ArrayAdapter.createFromResource(this, R.array.purpose_array, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        binding.spinnerPurpose.adapter = adapter3
    }
    // 액티비티가 파괴될 때..
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 함
        mBinding = null
        super.onDestroy()
    }
}