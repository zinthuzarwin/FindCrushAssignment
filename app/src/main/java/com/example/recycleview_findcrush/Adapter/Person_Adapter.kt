package com.example.recycleview_findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview_findcrush.Model.Person
import com.example.recycleview_findcrush.R
import kotlinx.android.synthetic.main.person_item.view.*

class FindPersonAdapter(var personList:ArrayList<Person>) : RecyclerView.Adapter<FindPersonAdapter.FindPersonViewHolder>() {
    inner class FindPersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindFindPerson(findPerson: Person) {
            itemView.prof_pic.setImageResource(findPerson.profilePicture)
            itemView.txt_name.text=findPerson.name
            itemView.txt_post_status.text=findPerson.postStatus
            itemView.posted_time.text=findPerson.postTime
            itemView.uploadImage.setImageResource(findPerson.postImage)
            itemView.txt_love.text=findPerson.love
            itemView.txt_comment.text=findPerson.comment
            itemView.txt_share.text=findPerson.share
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FindPersonViewHolder {
        return FindPersonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false))
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: FindPersonViewHolder, position: Int) {
        holder.bindFindPerson(personList[position])
    }
}