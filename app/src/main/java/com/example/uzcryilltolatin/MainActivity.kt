package com.example.uzcryilltolatin

import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uzcryilltolatin.databinding.ActivityMainBinding
import com.example.uzcryilltolatin.utils.*
/**
 * Created by Erkinjon on 8/9/2022.
 */
class MainActivity : AppCompatActivity() {
    companion object {
        private const val ACTION_VOICE_SEARCH = 500
    }

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var lang = "uz-Uz"
        binding.imgLang.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, binding.imgLang)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.lanRU -> {
                        lang = "ru-Ru"
                    }
                    R.id.lanUZ -> {
                        lang = "uz-Uz"
                    }

                }
                true
            })
            popupMenu.show()
        }

        binding.toLatin.setOnClickListener {
            cyrillicToLatin()
        }

        binding.toCyrillic.setOnClickListener {
            latinToCyrillic()
        }


        binding.imgMic.setOnClickListener {
            val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, lang) // Locale.getDefault()
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Iltimos! Balandroq gapring. $lang")

            try {
                startActivityForResult(intent, ACTION_VOICE_SEARCH)
            } catch (e: Exception) {
                Toast.makeText(this, "Ooops! Xatolik bor", Toast.LENGTH_SHORT).show()
            }

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ACTION_VOICE_SEARCH) {
            if (requestCode != RESULT_OK && null != data) {
                val result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
               binding.textEdt.setText(result?.get(0))
            }
        }
    }

    fun latinToCyrillic () {
        Toast.makeText(this, "latinToCyrillic", Toast.LENGTH_SHORT).show()
        var lat: String=" "
        if (binding.textEdt.getText().toString()!=""){
           lat= binding.textEdt.getText().toString()
        }
        val convToCyr = toCyrillic()
        var cyr = ""
        cyr = convToCyr.convertToCyrUZ(lat)
        binding.textEdt.setText(cyr)

    }

    fun cyrillicToLatin () {
        Toast.makeText(this, "cyrillicToLatin", Toast.LENGTH_SHORT).show()
        var cyr: String=" "
        if (binding.textEdt.getText().toString()!=""){
            cyr=binding.textEdt.getText().toString()
        }
        val convToLat = toLatin()
        var lat = ""
        lat = convToLat.convertUZ(cyr)

        binding.textEdt.setText(lat)
    }
}

