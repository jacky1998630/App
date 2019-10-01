package com.project.madapp.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import com.project.madapp.R;
import com.project.madapp.Task;
import com.project.madapp.TaskerDbHelper;

import java.util.ArrayList;
import java.util.List;

private class MyAdapter extends ArrayAdapter<Task>
{
    Context context;
    List<Task> taskList=new ArrayList<Task>();
    int layoutResourceId;
    public MyAdapter(Context context, int layoutResourceId,
                     List<Task> objects) {
        super(context, layoutResourceId, objects);
        this.layoutResourceId = layoutResourceId;
        this.taskList=objects;
        this.context=context;
    }
    /**This method will DEFINe what the view inside the list view will finally look like
     * Here we are going to code that the checkbox state is the status of task and
     * check box text is the task name
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_inner_view, parent, false);
        CheckBox chk=(CheckBox)rowView.findViewById(R.id.chkStatus);
        Task current=taskList.get(position);
        chk.setText(current.getTaskName());
        chk.setChecked(current.getStatus()==1?true:false);

        return rowView;
    }
}

protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_task);
        //db is a variable of type TaskerDbHelper
        db=new TaskerDbHelper(this);
        list=db.getAllTasks();
        adapt=new MyAdapter(this,R.layout.list_inner_view , list);
        ListView listTask=(ListView)findViewById(R.id.listView1);
        listTask.setAdapter(adapt);
        }