package flamearcade.techreborn;

import flamearcade.techreborn.proxy.CommonProxy;
import flamearcade.techreborn.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, useMetadata = true)
public class TechReborn {
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	
	public static final CreativeTabs CTAB = new CreativeTabs("trtab") { 
	    @Override
	    public ItemStack getTabIconItem() // Set the creative tab icon as a furnace(TEMPORARY)
	    {
	        return new ItemStack(Item.getItemFromBlock(Blocks.FURNACE));
	    }
	    
	    @Override
		public boolean hasSearchBar() { // Enabled the search bar for a tab
			return true;
		}
	}.setBackgroundImageName("item_search.png");
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
