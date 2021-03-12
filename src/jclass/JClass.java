package jclass;

import com.sun.istack.internal.Nullable;

import java.util.Map;

public class JClass {
    private Map<String, JField> fields;
    private Map<String, JMethod> methods;

    public void addField(String key, JField val) {
        fields.put(key, val);
    }


    public void addMethod(String key, JMethod method) {
        methods.put(key, method);
    }


}
