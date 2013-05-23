package com.ning.killbill.objects;

import java.util.ArrayList;
import java.util.List;

public final class ClassOrInterface {

    private final String name;
    private boolean isInterface;

    private final List<String> superInterfaces;
    private final List<String> superBaseClasses;

    private final List<Method> methods;

    public ClassOrInterface(final String name, final boolean anInterface) {
        this.name = name;
        this.isInterface = anInterface;
        this.methods = new ArrayList<Method>();
        superInterfaces = new ArrayList<String>();
        superBaseClasses = new ArrayList<String>();
    }

    public void addMethod(Method method) {
        methods.add(method);
    }

    public void addSuperInterface(final String ifce) {
        superInterfaces.add(ifce);
    }

    public void addSuperClass(final String claz) {
        superBaseClasses.add(claz);
    }

    public String getName() {
        return name;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public List<String> getSuperInterfaces() {
        return superInterfaces;
    }

    public List<String> getSuperBaseClasses() {
        return superBaseClasses;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClassOrInterface{");
        sb.append("name='").append(name).append('\'');
        sb.append(", isInterface=").append(isInterface);
        sb.append(", superInterfaces=").append(superInterfaces);
        sb.append(", superBaseClasses=").append(superBaseClasses);
        sb.append(", methods=").append(methods);
        sb.append('}');
        return sb.toString();
    }
}