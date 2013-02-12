/* This file was generated by SableCC (http://www.sablecc.org/). */

package mysqlgrm.node;

import mysqlgrm.analysis.*;

@SuppressWarnings("nls")
public final class ADropClausel extends PDropClausel
{
    private TDrop _drop_;
    private TTable _table_;
    private TIf _if_;
    private TExists _exists_;
    private PIdentifierList _identifierList_;

    public ADropClausel()
    {
        // Constructor
    }

    public ADropClausel(
        @SuppressWarnings("hiding") TDrop _drop_,
        @SuppressWarnings("hiding") TTable _table_,
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") TExists _exists_,
        @SuppressWarnings("hiding") PIdentifierList _identifierList_)
    {
        // Constructor
        setDrop(_drop_);

        setTable(_table_);

        setIf(_if_);

        setExists(_exists_);

        setIdentifierList(_identifierList_);

    }

    @Override
    public Object clone()
    {
        return new ADropClausel(
            cloneNode(this._drop_),
            cloneNode(this._table_),
            cloneNode(this._if_),
            cloneNode(this._exists_),
            cloneNode(this._identifierList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADropClausel(this);
    }

    public TDrop getDrop()
    {
        return this._drop_;
    }

    public void setDrop(TDrop node)
    {
        if(this._drop_ != null)
        {
            this._drop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._drop_ = node;
    }

    public TTable getTable()
    {
        return this._table_;
    }

    public void setTable(TTable node)
    {
        if(this._table_ != null)
        {
            this._table_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._table_ = node;
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public TExists getExists()
    {
        return this._exists_;
    }

    public void setExists(TExists node)
    {
        if(this._exists_ != null)
        {
            this._exists_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exists_ = node;
    }

    public PIdentifierList getIdentifierList()
    {
        return this._identifierList_;
    }

    public void setIdentifierList(PIdentifierList node)
    {
        if(this._identifierList_ != null)
        {
            this._identifierList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifierList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._drop_)
            + toString(this._table_)
            + toString(this._if_)
            + toString(this._exists_)
            + toString(this._identifierList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._drop_ == child)
        {
            this._drop_ = null;
            return;
        }

        if(this._table_ == child)
        {
            this._table_ = null;
            return;
        }

        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._exists_ == child)
        {
            this._exists_ = null;
            return;
        }

        if(this._identifierList_ == child)
        {
            this._identifierList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._drop_ == oldChild)
        {
            setDrop((TDrop) newChild);
            return;
        }

        if(this._table_ == oldChild)
        {
            setTable((TTable) newChild);
            return;
        }

        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._exists_ == oldChild)
        {
            setExists((TExists) newChild);
            return;
        }

        if(this._identifierList_ == oldChild)
        {
            setIdentifierList((PIdentifierList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
