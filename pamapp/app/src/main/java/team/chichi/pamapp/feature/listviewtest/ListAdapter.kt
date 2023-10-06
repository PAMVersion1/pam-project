package team.chichi.pamapp.feature.listviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import team.chichi.pamapp.R

class ListAdapter(private val mData:ArrayList<ItemData>) : BaseAdapter() {
    private var mInflater: LayoutInflater? = null
    private val mListCnt: Int = mData.size

    override fun getCount(): Int {
        return mData.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if (convertView == null) {
            val context = parent?.context
            if (mInflater == null) {
                mInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            }
            convertView = mInflater?.inflate(R.layout.listview_item, parent, false)
        }

        val oTextTitle = convertView?.findViewById<TextView>(R.id.textTitle)
        val oTextDate = convertView?.findViewById<TextView>(R.id.textDate)

        oTextTitle?.text = mData[position].strTitle
        oTextDate?.text = mData[position].strDate
        return convertView!!
    }
}