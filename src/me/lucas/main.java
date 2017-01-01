package me.lucas;


import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
 

public class main extends JavaPlugin implements Listener {

	ArrayList<Player>troll = new ArrayList<Player>();
	ArrayList<String>dname = new ArrayList<String>();
	ArrayList<Player>ice = new ArrayList<Player>();

	

	
	
	
	
	

	@Override
	public void onEnable() {
Bukkit.getServer().getPluginManager().registerEvents(this, this);



	}
	@Override
	public void onDisable() {

		HandlerList.unregisterAll((Plugin)this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player){
    	if(((Player) sender).getPlayer().isOp()){
    	if(command.getName().equalsIgnoreCase("troll")){
    		if(args.length == 1){
    			if(Bukkit.getPlayerExact(args[0]) != null){
    				troll.add(Bukkit.getPlayer(args[0]));
    				dname.add(args[0]);
    				for (Player p :troll) {
    					if(!(p.isDead())){
    						
    						
    					
    					
    				
    				
    				
    				
    				sender.sendMessage(ChatColor.GREEN+"Você está trollando o jogador: "+ChatColor.RED+""+args[0]);
    				Object troll = Bukkit.createInventory(null, 36, "Troll");
    				((Player) sender).openInventory((Inventory) troll);
    				
    				
    				
    				org.bukkit.inventory.ItemStack item1 = new org.bukkit.inventory.ItemStack(Material.BEDROCK, 1);
    				ItemMeta meta1 = (ItemMeta) item1.getItemMeta();
    			     meta1.setDisplayName("Jaula");
    			     item1.setItemMeta(meta1);
    				((Player) sender).getPlayer().getOpenInventory().setItem(0, item1);
    				
    				
    				org.bukkit.inventory.ItemStack item2 = new org.bukkit.inventory.ItemStack(Material.ICE, 1);
    				ItemMeta meta2 = (ItemMeta) item2.getItemMeta();
    			     meta2.setDisplayName("Congelar/Descongelar");
    			     item2.setItemMeta(meta2);
    				((Player) sender).getPlayer().getOpenInventory().setItem(1, item2);
    				
    				
    				org.bukkit.inventory.ItemStack item3 = new org.bukkit.inventory.ItemStack(Material.FLINT_AND_STEEL, 1);
    				ItemMeta meta3 = (ItemMeta) item3.getItemMeta();
    			     meta3.setDisplayName("Queimar");
    			     item3.setItemMeta(meta3);
    				((Player) sender).getPlayer().getOpenInventory().setItem(2, item3);
    				
    				
    				org.bukkit.inventory.ItemStack item4 = new org.bukkit.inventory.ItemStack(Material.TORCH, 1);
    				ItemMeta meta4 = (ItemMeta) item4.getItemMeta();
    			     meta4.setDisplayName("Raio");
    			     item4.setItemMeta(meta4);
    				((Player) sender).getPlayer().getOpenInventory().setItem(3, item4);
    				
    				
    				org.bukkit.inventory.ItemStack item5 = new org.bukkit.inventory.ItemStack(Material.BARRIER, 1);
    				ItemMeta meta5 = (ItemMeta) item5.getItemMeta();
    			     meta5.setDisplayName("Matar");
    			     item5.setItemMeta(meta5);
    				((Player) sender).getPlayer().getOpenInventory().setItem(4, item5);
    				
    				
    				org.bukkit.inventory.ItemStack item7 = new org.bukkit.inventory.ItemStack(Material.DIAMOND_AXE, 1);
    				ItemMeta meta7 = (ItemMeta) item7.getItemMeta();
    			     meta7.setDisplayName("Kick");
    			     item7.setItemMeta(meta7);
    				((Player) sender).getPlayer().getOpenInventory().setItem(5, item7);
    				
    				
    				org.bukkit.inventory.ItemStack item8 = new org.bukkit.inventory.ItemStack(Material.BUCKET, 1);
    				ItemMeta meta8 = (ItemMeta) item8.getItemMeta();
    			     meta8.setDisplayName("Limpar Inventario");
    			     item8.setItemMeta(meta8);
    				((Player) sender).getPlayer().getOpenInventory().setItem(6, item8);
    				
    				
    				org.bukkit.inventory.ItemStack item9 = new org.bukkit.inventory.ItemStack(Material.DIRT, 1);
    				ItemMeta meta9 = (ItemMeta) item9.getItemMeta();
    			     meta9.setDisplayName("Zuar Inventario");
    			     item9.setItemMeta(meta9);
    				((Player) sender).getPlayer().getOpenInventory().setItem(7, item9);
    				
    				
    				org.bukkit.inventory.ItemStack item10 = new org.bukkit.inventory.ItemStack(Material.LAVA_BUCKET, 1);
    				ItemMeta meta10 = (ItemMeta) item10.getItemMeta();
    			     meta10.setDisplayName("Lava");
    			     item10.setItemMeta(meta10);
    				((Player) sender).getPlayer().getOpenInventory().setItem(8, item10);
    				
    				
    				org.bukkit.inventory.ItemStack item11 = new org.bukkit.inventory.ItemStack(Material.ENDER_PEARL, 1);
    				ItemMeta meta11 = (ItemMeta) item11.getItemMeta();
    			     meta11.setDisplayName("Teleportar");
    			     item11.setItemMeta(meta11);
    				((Player) sender).getPlayer().getOpenInventory().setItem(9, item11);
    				
    				
    				org.bukkit.inventory.ItemStack item12 = new org.bukkit.inventory.ItemStack(Material.FEATHER, 1);
    				ItemMeta meta12 = (ItemMeta) item12.getItemMeta();
    			     meta12.setDisplayName("Voar");
    			     item12.setItemMeta(meta12);
    				((Player) sender).getPlayer().getOpenInventory().setItem(10, item12);
    				
    				
    				org.bukkit.inventory.ItemStack item13 = new org.bukkit.inventory.ItemStack(Material.SKULL_ITEM, 1);
    				ItemMeta meta13 = (ItemMeta) item13.getItemMeta();
    			     meta13.setDisplayName("Assustar");
    			     item13.setItemMeta(meta13);
    				((Player) sender).getPlayer().getOpenInventory().setItem(11, item13);
    				
    				
    				org.bukkit.inventory.ItemStack item14 = new org.bukkit.inventory.ItemStack(Material.ARMOR_STAND, 1);
    				ItemMeta meta14 = (ItemMeta) item14.getItemMeta();
    			     meta14.setDisplayName("OP Falso");
    			     item14.setItemMeta(meta14);
    				((Player) sender).getPlayer().getOpenInventory().setItem(12, item14);
    				
    				
    				org.bukkit.inventory.ItemStack item15 = new org.bukkit.inventory.ItemStack(Material.ROTTEN_FLESH, 1);
    				ItemMeta meta15 = (ItemMeta) item15.getItemMeta();
    			     meta15.setDisplayName("Fome");
    			     item15.setItemMeta(meta15);
    				((Player) sender).getPlayer().getOpenInventory().setItem(13, item15);
    				
    				
    				org.bukkit.inventory.ItemStack item6 = new org.bukkit.inventory.ItemStack(Material.BOOK, 1);
    				ItemMeta meta6 = (ItemMeta) item6.getItemMeta();
    			     meta6.setDisplayName("Fechar");
    			     item6.setItemMeta(meta6);
    				((Player) sender).getPlayer().getOpenInventory().setItem(35, item6);
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				((Player) sender).updateInventory();
    				
    					}
    			}
    				
    			}else{
    				sender.sendMessage(ChatColor.RED+"Jogador não encontrado!");
    			}
    		}else{
    			
    			sender.sendMessage(ChatColor.RED+"Utilize: /troll <jogador>");
    			
    		}
    	}
    }else{
    	sender.sendMessage(ChatColor.DARK_RED+"Apenas jogadores com OP podem usar esse comando!");
    }
 }
	return false;
	}
	
	
	
