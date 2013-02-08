/* This file was generated by SableCC (http://www.sablecc.org/). */

package mysqlgrm.node;

import mysqlgrm.analysis.*;

@SuppressWarnings("nls")
public final class ANotNull extends PNotNull
{
    private TNot _not_;
    private TNull _null_;

    public ANotNull()
    {
        // Constructor
    }

    public ANotNull(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") TNull _null_)
    {
        // Constructor
        setNot(_not_);

        setNull(_null_);

    }

    @Override
    public Object clone()
    {
        return new ANotNull(
            cloneNode(this._not_),
            cloneNode(this._null_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotNull(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
    }

    public TNull getNull()
    {
        return this._null_;
    }

    public void setNull(TNull node)
    {
        if(this._null_ != null)
        {
            this._null_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._null_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._not_)
            + toString(this._null_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

        if(this._null_ == child)
        {
            this._null_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._null_ == oldChild)
        {
            setNull((TNull) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
