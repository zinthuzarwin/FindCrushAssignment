package com.example.recycleview_findcrush.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview_findcrush.Adapter.FindPersonAdapter
import com.example.recycleview_findcrush.Model.Person
import com.example.recycleview_findcrush.R
import kotlinx.android.synthetic.main.fragment_person.view.*

/**
 * A simple [Fragment] subclass.
 */
class PersonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var personArray=ArrayList<Person>()

        personArray.add(Person(R.drawable.xiaozhan,"Wei Wuxian","Posted","1h",R.drawable.yixian,"50K","9000","10K"))
        personArray.add(Person(R.drawable.yibo,"Land Wangji","Posted","2h",R.drawable.yixian1,"15K","7000","9.1K"))
        personArray.add(Person(R.drawable.actress,"Chin Girl","Posted","4h",R.drawable.actor2,"7K","3500","2.5K"))
        personArray.add(Person(R.drawable.actor2,"Jin Ling","Posted","3h",R.drawable.actress,"9K","4000","1.1K"))

        var personAdapter=FindPersonAdapter(personArray)
        var root=inflater.inflate(R.layout.fragment_person, container, false)
        root.recyclerView.layoutManager= LinearLayoutManager(context)
        root.recyclerView.adapter=personAdapter
        // Inflate the layout for this fragment
        return root
    }

}
