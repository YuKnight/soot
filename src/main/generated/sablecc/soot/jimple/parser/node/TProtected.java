/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TProtected extends Token
{
    public TProtected()
    {
        super.setText("protected");
    }

    public TProtected(int line, int pos)
    {
        super.setText("protected");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProtected(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProtected(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProtected text.");
    }
}
