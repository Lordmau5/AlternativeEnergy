package jkmau5.alternativeenergy;

/*public class AlternativeEnergyJ {

    private static String[] invalidTiles_Classes = {"TileEntityTeleporter", "TileCapacitorBank", "TileConduitBundle", "PipeTile"};

    private static String[] validTiles_Classes = {"TileEntityCompactSolar"};
    private static String[] validTiles_Superclasses = {"TileEntityCompactSolar"};
    public static boolean isInvalidPowerTile(TileEntity tile) {
        Class iClass = tile.getClass();

        for(String cClass : invalidTiles_Classes) {
            if(iClass.getSimpleName().equalsIgnoreCase(cClass))
                return true;
        }
        return false;
    }

    public static boolean checkForModTile(TileEntity tile) {
        if(BCSupplied) {
            if(tile instanceof IPipeTile)
                return false;

            if(tile instanceof IPowerReceptor)
                return true;
        }
        if(ICSupplied) {
            if(tile instanceof IEnergyConductor)
                return false;

            if(tile instanceof IEnergySink || tile instanceof IEnergyStorage || tile instanceof IEnergySource)
                return true;
        }

        return false;
    }

    public static boolean isValidPowerTile(TileEntity tile) {

        if(isInvalidPowerTile(tile))
            return false;
        //---------------------------------------------------------------------------
        Class iClass = tile.getClass();

        for(String cClass : validTiles_Classes) {
            if(iClass.getSimpleName().equalsIgnoreCase(cClass))
                return true;
        }

        Class superClass = iClass.getSuperclass();
        for(String sClass : validTiles_Superclasses) {
            if(superClass.getSimpleName().equalsIgnoreCase(sClass))
                return true;
        }

        if(checkForModTile(tile))
            return true;

        return false;
    }
}*/