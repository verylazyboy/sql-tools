/* This file was generated by SableCC (http://www.sablecc.org/). */

package mysqlgrm.node;

import mysqlgrm.analysis.*;

@SuppressWarnings("nls")
public final class AIntSingleValue extends PSingleValue
{
    private TIntegerNumber _integerNumber_;

    public AIntSingleValue()
    {
        // Constructor
    }

    public AIntSingleValue(
        @SuppressWarnings("hiding") TIntegerNumber _integerNumber_)
    {
        // Constructor
        setIntegerNumber(_integerNumber_);

    }

    @Override
    public Object clone()
    {
        return new AIntSingleValue(
            cloneNode(this._integerNumber_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntSingleValue(this);
    }

    public TIntegerNumber getIntegerNumber()
    {
        return this._integerNumber_;
    }

    public void setIntegerNumber(TIntegerNumber node)
    {
        if(this._integerNumber_ != null)
        {
            this._integerNumber_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integerNumber_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integerNumber_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integerNumber_ == child)
        {
            this._integerNumber_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integerNumber_ == oldChild)
        {
            setIntegerNumber((TIntegerNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
