package com.activemesa.behavioral.strategy.statik;

import java.util.List;
import java.util.function.Supplier;

class TextProcessor2<LS extends ListStrategy>
{
  private StringBuilder sb = new StringBuilder();
  // cannot do this
  // private LS listStrategy = new LS();
  private LS listStrategy;

  public TextProcessor2(Supplier<? extends LS> ctor)
  {
    listStrategy = ctor.get();
  }

  // the skeleton algorithm is here
  public void appendList(List<String> items)
  {
    listStrategy.start(sb);
    for (String item : items)
      listStrategy.addListItem(sb, item);
    listStrategy.end(sb);
  }

  public void clear()
  {
    sb.setLength(0);
  }

  @Override
  public String toString()
  {
    return sb.toString();
  }
}