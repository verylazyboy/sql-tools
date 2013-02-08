/* This file was generated by SableCC (http://www.sablecc.org/). */

package mysqlgrm.node;

import java.util.*;
import mysqlgrm.analysis.*;

@SuppressWarnings("nls")
public final class ACharsType extends PType
{
    private TVarchar _varchar_;
    private TLPar _lPar_;
    private final LinkedList<TIntegerNumber> _integerNumber_ = new LinkedList<TIntegerNumber>();
    private TRPar _rPar_;

    public ACharsType()
    {
        // Constructor
    }

    public ACharsType(
        @SuppressWarnings("hiding") TVarchar _varchar_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") List<?> _integerNumber_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setVarchar(_varchar_);

        setLPar(_lPar_);

        setIntegerNumber(_integerNumber_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new ACharsType(
            cloneNode(this._varchar_),
            cloneNode(this._lPar_),
            cloneList(this._integerNumber_),
            cloneNode(this._rPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACharsType(this);
    }

    public TVarchar getVarchar()
    {
        return this._varchar_;
    }

    public void setVarchar(TVarchar node)
    {
        if(this._varchar_ != null)
        {
            this._varchar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varchar_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public LinkedList<TIntegerNumber> getIntegerNumber()
    {
        return this._integerNumber_;
    }

    public void setIntegerNumber(List<?> list)
    {
        for(TIntegerNumber e : this._integerNumber_)
        {
            e.parent(null);
        }
        this._integerNumber_.clear();

        for(Object obj_e : list)
        {
            TIntegerNumber e = (TIntegerNumber) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._integerNumber_.add(e);
        }
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varchar_)
            + toString(this._lPar_)
            + toString(this._integerNumber_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varchar_ == child)
        {
            this._varchar_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._integerNumber_.remove(child))
        {
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varchar_ == oldChild)
        {
            setVarchar((TVarchar) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        for(ListIterator<TIntegerNumber> i = this._integerNumber_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TIntegerNumber) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
