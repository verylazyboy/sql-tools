/* This file was generated by SableCC (http://www.sablecc.org/). */

package mysqlgrm.node;

import mysqlgrm.analysis.*;

@SuppressWarnings("nls")
public final class ACreateDdl extends PDdl
{
    private PCreateClausel _createClausel_;
    private TSemicolon _semicolon_;

    public ACreateDdl()
    {
        // Constructor
    }

    public ACreateDdl(
        @SuppressWarnings("hiding") PCreateClausel _createClausel_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setCreateClausel(_createClausel_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ACreateDdl(
            cloneNode(this._createClausel_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACreateDdl(this);
    }

    public PCreateClausel getCreateClausel()
    {
        return this._createClausel_;
    }

    public void setCreateClausel(PCreateClausel node)
    {
        if(this._createClausel_ != null)
        {
            this._createClausel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._createClausel_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._createClausel_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._createClausel_ == child)
        {
            this._createClausel_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._createClausel_ == oldChild)
        {
            setCreateClausel((PCreateClausel) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
