package com.wallet.crypto.alphawallet.ui.widget.entity;

import com.wallet.crypto.alphawallet.entity.Token;
import com.wallet.crypto.alphawallet.ui.widget.holder.MarketOrderHeaderHolder;

/**
 * Created by James on 13/02/2018.
 */

public class MarketSaleHeaderSortedItem extends SortedItem<Token>
{
    public MarketSaleHeaderSortedItem(Token value)
    {
        super(MarketOrderHeaderHolder.VIEW_TYPE, value, 0);
    }

    @Override
    public int compare(SortedItem other)
    {
        return weight - other.weight;
    }

    @Override
    public boolean areContentsTheSame(SortedItem newItem)
    {
        return newItem.viewType == viewType
                || (((TokenBalanceSortedItem) newItem).value.getTicketCount() == value.getTicketCount())
                && ((TokenBalanceSortedItem) newItem).value.getFullName().equals(value.getFullName());
    }

    @Override
    public boolean areItemsTheSame(SortedItem other)
    {
        return other.viewType == viewType;
    }
}