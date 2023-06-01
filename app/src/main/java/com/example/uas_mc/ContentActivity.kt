package com.example.uas_mc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {

    private lateinit var MusicRecyclerView: RecyclerView
    private lateinit var MusicList : ArrayList<Music>
    private lateinit var MusicAdapter : MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        MusicList = ArrayList()

        MusicList.add(
            Music(
                R.drawable.bohemian, "BOHEMIAN RHAPSHODY",
                "Bohemian Rhapsody adalah sebuah lagu oleh band rock asal Inggris,Queen. Lagu tersebut ditulis oleh Freedie Mercury untuk album A Night At Opera (1975).")
        )

        MusicList.add(
            Music(R.drawable.iris, "IRIS THE GOO GOO DOLLS",
                "Lagu \"Iris\" ini datang dari album \"Dizzy Up the Girl\" yang merupakan album studio keenam mereka. Album ini dirilis pada 22 September 1998 melalui label Warner Records.")
        )

        MusicList.add(
            Music(R.drawable.lagu3, "MOCKING BIRD",
                "Lagu Mockingbird bercerita tentang rasa cinta dan usaha seorang ayah melindungi anaknya. Setiap lirik yang ada lagu ini memancarkan kisah personal atau pengalaman menjadi seorang ayah dalam menjaga anaknya.")
        )

        MusicList.add(
            Music(R.drawable.joji, "JOJI",
                "Lagu Glimpse of Us atau yang dalam bahasa Indonesia artinya ‘Sekilas tentang Kita’ ini mengandung makna yang begitu dalam. Lagu ini menceritakan tentang seseorang yang belum bisa move on dari mantan kekasihnya.")
        )

        MusicRecyclerView = findViewById(R.id. MusicRecyclerView)
        MusicRecyclerView.setHasFixedSize(true)
        MusicRecyclerView.layoutManager = LinearLayoutManager(this)

        MusicAdapter =  MusicAdapter(MusicList)
        MusicRecyclerView.adapter = MusicAdapter
        MusicAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Music", it)
            startActivity(intent)
        }
    }
}