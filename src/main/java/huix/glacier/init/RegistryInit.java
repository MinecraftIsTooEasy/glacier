package huix.glacier.init;

import huix.glacier.api.extension.creativetab.GlacierCreativeTabs;
import huix.glacier.api.registry.MinecraftRegistry;
import huix.glacier.api.entrypoint.IGameRegistry;
import net.minecraft.*;

public class RegistryInit implements IGameRegistry {
    public static final MinecraftRegistry registry = new MinecraftRegistry("glacier").initAutoItemRegister();

    @Override
    public void onGameRegistry() {
    }
}
