package com.example.ahtcfg24.isfirstrun;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * <p>Description: </p>
 *
 * @author XuDing
 * @version 1.0
 * @date 2015/4/29
 */
public class AdapterGuide extends PagerAdapter
{
    /**
     * Return the number of views available.
     */
    @Override
    public int getCount()
    {
        return 0;
    }

    /**
     * Determines whether a page View is associated with a specific key object
     * as returned by {@link #instantiateItem(ViewGroup, int)}. This method is
     * required for a PagerAdapter to function properly.
     *
     * @param view   Page View to check for association with <code>object</code>
     * @param object Object to check for association with <code>view</code>
     * @return true if <code>view</code> is associated with the key object <code>object</code>
     */
    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return false;
    }
}
