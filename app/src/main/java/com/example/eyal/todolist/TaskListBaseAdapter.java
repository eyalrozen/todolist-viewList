package com.example.eyal.todolist;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by Eyal on 11/5/2015.
 */
public class TaskListBaseAdapter extends BaseAdapter {
    private Context context;
    private List<TaskItem> items;

    public TaskListBaseAdapter(Context context, List<TaskItem> _items) {
        this.items = _items;
        this.context = context;
    }

    static class ViewHolder {
        TextView tv_description;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        if (this.items != null && items.size() > position)
            return this.items.get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.list_view_item, null);
            holder = new ViewHolder();
            holder.tv_description = (TextView) convertView
                    .findViewById(R.id.textView_description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_description.setText(items.get(position).GetTask());
        return convertView;
    }
}
