package com.example.oderapp.Paginnation;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PaginnationScrolListent extends RecyclerView.OnScrollListener {
    private LinearLayoutManager linearLayoutManager;

    public PaginnationScrolListent(LinearLayoutManager linearLayoutManager) {
        this.linearLayoutManager = linearLayoutManager;
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        int visibleItemCount  = linearLayoutManager.getChildCount();
        int totalItemCount = linearLayoutManager.getItemCount();
        int firstVisibleItemPosition  = linearLayoutManager.findFirstVisibleItemPosition();
        if (isLoading() || isLastPage()){
            return;
        }
        if(firstVisibleItemPosition >= 0 && (visibleItemCount + firstVisibleItemPosition) >= totalItemCount){
            loadMoreItem();
        }
    }
    public  abstract void loadMoreItem();
    public  abstract boolean isLoading();
    public  abstract boolean isLastPage();
}
