package org.d3if0061.mobpro1

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.d3if0061.mobpro1.databinding.ListItemBinding

class MainAdapter(private val data: List<Novel>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(
        private val binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(novel: Novel) = with(binding) {
            namaTextView.text = novel.Judul
            latinTextView.text = novel.Penulis
            imageView.setImageResource(novel.imageResId)
            root.setOnClickListener {
                val message = root.context.getString(R.string.message, novel.Judul)
                Toast.makeText(root.context, message, Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
    override fun getItemCount(): Int {
        return data.size
    }

}