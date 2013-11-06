package lordmau5.powerboxes.proxy;

import lordmau5.powerboxes.client.gui.GUI_LinkBox;
import lordmau5.powerboxes.client.gui.GUI_PowerBox;
import lordmau5.powerboxes.client.render.BlockPowerCableRender;
import lordmau5.powerboxes.client.render.Render;
import cpw.mods.fml.client.registry.RenderingRegistry;
import lordmau5.powerboxes.world.tileentity.TileEntityLinkBox;
import lordmau5.powerboxes.world.tileentity.TileEntityPowerBox;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Author: Lordmau5
 * Date: 28.10.13
 * Time: 10:57
 * You are allowed to change this code,
 * however, not to publish it without my permission.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRendering(){
        Render.RENDER_BLOCKPOWERCABLE = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(Render.RENDER_BLOCKPOWERCABLE, new BlockPowerCableRender());
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if(ID == ID_GUI_PowerBox)
            if(tileEntity instanceof TileEntityPowerBox)
                return new GUI_PowerBox(player.inventory, (TileEntityPowerBox) tileEntity);
        if(ID == ID_GUI_LinkBox)
            if(tileEntity instanceof TileEntityLinkBox)
                return new GUI_LinkBox(player.inventory, (TileEntityLinkBox) tileEntity);
        return null;
    }
}
