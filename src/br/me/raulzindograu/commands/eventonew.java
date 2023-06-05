package br.me.raulzindograu.commands;

import br.me.raulzindograu.Main;
import br.me.raulzindograu.utils.Titles;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class eventonew implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String l, String[] args) {

        Player p = (Player) s;
        if(l.equalsIgnoreCase("eventonew")){
            if(!p.hasPermission("no.newevento")){
                p.sendMessage("§cVocê não tem permissão suficiente para executar este comando!");
                p.playSound(p.getLocation(), Sound.CAT_PURR, 1f,1f);
            }
            if(args.length == 0){
                p.sendMessage("§7Use: /eventonew <nome>");
                return true;
            }

            if(args.length >=1){
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
                    int a = 5;

                    @Override
                    public void run() {

                        if(this.a == 5){
                            for(Player online : Bukkit.getOnlinePlayers()){
                                Titles titulo = new Titles("§a" + getMensagem(args),"Evento começa em: §e" + this.a + "§f2s", 0,2,2);
                                titulo.send(p);
                                online.playSound(online.getLocation(),Sound.ORB_PICKUP, 1F, (float)1F);
                            }
                        }
                        if(this.a == 4){
                            for(Player online : Bukkit.getOnlinePlayers()){
                                Titles titulo = new Titles("§a" + getMensagem(args),"Evento começa em: §e" + this.a + "§f2s", 0,2,2);
                                titulo.send(p);
                                online.playSound(online.getLocation(),Sound.ORB_PICKUP, 1F, (float)1F);
                            }
                        }
                        if(this.a == 3){
                            for(Player online : Bukkit.getOnlinePlayers()){
                                Titles titulo = new Titles("§a" + getMensagem(args),"Evento começa em: §e" + this.a + "§f2s", 0,2,2);
                                titulo.send(p);
                                online.playSound(online.getLocation(),Sound.ORB_PICKUP, 1F, (float)1F);
                            }
                        }
                        if(this.a == 2){
                            for(Player online : Bukkit.getOnlinePlayers()){
                                Titles titulo = new Titles("§a" + getMensagem(args),"Evento começa em: §e" + this.a + "§f2s", 0,2,2);
                                titulo.send(p);
                                online.playSound(online.getLocation(),Sound.ORB_PICKUP, 1F, (float)1F);
                            }
                        }
                        if(this.a == 1){
                            for(Player online : Bukkit.getOnlinePlayers()){
                                Titles titulo = new Titles("§a" + getMensagem(args),"Evento começa em: §e" + this.a + "§f2s", 0,2,2);
                                titulo.send(p);
                                online.playSound(online.getLocation(),Sound.ORB_PICKUP, 1F, (float)1F);
                            }
                        }
                        if(this.a == 0){
                            for(Player online : Bukkit.getOnlinePlayers()){
                                Titles titulo = new Titles("§a" + getMensagem(args),"Evento foi aberto: §e" + this.a + "§f2s", 0,2,2);
                                titulo.send(p);
                                online.playSound(online.getLocation(), Sound.EXPLODE, 1F, (float) 1F);
                                online.playSound(online.getLocation(), Sound.ENDERDRAGON_DEATH, 1F, (float) 1F);
                                online.getWorld().spawnEntity(online.getLocation(), EntityType.FIREWORK);
                                online.getWorld().spawnEntity(online.getLocation(), EntityType.FIREWORK);
                                online.getWorld().spawnEntity(online.getLocation(), EntityType.FIREWORK);
                                online.getWorld().spawnEntity(online.getLocation(), EntityType.FIREWORK);}
                        }
                    }
                }, 20L);
            }
        }

        return false;
    }

    public static String getMensagem(String[] args) {

        StringBuilder buildeString = new StringBuilder();
        for(int i=0;i<args.length;i++){
            buildeString.append(args[i] + " ");
        }
        return  buildeString.toString();
    }
}
