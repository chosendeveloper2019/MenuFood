package com.ctnphrae.menufood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? = null

    var foods = arrayOf(
        "Minced pork omelette",
        "Stir fried pork with basil",
        "Papaya salad",
        "Boiled egg, Bael leaves",
        "Pad Thai",
        "Korat Noodle",
        "Shrimp Salad",
        "Boiled pork noodles",
        "Steamed sea",
        "Steamed rices",
        "Pork Belly",
        "Liang Vegetable Fried Eggs"
    )
    var arrImg = arrayOf<Int>(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView) as RecyclerView

        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setLayoutManager(GridLayoutManager(this, 2))
        val myAdapter = AdapterRecycleView(foods,arrImg,this)
        recyclerView!!.setAdapter(myAdapter)

    }
}