	@EventHandler
	public void click(InventoryClickEvent event){
		if(event.getWhoClicked() instanceof Player){
			if(event.getInventory().getName().equals("Troll")){
				event.setCancelled(true);
				
				if(event.getCurrentItem().getType() == Material.BEDROCK){
					event.getWhoClicked().closeInventory();
					
					if (!(troll.isEmpty())) {
						 for (Player p :troll) {
							 
							 
							 Location pl = p.getLocation().getBlock().getLocation().add(0, 1, 0);
							 
							    pl.add(0.5 ,0 ,0.5);
							 p.teleport(pl);
							 
					
						
						p.getLocation().subtract(0, 1, 0).getBlock().setType(Material.BEDROCK);
						p.getLocation().add(0, 2, 0).getBlock().setType(Material.BEDROCK);
						p.getLocation().subtract(1, 0, 0).getBlock().setType(Material.BEDROCK);
						p.getLocation().add(1, 0, 0).getBlock().setType(Material.BEDROCK);
						p.getLocation().subtract(0, 0, 1).getBlock().setType(Material.BEDROCK);
						p.getLocation().add(0, 0, 1).getBlock().setType(Material.BEDROCK);
						
						
						
						 }
						
					}else{
						event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
						
					}
					event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você colocou o jogador: "+ChatColor.RED+""+dname+" "+ChatColor.GREEN+"na jaula!");
					troll.clear();
					dname.clear();
				}
				
				
				
				
				if(event.getCurrentItem().getType() == Material.ICE){
					event.getWhoClicked().closeInventory();
					
					if (!(troll.isEmpty())) {
						for (Player p :troll) {
							
						if(ice.contains(p)){
							ice.remove(p);
							event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você descongelou o jogador: "+ChatColor.RED+""+dname);
						}else{
							ice.add(p);
							event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você congelou o jogador: "+ChatColor.RED+""+dname);
						}
						}
						
						
					}else{
						event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
						
					}
					troll.clear();
					dname.clear();
					
				}
				
				
				
				
				
			if(event.getCurrentItem().getType() == Material.FLINT_AND_STEEL){
					event.getWhoClicked().closeInventory();
					
					if (!(troll.isEmpty())) {
						for (Player p :troll) {
							
							p.getPlayer().setFireTicks(100);
							event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você queimou o jogador: "+ChatColor.RED+""+dname);
						}
						
						
					}else{
						event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
						
					}
					troll.clear();
					dname.clear();
					
				}
				
				
			
			
			if(event.getCurrentItem().getType() == Material.TORCH){
				event.getWhoClicked().closeInventory();
				
				if (!(troll.isEmpty())) {
					for (Player p :troll) {
						p.getPlayer().getWorld().strikeLightning(p.getLocation());
						event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você jogou um raio no jogador: "+ChatColor.RED+""+dname);
						
					}
					
					
				}else{
					event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
					
				}
				troll.clear();
				dname.clear();
				
			}
				
				
				
			if(event.getCurrentItem().getType() == Material.BARRIER){
				event.getWhoClicked().closeInventory();
				
				if (!(troll.isEmpty())) {
					for (Player p :troll) {
						p.setHealth(0.0D);
						event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você matou o jogador: "+ChatColor.RED+""+dname);
						
					
					}
					
					
				}else{
					event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
					
				}
				troll.clear();
				dname.clear();
				
			}
				
				
			
			
			if(event.getCurrentItem().getType() == Material.BOOK){
				event.getWhoClicked().closeInventory();
				
				if (!(troll.isEmpty())) {
					for (Player p :troll) {
						p.getPlayer();
					event.getWhoClicked().closeInventory();
					}
					
					
				}else{
					event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
					
				}
				troll.clear();
				dname.clear();
				
			}
			
			
			
			
			if(event.getCurrentItem().getType() == Material.DIAMOND_AXE){
				event.getWhoClicked().closeInventory();
				
				if (!(troll.isEmpty())) {
					for (Player p :troll) {
						p.kickPlayer(null);
					
						event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você deu kick no jogador: "+ChatColor.RED+""+dname);
						
					}
				}else{
					event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
					
				}
				dname.clear();
				troll.clear();
				
			}
			
			
			
			
			if(event.getCurrentItem().getType() == Material.BUCKET){
				event.getWhoClicked().closeInventory();
				
				if (!(troll.isEmpty())) {
					for (Player p :troll) {
					p.getInventory().clear();
					event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você limpou o inventario do jogador: "+ChatColor.RED+""+dname);
					
					}
					
					
				}else{
					event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
					
				}
				troll.clear();
				dname.clear();
				
			}
			
			
			
			
				if(event.getCurrentItem().getType() == Material.DIRT){
				event.getWhoClicked().closeInventory();
				
				if (!(troll.isEmpty())) {
					for (Player p :troll) {
						p.getInventory().clear();
						
						for (ItemStack i : event.getWhoClicked().getInventory().getContents()){
							if(i == null){
								event.getWhoClicked().getInventory().addItem(new ItemStack(Material.DIAMOND_HOE));
								
							}
						}
						event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você zuou o inventario do jogador: "+ChatColor.RED+""+dname);
					}
					
					
				}else{
					event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
					
				}
				troll.clear();
				dname.clear();
				
			}
			
			
			
				
					if(event.getCurrentItem().getType() == Material.LAVA_BUCKET){
					event.getWhoClicked().closeInventory();
					
					if (!(troll.isEmpty())) {
						for (Player p :troll) {
							
							
							
							p.getPlayer().getLocation().add(0, 1, 0).getBlock().setType(Material.LAVA);
						
						}
						event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você jogou lava no jogador: "+ChatColor.RED+""+dname);
						
					}else{
						event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
						
					}
					troll.clear();
					dname.clear();
					
				}	
				
			
			
					
					
					
						if(event.getCurrentItem().getType() == Material.ENDER_PEARL){
						event.getWhoClicked().closeInventory();
						
						if (!(troll.isEmpty())) {
							for (Player p :troll) {
								
								Location loc = p.getLocation().add(0, -256, 0);
							p.teleport(loc);
							}
							event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você teleportou para o void o jogador: "+ChatColor.RED+""+dname);
							
						}else{
							event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
							
						}
						troll.clear();
						dname.clear();
						
					}
			
			
						
						
						
						 if(event.getCurrentItem().getType() == Material.FEATHER){
							event.getWhoClicked().closeInventory();
							
							if (!(troll.isEmpty())) {
								for (Player p :troll) {
									p.teleport(p.getLocation().add(0, 256, 0));
								
								}
								event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você teleportou para o céu o jogador: "+ChatColor.RED+""+dname);
								
							}else{
								event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
								
							}
							troll.clear();
							dname.clear();
							
						}	
						
						
						
						 
						 
								if(event.getCurrentItem().getType() == Material.SKULL_ITEM){
								event.getWhoClicked().closeInventory();
								
								if (!(troll.isEmpty())) {
									for (Player p :troll) {
										
										
										org.bukkit.inventory.ItemStack item2 = new org.bukkit.inventory.ItemStack(Material.PUMPKIN, 1);
										
										p.getInventory().setHelmet(item2);
										p.getPlayer().playSound(p.getLocation(), Sound.GHAST_SCREAM, 1, 2);
										p.getPlayer().playSound(p.getLocation(), Sound.AMBIENCE_THUNDER, 1, 2);
										p.getPlayer().playSound(p.getLocation(), Sound.VILLAGER_DEATH, 1, (float) 0.1);
										p.getLocation().getWorld().strikeLightning(p.getLocation());
										
										Timer yourtimer = new Timer(true); 
										yourtimer.schedule(new TimerTask()
										{
										    @Override
										    public void run()
										    {
										        p.getInventory().setHelmet(null);
										    }
										}, 500);
										
										Timer yourtimer2 = new Timer(true); 
										yourtimer2.schedule(new TimerTask()
										{
										    @Override
										    public void run()
										    {
										    	p.getPlayer().playSound(p.getLocation(), Sound.GHAST_SCREAM2, 1, 2);
												p.getPlayer().playSound(p.getLocation(), Sound.AMBIENCE_THUNDER, 1, 2);
												p.getPlayer().playSound(p.getLocation(), Sound.VILLAGER_DEATH, 1, (float) 0.1);
												p.getLocation().getWorld().strikeLightning(p.getLocation());
										    }
										}, 600);
										
										
									}
									event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você assustou o jogador: "+ChatColor.RED+""+dname);
									
								}else{
									event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
									
								}
								troll.clear();
								dname.clear();
								
							}
						 
								
								
								
						 
						 
									if(event.getCurrentItem().getType() == Material.ARMOR_STAND){
									event.getWhoClicked().closeInventory();
									
									if (!(troll.isEmpty())) {
										for (Player p :troll) {
											
										p.sendMessage(ChatColor.GRAY+"[Server: Opped "+dname);
										event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você mandou a menssagem de op para o jogador: "+ChatColor.RED+""+dname);
											
										}
										
										
									}else{
									event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
										
									}
									troll.clear();
									dname.clear();
									
								}
								
								
								if(event.getCurrentItem().getType() == Material.ROTTEN_FLESH){
										event.getWhoClicked().closeInventory();
										
										if (!(troll.isEmpty())) {
											for (Player p :troll) {
												
												
												Timer yourtimer2 = new Timer(true); 
												yourtimer2.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 100);
												
												Timer yourtimer3 = new Timer(true); 
												yourtimer3.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 200);
												
												Timer yourtimer4 = new Timer(true); 
												yourtimer4.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 300);
												
												Timer yourtimer5 = new Timer(true); 
												yourtimer5.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 400);
												
												Timer yourtimer6 = new Timer(true); 
												yourtimer6.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 500);
												
												
												Timer yourtimer7 = new Timer(true); 
												yourtimer7.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 600);
												
												
												
