package com.activemesa.behavioral.strategy.statik;

interface ListStrategy
{
  default void start(StringBuilder sb) {}
  void addListItem(StringBuilder stringBuilder, String item);
  default void end(StringBuilder sb) {}
}
