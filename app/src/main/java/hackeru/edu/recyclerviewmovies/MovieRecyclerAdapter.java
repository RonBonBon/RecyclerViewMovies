package hackeru.edu.recyclerviewmovies;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    List<Movie> movies = MoviesDataSource.getMovies();

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder h, int position) {
        Movie m = movies.get(position);
        h.tvTitle.setText(m.getTitle());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
