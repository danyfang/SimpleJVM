package jvm;

import com.sun.istack.internal.Nullable;
import jclass.JClass;

import java.util.Map;

public class ClassArea {
    private Map<String, JClass> classes;

    public void put(String name, JClass instance) {
        classes.put(name, instance);
    }

    @Nullable
    public JClass getClass(String key) {
        if (!classes.containsKey(key)) {
            return null;
        }
        return classes.get(key);
    }
}
