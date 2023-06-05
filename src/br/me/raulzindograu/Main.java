package br.me.raulzindograu;

import br.me.raulzindograu.commands.eventonew;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {



    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(
                "" +
                "§a _   _       _   _               _____                _       \n" +
                "§a| \\ | |     | \\ | |             |  ___|              | |      \n" +
                "§a|  \\| | ___ |  \\| | _____      _| |____   _____ _ __ | |_ ___ \n" +
                "§a| . ` |/ _ \\| . ` |/ _ \\ \\ /\\ / /  __\\ \\ / / _ \\ '_ \\| __/ __|\n" +
                "§a| |\\  | (_) | |\\  |  __/\\ V  V /| |___\\ V /  __/ | | | |_\\__ \\\n" +
                "§a\\_| \\_/\\___/\\_| \\_/\\___| \\_/\\_/ \\____/ \\_/ \\___|_| |_|\\__|___/\n" +
                "                                                              \n" +
                "§aPlugin de iniciar eventos funcionando");
    }


    public void resgiterCommands(){
        getCommand("eventonew").setExecutor((CommandExecutor) new eventonew());
    }

    public static Main getInstance(){
        return(Main)Bukkit.getPluginManager().getPlugin("NoNewEvents");
    }

}
