package edu.temple.simplerecyclerview

import android.support.v4.os.IResultReceiver._Parcel
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (_number: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {
    private val number = _number
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply{
                layoutParams = ViewGroup.LayoutParams(1, 100)
            }
        )

    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val text = null
        holder.textView.text =  number[position].toString()
    }
    override fun getItemCount(): Int {
        return number.size
    }

    //Step 3b: Complete function definitions for adapter
}