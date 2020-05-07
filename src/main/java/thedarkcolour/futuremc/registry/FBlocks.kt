package thedarkcolour.futuremc.registry

import net.minecraft.block.Block
import net.minecraft.block.SoundType
import net.minecraft.block.material.MapColor
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.registries.IForgeRegistry
import thedarkcolour.core.block.FBlock
import thedarkcolour.core.block.FBlock.Properties
import thedarkcolour.core.gui.Gui
import thedarkcolour.futuremc.block.*
import thedarkcolour.futuremc.block.netherupdate.ChainBlock
import thedarkcolour.futuremc.block.netherupdate.NyliumBlock
import thedarkcolour.futuremc.config.FConfig
import thedarkcolour.futuremc.tile.*

// todo add properties for everything
@Suppress("MemberVisibilityCanBePrivate")
object FBlocks {
    val STRIPPED_ACACIA_LOG = BlockStrippedLog("acacia")
    val STRIPPED_JUNGLE_LOG = BlockStrippedLog("jungle")
    val STRIPPED_BIRCH_LOG = BlockStrippedLog("birch")
    val STRIPPED_OAK_LOG = BlockStrippedLog("oak")
    val STRIPPED_SPRUCE_LOG = BlockStrippedLog("spruce")
    val STRIPPED_DARK_OAK_LOG = BlockStrippedLog("dark_oak")

