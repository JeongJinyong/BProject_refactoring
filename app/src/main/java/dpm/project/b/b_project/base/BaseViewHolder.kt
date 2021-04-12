package dpm.project.b.b_project.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
  open fun onBindViewHolder(data: Any?) {}
}