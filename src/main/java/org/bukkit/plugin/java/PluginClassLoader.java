package org.bukkit.plugin.java;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * A ClassLoader for plugins, to allow shared classes across multiple plugins
 */
public class PluginClassLoader extends URLClassLoader {
    private final JavaPluginLoader loader;
    private final Map<String, Class<?>> classes = new HashMap<String, Class<?>>();
    private HashMap<String, Package> packages = new HashMap<String, Package>();

    public PluginClassLoader(final JavaPluginLoader loader, final URL[] urls, final ClassLoader parent) {
        super(urls, parent);

        this.loader = loader;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> result = classes.get(name);

        if (result == null) {
            result = loader.getClassByName(name);

            if (result == null) {
                result = super.findClass(name);

                if (result != null) {
                    loader.setClass(name, result);
                }
            }

            classes.put(name, result);
        }

        return result;
    }

    public Set<String> getClasses() {
        return classes.keySet();
    }
/*
    @Override
    protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) throws IllegalArgumentException {
        synchronized (packages) {
            Package pkg = getPackage(name);
            if (pkg != null) {
                throw new IllegalArgumentException(name);
            }
            // use super class loader to define the package?
            pkg = super.definePackage(name, specTitle, specVersion, specVendor, implTitle, implVersion, implVendor, sealBase);
            packages.put(name, pkg);
            return pkg;
        }
    }
*/
    
    @Override
    protected Package getPackage(String name) {
        synchronized (packages) {
            Package pkg = packages.get(name);
            if (pkg == null) {
                pkg = loader.getPackageByName(name);
                if (pkg == null) {
                    pkg = super.getPackage(name);
                    if (pkg != null) {
                        loader.setPackage(name, pkg);
                    }
                }
                if (pkg != null) {
                    packages.put(name, pkg);
                }
            }
            return pkg;
        }
    }
}
