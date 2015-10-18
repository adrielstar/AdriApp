package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import ga.adrielwalter.adriapp.R;

/**
 * Created by Adriel on 10/18/2015.
 */
public class SwipeListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List< String> movieList;

    public SwipeListAdapter(Activity activity, List< String> movieList) {
        this.activity = activity;
        this.movieList = movieList;

    }
    @Override
    public int getCount() {
        return movieList.size();
    }
    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        title.setText(movieList.get(position));
        return convertView;
    }
}