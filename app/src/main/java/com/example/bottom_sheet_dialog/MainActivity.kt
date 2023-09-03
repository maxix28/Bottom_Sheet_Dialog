package com.example.bottom_sheet_dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottom_sheet_dialog.databinding.ActivityMainBinding
import com.example.bottom_sheet_dialog.databinding.SheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    lateinit var  Sheetbinding : SheetLayoutBinding
    lateinit var  dialog : BottomSheetDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Sheetbinding = SheetLayoutBinding.inflate(layoutInflater)
        dialog= BottomSheetDialog(this, R.style.BottomSheeetTheme)
        dialog.setContentView(Sheetbinding.root)
        dialog.window?.attributes?.windowAnimations = R.style.DialodAnimation


binding.btnOpenSheet.setOnClickListener{
    dialog.show()
}
    }
}