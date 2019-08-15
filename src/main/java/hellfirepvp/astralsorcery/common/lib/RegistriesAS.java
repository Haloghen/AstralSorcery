/*******************************************************************************
 * HellFirePvP / Astral Sorcery 2019
 *
 * All rights reserved.
 * The source code is available on github: https://github.com/HellFirePvP/AstralSorcery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.astralsorcery.common.lib;

import hellfirepvp.astralsorcery.AstralSorcery;
import hellfirepvp.astralsorcery.common.constellation.IConstellation;
import hellfirepvp.astralsorcery.common.constellation.effect.ConstellationEffectProvider;
import hellfirepvp.astralsorcery.common.perk.AbstractPerk;
import hellfirepvp.astralsorcery.common.data.fragment.KnowledgeFragment;
import hellfirepvp.astralsorcery.common.perk.reader.PerkAttributeReader;
import hellfirepvp.astralsorcery.common.perk.type.PerkAttributeType;
import hellfirepvp.astralsorcery.common.structure.types.StructureType;
import hellfirepvp.astralsorcery.common.util.sextant.TargetObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: RegistriesAS
 * Created by HellFirePvP
 * Date: 02.06.2019 / 09:17
 */
public class RegistriesAS {

    private RegistriesAS() {}

    public static final ResourceLocation REGISTRY_NAME_CONSTELLATIONS = new ResourceLocation(AstralSorcery.MODID, "constellations");
    public static final ResourceLocation REGISTRY_NAME_PERKS = new ResourceLocation(AstralSorcery.MODID, "perks");
    public static final ResourceLocation REGISTRY_NAME_SEXTANT_TARGETS = new ResourceLocation(AstralSorcery.MODID, "sextant_targets");
    public static final ResourceLocation REGISTRY_NAME_CONSTELLATION_EFFECTS = new ResourceLocation(AstralSorcery.MODID, "constellation_effect");
    public static final ResourceLocation REGISTRY_NAME_STRUCTURE_TYPES = new ResourceLocation(AstralSorcery.MODID, "structure_types");
    public static final ResourceLocation REGISTRY_NAME_KNOWLEDGE_FRAGMENTS = new ResourceLocation(AstralSorcery.MODID, "knowledge_fragments");
    public static final ResourceLocation REGISTRY_NAME_PERK_ATTRIBUTE_TYPES = new ResourceLocation(AstralSorcery.MODID, "perk_attribute_types");
    public static final ResourceLocation REGISTRY_NAME_PERK_ATTRIBUTE_READERS = new ResourceLocation(AstralSorcery.MODID, "perk_attribute_readers");

    public static IForgeRegistry<ConstellationEffectProvider> REGISTRY_CONSTELLATION_EFFECT;
    public static IForgeRegistry<IConstellation> REGISTRY_CONSTELLATIONS;
    public static IForgeRegistryModifiable<AbstractPerk> REGISTRY_PERKS;
    public static IForgeRegistry<TargetObject> REGISTRY_SEXTANT_TARGET;
    public static IForgeRegistry<StructureType> REGISTRY_STRUCTURE_TYPES;
    public static IForgeRegistry<KnowledgeFragment> REGISTRY_KNOWLEDGE_FRAGMENTS;
    public static IForgeRegistry<PerkAttributeType> REGISTRY_PERK_ATTRIBUTE_TYPES;
    public static IForgeRegistry<PerkAttributeReader> REGISTRY_PERK_ATTRIBUTE_READERS;

}