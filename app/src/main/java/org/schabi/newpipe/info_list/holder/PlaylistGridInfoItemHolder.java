package org.schabi.newpipe.info_list.holder;

import android.view.ViewGroup;

import com.driverolder.R;
import org.schabi.newpipe.info_list.InfoItemBuilder;

public class PlaylistGridInfoItemHolder extends PlaylistMiniInfoItemHolder {
    public PlaylistGridInfoItemHolder(final InfoItemBuilder infoItemBuilder,
                                      final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
