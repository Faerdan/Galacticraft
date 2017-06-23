package micdoodle8.mods.galacticraft.api.tile;

/**
 * For tiles which consume oxygen
 */
public interface ITileEntityOxygenConsumer
{
    /**
     * Returns how much this machine is consuming, per tick
     *
     */
    public float getPerTickOxygenConsumption();
}
