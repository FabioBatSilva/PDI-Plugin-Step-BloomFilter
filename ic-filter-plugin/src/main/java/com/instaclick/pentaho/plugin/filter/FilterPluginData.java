package com.instaclick.pentaho.plugin.filter;

import com.instaclick.filter.Data;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Pentaho filter plugin data
 *
 * @author Fabio B. Silva <fabio.bat.silva@gmail.com>
 */
public class FilterPluginData extends BaseStepData implements StepDataInterface
{
    /**
     * Data row
     */
    public RowMetaInterface outputRowMeta;

    /**
     * Data filter row
     */
    public Data filterData;

    /**
     * Hash filter index
     */
    public Integer[] fieldsIndex = new Integer[]{};

    /**
     * Timestamp filter index
     */
    public Integer timeFieldIndex = null;

    /**
     * Hash field value
     */
    public String hashValue = null;

    /**
     * Timestamp field value
     */
    public Long timeValue = null;

    /**
     * Is unique
     */
    public Long isUnique = 0L;

    /**
     * Unique count
     */
    public Long uniqueCount = 0L;

    /**
     * Always Pass The Row
     */
    public boolean isAlwaysPassRow = false;

    /**
     * The Step is transactional
     */
    public boolean isTransactional = false;

    /**
     * This step will never flush the filters.
     */
    public boolean isCheckOnly = false;

    public FilterPluginData()
    {
        super();
    }
}
