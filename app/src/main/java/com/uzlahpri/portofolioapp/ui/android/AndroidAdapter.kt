package com.uzlahpri.portofolioapp.ui.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uzlahpri.portofolioapp.R
import com.uzlahpri.portofolioapp.data.android.Android
import com.uzlahpri.portofolioapp.databinding.ItemAppBinding

class AndroidAdapter : RecyclerView.Adapter<AndroidAdapter.AndroidViewHolder>() {
    private val listData = ArrayList<Android>()
    var onItemClicked: ((Android) -> Unit)? = null

    fun setData(newList: List<Android>?) {
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder =
        AndroidViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_app, parent, false)
        )

    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        val listData = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int = listData.size

    inner class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemAppBinding.bind(itemView)

        fun bind(data: Android) {
            binding.android = data
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener {
                onItemClicked?.invoke(listData[adapterPosition])
            }
        }
    }
}