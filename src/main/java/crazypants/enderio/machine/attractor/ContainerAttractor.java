package crazypants.enderio.machine.attractor;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import crazypants.enderio.machine.AbstractMachineContainer;
import crazypants.enderio.machine.AbstractMachineEntity;

public class ContainerAttractor extends AbstractMachineContainer {

  public ContainerAttractor(InventoryPlayer playerInv, AbstractMachineEntity te) {
    super(playerInv, te);
  }

  @Override
  protected void addMachineSlots(InventoryPlayer playerInv) {
    int x;
    int y = 10;    
    for (int row = 0; row < 3; row++) {
      x = 62;
      for (int col = 0; col < 4; col++) {
        final int index = (row * 4) + col;
        addSlotToContainer(new Slot(tileEntity, index, x, y) {
          @Override
          public boolean isItemValid(ItemStack itemStack) {
            return tileEntity.isItemValidForSlot(index, itemStack);
          }
        });
        x += 18;
      }
      y+= 18;
    }
  }

}
