package com.coderschool.vinh.nytimes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vinh on 10/20/2016.
 */

public class ArticleImageViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tvTitle) public TextView tvTitle;
    @BindView(R.id.ivImage) public ImageView ivImage;

    public ArticleImageViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}

