package org.d3if0061.mobpro1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0061.mobpro1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var Daftarnovel: MutableList<Novel> = mutableListOf(
        Novel(" Harry Potter:Goblet & Fire", "JK.Rowling", R.drawable.gobletandfire),
        Novel(" Harry Potter:DeaddlyHallows", "JK.Rowling", R.drawable.deadlyhallows),
        Novel(" Harry Potter:SorcererStone", "JK.Rowling", R.drawable.sorcererstone),
        Novel(" Kata", "Rintik sedu", R.drawable.kata),
        Novel(" Bicara itu ada seninya", "OH SHU HYANG", R.drawable.bicaraituadaseninya),
        Novel(" Dilan 1990", "Pidi Baiq", R.drawable.dilan1990),
        Novel(" Senja & Jingga", "Esti Kinasih", R.drawable.senjadanjingga),
        Novel(" Pulang ", "Tere Liye", R.drawable.pulang),
        Novel(" Dilan 1991", "Pidi Baiq", R.drawable.dilan1991),
        Novel(" The Maze Runer", "James Dashner", R.drawable.mazeruner),
    )
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(android.view.Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        window.setFlags(
            android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,
            android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }

        binding.buttonTambahNovel.setOnClickListener { addNovel() }
    }
    private fun getData(): List<Novel> {
        return Daftarnovel

    }

    private fun addNovel() {
        val namaNovel = binding.inputNamaNovelText.text.toString()
        val penulisNovel = binding.inputNamaPenulisText.text.toString()
if(!namaNovel.isBlank()|| !penulisNovel.isBlank()){}
        Daftarnovel.add(Novel(namaNovel, penulisNovel, R.drawable.kata))
        Log.d("MainActivity", Daftarnovel.toString())
    }

}