package org.skife.natty;

import org.fusesource.hawtjni.runtime.JniClass;
import org.fusesource.hawtjni.runtime.Library;

@JniClass
public class Simple
{
    private static final Library LIBRARY = new Library("hj-play", Simple.class);

    static {
        LIBRARY.load();
    }

    public static native int puts(String message);

    public static void main(String[] args)
    {
        Simple.puts("WOOO HOOOO");
    }

}
