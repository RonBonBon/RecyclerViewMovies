package hackeru.edu.recyclerviewmovies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private List<Movie> movies = MoviesDataSource.getMovies();
    private LayoutInflater inflater;

    public MovieRecyclerAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder h, int position) {
        Movie m = movies.get(position);
        h.tvTitle.setText(m.getTitle());
        h.tvRating.setText(String.valueOf(m.getRating()));
        h.ivThumbnail.setImageResource(m.getThumbnailResId());
        h.tvGenre.setText(Arrays.toString(m.getGenres()));
        h.tvYear.setText(String.valueOf(m.getYear()));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
