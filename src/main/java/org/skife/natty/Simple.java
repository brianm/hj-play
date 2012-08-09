package org.skife.natty;

import org.fusesource.hawtjni.runtime.JniClass;
import org.fusesource.hawtjni.runtime.Library;

@JniClass
public class Simple
{
    private static final Library LIBRARY = new Library("simple", Simple.class);

    static {
        LIBRARY.load();
    }

    public static native int puts(String message);

}
