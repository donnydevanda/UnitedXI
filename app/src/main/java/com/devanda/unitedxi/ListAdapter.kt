package com.devanda.unitedxi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter(private val listPlayer: ArrayList<Player>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.item_description)
        var tvImage: ImageView = itemView.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val player = listPlayer[position]

        Glide.with(holder.itemView.context)
            .load(player.image)
            .apply(RequestOptions())
            .into(holder.tvImage)

        holder.tvName.text = player.name
        holder.tvDescription.text= player.description

        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listPlayer[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listPlayer.size
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Player)
    }

}