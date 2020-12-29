package com.tiwttzel.hassanplus.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.tiwttzel.hassanplus.R;
import com.tiwttzel.hassanplus.data.api.result.Stream;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DownLoadYoutubeAdapter extends RecyclerView.Adapter<DownLoadYoutubeAdapter.DownLoadHolder> {
    public interface OnDownLoaYoutubeItemClickListener {
        void onItemDownLoadYoutubeClicked(Stream stream);
    }

    List<Stream> streams;
    OnDownLoaYoutubeItemClickListener onDownLoaYoutubeItemClickListener;

    public DownLoadYoutubeAdapter(List<Stream> streams, OnDownLoaYoutubeItemClickListener onDownLoaYoutubeItemClickListener) {
        this.streams = streams;
        this.onDownLoaYoutubeItemClickListener = onDownLoaYoutubeItemClickListener;
    }

    @NotNull
    @Override
    public DownLoadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_download, parent, false);
        return new DownLoadYoutubeAdapter.DownLoadHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DownLoadHolder holder, int position) {
        holder.bind(streams.get(position));
    }

    @Override
    public int getItemCount() {
        return streams.size();
    }


    public class DownLoadHolder extends RecyclerView.ViewHolder {
        TextView mSizeTextView;
        TextView mQualityTextView;
        ConstraintLayout mConstraintLayout;

        public DownLoadHolder(@NonNull View itemView) {
            super(itemView);
            mSizeTextView = itemView.findViewById(R.id.size_text_view);
            mQualityTextView = itemView.findViewById(R.id.quality_text_view);
            mConstraintLayout = itemView.findViewById(R.id.constraint_layout);
        }

        private void bind(final Stream stream) {
            boolean isCompleteStream = stream.getExtension().equals("mp4") && !stream.getFormat().equals("audio only");
            if (!isCompleteStream)
                mConstraintLayout.setVisibility(View.GONE);
            else
                mConstraintLayout.setVisibility(View.VISIBLE);
            if (stream.getFilesizePretty() != null)
                mSizeTextView.setText(stream.getFilesizePretty());
            else if (stream.getFilesize() != 0)
                mSizeTextView.setText(String.valueOf(stream.getFilesize()));
            if (stream.getFormatNote() != null)
                mQualityTextView.setText(stream.getFormatNote());
            else if (stream.getHeight() != 0 && stream.getWidth() != 0) {
                String quality = stream.getHeight() + "X" + stream.getWidth();
                mQualityTextView.setText(quality);
            }


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onDownLoaYoutubeItemClickListener.onItemDownLoadYoutubeClicked(stream);
                }
            });
        }
    }
}
