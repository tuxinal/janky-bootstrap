package xyz.tuxinal.jankybootstrap;

import link.infra.packwiz.installer.Main;

public class BootstrapMain {
    public static void main(String[] args) {
        String entrypoint = System.getProperty("entrypoint");
        String packurl = System.getProperty("packUrl");
        try {
            Class<?> entrypointClass = Class.forName(entrypoint);
            Main.main(new String[] { packurl });
            entrypointClass.getDeclaredMethod("main", String[].class).invoke(null, (Object)args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}