    val LANTERN = LanternBlock(Properties(Material.IRON, "lantern").hardnessAndResistance(3.5f).sound(FSounds.LANTERN).light(15).group(CreativeTabs.DECORATIONS))
    val STONECUTTER = StonecutterBlock(Properties(Material.ROCK, "stonecutter").hardnessAndResistance(3.5f).group(CreativeTabs.DECORATIONS))
    val BARREL = BarrelBlock(Properties(Material.WOOD, "barrel").sound(SoundType.WOOD).hardnessAndResistance(2.5f).group(CreativeTabs.DECORATIONS))
    val SMOKER = BlockFurnaceAdvanced(BlockFurnaceAdvanced.FurnaceType.SMOKER, Properties(Material.ROCK, "smoker").group(CreativeTabs.DECORATIONS))
    val BLAST_FURNACE = BlockFurnaceAdvanced(BlockFurnaceAdvanced.FurnaceType.BLAST_FURNACE, Properties(Material.ROCK, "blast_furnace").group(CreativeTabs.DECORATIONS))
    val LOOM = VillageStationBlock(Properties(Material.WOOD, "loom"), Gui.LOOM, FConfig.villageAndPillage.loom.functionality)
    val FLETCHING_TABLE = VillageStationBlock(Properties(Material.WOOD, "fletching_table"), null, false)
    val SMITHING_TABLE = VillageStationBlock(Properties(Material.WOOD, "smithing_table"), null, FConfig.villageAndPillage.smithingTable.functionality)
    val CARTOGRAPHY_TABLE = VillageStationBlock(Properties(Material.WOOD, "cartography_table"), null, FConfig.villageAndPillage.cartographyTable.functionality)
    val GRINDSTONE = BlockGrindstone(Properties(Material.ANVIL, "grindstone").color(MapColor.IRON).group(CreativeTabs.DECORATIONS).hardnessAndResistance(2.0F, 6.0F))
    val COMPOSTER = ComposterBlock(Properties(Material.WOOD, "composter").hardnessAndResistance(0.6F).sound(SoundType.WOOD))
    val HONEY_BLOCK = HoneyBlockBlock(Properties(Material.CLAY, "honey_block").color(MapColor.ADOBE).hardnessAndResistance(0.0f).sound(FSounds.HONEY_BLOCK))
    val HONEYCOMB_BLOCK = FBlock(Properties(Material.CLAY, "honeycomb_block").color(MapColor.ADOBE).hardnessAndResistance(0.6F).sound(FSounds.CORAL))
    val LILY_OF_THE_VALLEY = LilyOfTheValleyBlock()
    val CORNFLOWER = CornflowerBlock()
    val WITHER_ROSE = WitherRoseBlock()
    val SWEET_BERRY_BUSH = SweetBerryBushBlock()
    val CAMPFIRE = CampfireBlock(Properties(Material.WOOD, "campfire").color(MapColor.OBSIDIAN).hardnessAndResistance(2.0f).sound(SoundType.WOOD).light(15).tickRandomly())
    val BAMBOO = BlockBamboo(Properties(Material.PLANTS, "bamboo").sound(FSounds.BAMBOO).group(CreativeTabs.MISC).tickRandomly().hardnessAndResistance(1.0f))
    val BAMBOO_SAPLING = BlockBambooSapling(Properties(Material.WOOD, "bamboo_sapling").sound(FSounds.BAMBOO_SAPLING).tickRandomly().breakInstantly())
    val BEE_NEST = BeeHiveBlock(Properties(Material.WOOD, "bee_nest").hardnessAndResistance(0.3f).sound(SoundType.WOOD))
    val BEEHIVE = BeeHiveBlock(Properties(Material.WOOD, "beehive").hardnessAndResistance(0.6f).sound(SoundType.WOOD))
    val BRICK_WALL = BlockWall(Properties(Material.ROCK, "brick_wall").color(MapColor.RED).hardnessAndResistance(2.0f, 6.0f))
    val PRISMARINE_WALL = BlockWall(Properties(Material.ROCK, "prismarine_wall").color(MapColor.CYAN).hardnessAndResistance(1.5f, 6.0f))
    val RED_SANDSTONE_WALL = BlockWall(Properties(Material.ROCK, "red_sandstone_wall").color(MapColor.ADOBE).hardnessAndResistance(0.8f))
    val MOSSY_STONE_BRICK_WALL = BlockWall(Properties(Material.ROCK, "mossy_stone_brick_wall").hardnessAndResistance(1.5f, 6.0f))
    val GRANITE_WALL = BlockWall(Properties(Material.ROCK, "granite_wall").color(MapColor.DIRT).hardnessAndResistance(1.5f, 6.0f))
    val STONE_BRICK_WALL = BlockWall(Properties(Material.ROCK, "stone_brick_wall").hardnessAndResistance(1.5f, 6.0f))
    val NETHER_BRICK_WALL = BlockWall(Properties(Material.ROCK, "nether_brick_wall").color(MapColor.NETHERRACK).hardnessAndResistance(2.0f, 6.0f))
    val ANDESITE_WALL = BlockWall(Properties(Material.ROCK, "andesite_wall").color(MapColor.STONE).hardnessAndResistance(1.5f, 6.0f))
    val RED_NETHER_BRICK_WALL = BlockWall(Properties(Material.ROCK, "red_nether_brick_wall").color(MapColor.NETHERRACK).hardnessAndResistance(2.0f, 6.0f))
    val SANDSTONE_WALL = BlockWall(Properties(Material.ROCK, "sandstone_wall").color(MapColor.SAND).hardnessAndResistance(0.8f))
    val END_STONE_BRICK_WALL = BlockWall(Properties(Material.ROCK, "end_stone_brick_wall").color(MapColor.SAND).hardnessAndResistance(3.0f, 9.0f))
    val DIORITE_WALL = BlockWall(Properties(Material.ROCK, "diorite_wall").color(MapColor.QUARTZ).hardnessAndResistance(1.5f, 6.0f))
    val SMOOTH_STONE = FBlock(Properties(Material.ROCK, "smooth_stone").hardnessAndResistance(2.0f, 6.0f))
    val SMOOTH_SANDSTONE = FBlock(Properties(Material.ROCK, "smooth_sandstone").color(MapColor.SAND).hardnessAndResistance(2.0f, 6.0f))
    val SMOOTH_QUARTZ = FBlock(Properties(Material.ROCK, "smooth_quartz").color(MapColor.QUARTZ).hardnessAndResistance(2.0f, 6.0f))
    val SMOOTH_RED_SANDSTONE = FBlock(Properties(Material.ROCK, "smooth_red_sandstone").color(MapColor.ADOBE).hardnessAndResistance(2.0f, 6.0f))
    val BLUE_ICE = BlueIceBlock(Properties(Material.PACKED_ICE, "blue_ice").group(CreativeTabs.BUILDING_BLOCKS).slipperiness(0.989f).hardnessAndResistance(2.8f))
    val STRIPPED_ACACIA_WOOD = BlockWood("stripped_acacia_wood")
    val STRIPPED_JUNGLE_WOOD = BlockWood("stripped_jungle_wood")
    val STRIPPED_BIRCH_WOOD = BlockWood("stripped_birch_wood")
    val STRIPPED_OAK_WOOD = BlockWood("stripped_oak_wood")
    val STRIPPED_SPRUCE_WOOD = BlockWood("stripped_spruce_wood")
    val STRIPPED_DARK_OAK_WOOD = BlockWood("stripped_dark_oak_wood")
    val ACACIA_WOOD = BlockWood("acacia_wood")
    val JUNGLE_WOOD = BlockWood("jungle_wood")
    val BIRCH_WOOD = BlockWood("birch_wood")
    val OAK_WOOD = BlockWood("oak_wood")
    val SPRUCE_WOOD = BlockWood("spruce_wood")
    val DARK_OAK_WOOD = BlockWood("dark_oak_wood")
    val ACACIA_TRAPDOOR = BlockWoodTrapdoor("acacia_trapdoor")
    val JUNGLE_TRAPDOOR = BlockWoodTrapdoor("jungle_trapdoor")
    val BIRCH_TRAPDOOR = BlockWoodTrapdoor("birch_trapdoor")
    val SPRUCE_TRAPDOOR = BlockWoodTrapdoor("spruce_trapdoor")
    val DARK_OAK_TRAPDOOR = BlockWoodTrapdoor("dark_oak_trapdoor")

