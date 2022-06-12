package com.example.testapp4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp4.databinding.TextBubbleBinding

class AdapterView(private var listChat: ArrayList<String>): RecyclerView.Adapter<AdapterView.ViewHolder>(){

    class ViewHolder(val binding: TextBubbleBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TextBubbleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chat = listChat[position]
        holder.binding.textView.text = chat
    }

    fun postChat(newChat: String){
        listChat.add(newChat)
    }

    override fun getItemCount(): Int = listChat.size

}