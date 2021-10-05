package com.example.simple.builder;

class Bar {}

public class Foo<K>
{
    final private int count;
    final private K key;

    Foo(Builder<K> b)
    {
        this.count = b.count;
        this.key = b.key;
    }

    public static class Builder<K2>
    {
        int count;
        K2 key;

        private Builder() {}
        static public <K3> Builder<K3> start() { return new Builder<K3>(); }
        public Builder<K2> setCount(int count) { this.count = count; return this; }
        public Builder<K2> setKey(K2 key) { this.key = key; return this; }
        public Foo<K2> build() { return new Foo<K2>(this); }
    }

    @Override
	public String toString() {
		return "Foo [count=" + count + ", key=" + key + "]";
	}

	public static void main(String[] args)
    {
        Bar bar = new Bar();
        Foo<Bar> foo1 = Foo.Builder.<Bar> start().setCount(1).setKey(bar).build();
        System.out.println(foo1);
    }
}