												Timer yourtimer8 = new Timer(true); 
												yourtimer8.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 700);
												
												Timer yourtimer10 = new Timer(true); 
												yourtimer10.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 800);
												
												Timer yourtimer11 = new Timer(true); 
												yourtimer11.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 900);
												
												
												Timer yourtimer12 = new Timer(true); 
												yourtimer12.schedule(new TimerTask()
												{
												    @Override
												    public void run()
												    {
												    	p.setFoodLevel(p.getFoodLevel() - 2);
												    	
												    	
												    	
												    }
												}, 1000);
												
												event.getWhoClicked().sendMessage(ChatColor.GREEN+"Você deixou com fome o jogador: "+ChatColor.RED+""+dname);
												
											}
											
											
										}else{
											event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
											
										}
										troll.clear();
										dname.clear();
										
									}
									
									
									
									
									
						 
						
									
									
									
									
									
									
									
									
									
									
									
								
								
								
						
			
				
				
				
				
				
				
				
				
			//	if(event.getCurrentItem().getType() == Material.ICE){
				//	event.getWhoClicked().closeInventory();
					
				//	if (!(troll.isEmpty())) {
				//		for (Player p :troll) {
							
						
				//		}
						
						
				//	}else{
				//		event.getWhoClicked().sendMessage(ChatColor.RED+"O jogador que você estava tentando trollar saiu do server!");
						
				//	}
				//	troll.clear();
				//	dname.clear();
					
				//}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@EventHandler
	public void inv(InventoryCloseEvent event){
		if(event.getInventory().getName().equals("Troll")){
		troll.clear();
		dname.clear();
		}
		
		
	}
	
	
	
	
	
	
	
	
	@EventHandler
	public void mover(PlayerMoveEvent event){
		for (Player p :ice){
			p.sendMessage(ChatColor.BLUE+"Você está congelado!");
			Location loc = p.getLocation().getBlock().getLocation().add(0,0,0);
			loc.add(0.5 ,0 ,0.5);
			p.teleport(loc);
		}
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
}
