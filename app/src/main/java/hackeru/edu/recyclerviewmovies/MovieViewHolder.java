package hackeru.edu.recyclerviewmovies;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    TextView tvTitle, tvGenre, tvRating, tvYear;
    ImageView ivThumbnail;

    public MovieViewHolder(View v) {
        super(v);
        tvTitle = (TextView) v.findViewById(R.id.tvTitle);
        tvGenre = (TextView) v.findViewById(R.id.tvGenre);
        tvRating = (TextView) v.findViewById(R.id.tvRating);
        tvYear = (TextView) v.findViewById(R.id.tvYear);
        ivThumbnail = (ImageView) v.findViewById(R.id.ivThumbnail);
    }
}