    val SOUL_FIRE_LANTERN = LanternBlock(Properties(Material.IRON, "soul_fire_lantern").hardnessAndResistance(3.5f).sound(FSounds.LANTERN).light(10))
    val SOUL_FIRE_TORCH = BlockSoulFireTorch()
    val SOUL_SOIL = FBlock(Properties(Material.GROUND, "soul_soil").group(CreativeTabs.BUILDING_BLOCKS).sound(FSounds.SOUL_SOIL))
    val CHAIN = ChainBlock(Properties(Material.IRON, "chain").hardnessAndResistance(5.0f, 6.0f))
    val WARPED_NYLIUM = NyliumBlock(Properties(Material.ROCK, "warped_nylium").color(MapColor.CYAN).hardnessAndResistance(1.0f).sound(FSounds.NYLIUM))
    val CRIMSON_NYLIUM = NyliumBlock(Properties(Material.ROCK, "crimson_nylium").color(MapColor.RED))
    val WARPED_WART_BLOCK = FBlock(Properties(Material.GRASS, "warped_wart_block").color(MapColor.CYAN))

    val SEAGRASS = BlockSeaGrass()
    val SEAGRASS_FLOWING = SEAGRASS.flowing

    val SCAFFOLDING = ScaffoldingBlock(Properties(Material.CIRCUITS, "scaffolding").sound(FSounds.SCAFFOLDING))
    val BELL = BlockBell(Properties(Material.IRON, "bell").hardnessAndResistance(5.0f).sound(SoundType.ANVIL))

