package by.marcel.recyleview_withcardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlnAdapter(var mList: List<PlnData>) :
    RecyclerView.Adapter<PlnAdapter.LanguageViewHolder>() {

    inner class LanguageViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val logo : ImageView =itemView.findViewById(R.id.logo)
        val title : TextView = itemView.findViewById(R.id.title)
    }

    fun setFilteredList(mList: List<PlnData>) {
        this.mList = mList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item , parent , false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.logo.setImageResource(mList[position].logo)
        holder.title.text = mList[position].title
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}