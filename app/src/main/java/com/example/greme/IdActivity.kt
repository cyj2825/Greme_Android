package com.example.greme

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.greme.databinding.ActivityIdBinding
import com.example.greme.databinding.ActivityLoginBinding

class IdActivity : AppCompatActivity() {
    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityIdBinding? = null
    // 매번 null 체크를 할 필요없이 편의성을 위해 바인딩 변수 재선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 바인딩
        mBinding = ActivityIdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        binding.etId.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                TODO("Not yet implemented")
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(binding.etId.length() < 3){
                    binding.tvIdWarn.text = "3글자 이상이어야 합니다."
                    binding.tvIdWarn.setTextColor(Color.RED)
                }
                else if(binding.etId.length() > 15){
                    binding.tvIdWarn.text = "15글자 이내여야 합니다."
                    binding.tvIdWarn.setTextColor(Color.RED)
                }
            }
        })*/
    }
    // 액티비티가 파괴될 때..
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 함
        mBinding = null
        super.onDestroy()
    }
}