    fun registerBlocks(blocks: IForgeRegistry<Block>) {
        if (FConfig.villageAndPillage.lantern)
            blocks.register(LANTERN)
        if (FConfig.villageAndPillage.stonecutter.enabled)
            blocks.register(STONECUTTER)
        if (FConfig.villageAndPillage.barrel)
            blocks.register(BARREL)
        if (FConfig.villageAndPillage.smoker)
            blocks.register(SMOKER)
        if (FConfig.villageAndPillage.blastFurnace)
            blocks.register(BLAST_FURNACE)
        if (FConfig.villageAndPillage.loom.enabled)
            blocks.register(LOOM)
        if (FConfig.villageAndPillage.fletchingTable)
            blocks.register(FLETCHING_TABLE)
        if (FConfig.villageAndPillage.smithingTable.enabled)
            blocks.register(SMITHING_TABLE)
        if (FConfig.villageAndPillage.cartographyTable.enabled)
            blocks.register(CARTOGRAPHY_TABLE)
        if (FConfig.villageAndPillage.grindstone.enabled)
            blocks.register(GRINDSTONE)
        if (FConfig.villageAndPillage.composter)
            blocks.register(COMPOSTER)
        if (FConfig.villageAndPillage.bell)
            blocks.register(BELL)
        //SCAFFOLDING = register(BlockScaffolding(), villageAndPillage.scaffolding)
        if (FConfig.buzzyBees.honeyBlock.enabled)
            blocks.register(HONEY_BLOCK)
        if (FConfig.buzzyBees.honeycombBlock)
            blocks.register(FBlock(Properties(Material.CLAY, "honeycomb_block").color(MapColor.ADOBE).sound(FSounds.CORAL).hardnessAndResistance(0.6f).group(CreativeTabs.DECORATIONS)))
        if (FConfig.villageAndPillage.lilyOfTheValley.enabled)
            blocks.register(LILY_OF_THE_VALLEY)
        if (FConfig.villageAndPillage.cornflower.enabled)
            blocks.register(CORNFLOWER)
        if (FConfig.villageAndPillage.witherRose.enabled)
            blocks.register(WITHER_ROSE)
        if (FConfig.villageAndPillage.sweetBerryBush.enabled)
            blocks.register(SWEET_BERRY_BUSH)
        if (FConfig.villageAndPillage.campfire.enabled)
            blocks.register(CAMPFIRE)
        if (FConfig.villageAndPillage.bamboo.enabled)
            blocks.register(BAMBOO)
        if (FConfig.villageAndPillage.bamboo.enabled)
            blocks.register(BAMBOO_SAPLING)
        if (FConfig.buzzyBees.bee.enabled)
            blocks.register(BEE_NEST)
        if (FConfig.buzzyBees.bee.enabled)
            blocks.register(BEEHIVE)
        if (FConfig.updateAquatic.strippedLogs.acacia)
            blocks.register(STRIPPED_ACACIA_LOG)
        if (FConfig.updateAquatic.strippedLogs.jungle)
            blocks.register(STRIPPED_JUNGLE_LOG)
        if (FConfig.updateAquatic.strippedLogs.birch)
            blocks.register(STRIPPED_BIRCH_LOG)
        if (FConfig.updateAquatic.strippedLogs.oak)
            blocks.register(STRIPPED_OAK_LOG)
        if (FConfig.updateAquatic.strippedLogs.spruce)
            blocks.register(STRIPPED_SPRUCE_LOG)
        if (FConfig.updateAquatic.strippedLogs.darkOak)
            blocks.register(STRIPPED_DARK_OAK_LOG)
        if (FConfig.villageAndPillage.newWalls.brick)
            blocks.register(BRICK_WALL) // register(BlockWall(Variant.BRICK),)
        if (FConfig.villageAndPillage.newWalls.granite)
            blocks.register(GRANITE_WALL) // register(BlockWall(Variant.GRANITE),)
        if (FConfig.villageAndPillage.newWalls.andesite)
            blocks.register(ANDESITE_WALL) // register(BlockWall(Variant.ANDESITE),)
        if (FConfig.villageAndPillage.newWalls.diorite)
            blocks.register(DIORITE_WALL) // register(BlockWall(Variant.DIORITE),)
        if (FConfig.villageAndPillage.newWalls.sandstone)
            blocks.register(SANDSTONE_WALL) // register(BlockWall(Variant.SANDSTONE),)
        if (FConfig.villageAndPillage.newWalls.redSandstone)
            blocks.register(RED_SANDSTONE_WALL) // register(BlockWall(Variant.RED_SANDSTONE),)
        if (FConfig.villageAndPillage.newWalls.stoneBrick)
            blocks.register(STONE_BRICK_WALL) // register(BlockWall(Variant.STONE_BRICK),)
        if (FConfig.villageAndPillage.newWalls.mossyStone)
            blocks.register(MOSSY_STONE_BRICK_WALL) // register(BlockWall(Variant.MOSSY_STONE),)
        if (FConfig.villageAndPillage.newWalls.netherBrick)
            blocks.register(NETHER_BRICK_WALL) // register(BlockWall(Variant.NETHER_BRICK),)
        if (FConfig.villageAndPillage.newWalls.redNetherBrick)
            blocks.register(RED_NETHER_BRICK_WALL) // register(BlockWall(Variant.RED_NETHER_BRICK),)
        if (FConfig.villageAndPillage.newWalls.endStoneBrick)
            blocks.register(END_STONE_BRICK_WALL) // register(BlockWall(Variant.END_STONE),)
        if (FConfig.villageAndPillage.newWalls.prismarine)
            blocks.register(PRISMARINE_WALL) // register(BlockWall(Variant.PRISMARINE),)
        if (FConfig.villageAndPillage.smoothStone)
            blocks.register(SMOOTH_STONE) // register(FBlock("smooth_stone").setHardness(2.0F).setCreativeTab(if (FConfig.useVanillaCreativeTabs) CreativeTabs.BUILDING_BLOCKS else FutureMC.TAB),)
        if (FConfig.villageAndPillage.smoothSandstone)
            blocks.register(SMOOTH_SANDSTONE)
        if (FConfig.villageAndPillage.smoothQuartz)
            blocks.register(SMOOTH_QUARTZ) // register(FBlock("smooth_quartz").setHardness(2.0F).setCreativeTab(if (FConfig.useVanillaCreativeTabs) CreativeTabs.BUILDING_BLOCKS else FutureMC.TAB),)
        if (FConfig.villageAndPillage.smoothRedSandstone)
            blocks.register(SMOOTH_RED_SANDSTONE)
        if (FConfig.updateAquatic.blueIce)
            blocks.register(BLUE_ICE)
        if (FConfig.updateAquatic.wood.strippedAcacia)
            blocks.register(STRIPPED_ACACIA_WOOD) // register(BlockWood("stripped_acacia_wood"),)
        if (FConfig.updateAquatic.wood.strippedJungle)
            blocks.register(STRIPPED_JUNGLE_WOOD) // register(BlockWood("stripped_jungle_wood"),)
        if (FConfig.updateAquatic.wood.strippedBirch)
            blocks.register(STRIPPED_BIRCH_WOOD) // register(BlockWood("stripped_birch_wood"),)
        if (FConfig.updateAquatic.wood.strippedOak)
            blocks.register(STRIPPED_OAK_WOOD) // register(BlockWood("stripped_oak_wood"),)
        if (FConfig.updateAquatic.wood.strippedSpruce)
            blocks.register(STRIPPED_SPRUCE_WOOD) // register(BlockWood("stripped_spruce_wood"),)
        if (FConfig.updateAquatic.wood.strippedDarkOak)
            blocks.register(STRIPPED_DARK_OAK_WOOD) // register(BlockWood("stripped_dark_oak_wood"),)
        if (FConfig.updateAquatic.wood.acacia)
            blocks.register(ACACIA_WOOD) // register(BlockWood("acacia_wood"),)
        if (FConfig.updateAquatic.wood.jungle)
            blocks.register(JUNGLE_WOOD) // register(BlockWood("jungle_wood"),)
        if (FConfig.updateAquatic.wood.birch)
            blocks.register(BIRCH_WOOD) // register(BlockWood("birch_wood"),)
        if (FConfig.updateAquatic.wood.oak)
            blocks.register(OAK_WOOD) // register(BlockWood("oak_wood"),)
        if (FConfig.updateAquatic.wood.spruce)
            blocks.register(SPRUCE_WOOD) // register(BlockWood("spruce_wood"),)
        if (FConfig.updateAquatic.wood.darkOak)
            blocks.register(DARK_OAK_WOOD) // register(BlockWood("dark_oak_wood"),)
        if (FConfig.villageAndPillage.newTrapdoors.acacia)
            blocks.register(ACACIA_TRAPDOOR) // register(BlockWoodTrapdoor("acacia_trapdoor"),)
        if (FConfig.villageAndPillage.newTrapdoors.jungle)
            blocks.register(JUNGLE_TRAPDOOR) // register(BlockWoodTrapdoor("jungle_trapdoor"),)
        if (FConfig.villageAndPillage.newTrapdoors.birch)
            blocks.register(BIRCH_TRAPDOOR) // register(BlockWoodTrapdoor("birch_trapdoor"),)
        if (FConfig.villageAndPillage.newTrapdoors.spruce)
            blocks.register(SPRUCE_TRAPDOOR) // register(BlockWoodTrapdoor("spruce_trapdoor"),)
        if (FConfig.villageAndPillage.newTrapdoors.darkOak)
            blocks.register(DARK_OAK_TRAPDOOR) // register(BlockWoodTrapdoor("dark_oak_trapdoor"),)

        if (FConfig.netherUpdate.soulFireLantern)
            blocks.register(SOUL_FIRE_LANTERN)
        if (FConfig.netherUpdate.soulFireTorch)
            blocks.register(SOUL_FIRE_TORCH)
        if (FConfig.netherUpdate.soulSoil)
            blocks.register(SOUL_SOIL)
        if (FConfig.netherUpdate.chain)
            blocks.register(CHAIN)
        //SEAGRASS = register(BlockSeaGrass(), FConfig.updateAquatic.seagrass) {
        //    register(it.flowing)
        //}

        registerTE("futuremc:barrel", TileBarrel::class.java, FConfig.villageAndPillage.barrel)
        registerTE("futuremc:blast_furnace", TileFurnaceAdvanced.TileBlastFurnace::class.java, FConfig.villageAndPillage.blastFurnace)
        registerTE("futuremc:beehive", BeeHiveTile::class.java, FConfig.buzzyBees.bee.enabled)
        registerTE("futuremc:bell", BellTileEntity::class.java, FConfig.villageAndPillage.bell)
        registerTE("futuremc:smoker", TileFurnaceAdvanced.TileSmoker::class.java, FConfig.villageAndPillage.smoker)
        registerTE("futuremc:composter", TileComposter::class.java, FConfig.villageAndPillage.composter)
        registerTE("futuremc:campfire", CampfireTile::class.java, FConfig.villageAndPillage.campfire.enabled)

        //registerTE("futuremc:water_renderer", TileSeagrassRenderer::class.java, FConfig.updateAquatic.seagrass)
    }
}