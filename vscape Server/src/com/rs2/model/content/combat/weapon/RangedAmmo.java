package com.rs2.model.content.combat.weapon;

import com.rs2.Constants;
import com.rs2.model.content.combat.CombatManager;
import com.rs2.model.players.Player;
import com.rs2.model.players.item.Item;
import com.rs2.model.players.item.ItemDefinition;

/**
 *
 */
public enum RangedAmmo {

	/* Arrows */
	BRONZE_ARROW(10, 19, 7), IRON_ARROW(9, 18, 10), STEEL_ARROW(11, 20, 16), MITHRIL_ARROW(12, 21, 22), ADAMANT_ARROW(13, 22, 31), RUNE_ARROW(15, 24, 49), DRAGON_ARROW(1120, 1116, 60),
	
	ICE_ARROWS(16, 25, 16),
	
	MONKEY_ARROW(9, 18, 10),

	BRONZE_BRUTAL(15, 24, 11), IRON_BRUTAL(9, 18, 13), STEEL_BRUTAL(11, 20, 19), MITHRIL_BRUTAL(12, 21, 34), ADAMANT_BRUTAL(13, 22, 45), RUNE_BRUTAL(15, 24, 60),

	BRONZE_FIRE_ARROWS(17, 26, 7), IRON_FIRE_ARROWS(17, 26, 10), STEEL_FIRE_ARROWS(17, 26, 16), MITHRIL_FIRE_ARROWS(17, 26, 22), ADAMANT_FIRE_ARROWS(17, 26, 31), RUNE_FIRE_ARROWS(17, 26, 49), DRAGON_FIRE_ARROWS(1115, 26, 60),
	
	OGRE_ARROW(242, 243, 22),

	BROAD_ARROW(326, 325, 28),
	
	CRYSTAL_ARROW(249, 250, 65),

	/* Throwing knives */
	BRONZE_KNIFE(212, 219, 3), IRON_KNIFE(213, 220, 4), STEEL_KNIFE(214, 221, 7), BLACK_KNIFE(215, 222, 8), MITHRIL_KNIFE(216, 223, 10), ADAMANT_KNIFE(217, 224, 14), RUNE_KNIFE(218, 225, 24),

	/* Throwing axes */
	BRONZE_THROWNAXE(35, 43, 5), IRON_THROWNAXE(36, 42, 7), STEEL_THROWNAXE(37, 44, 11), MITHRIL_THROWNAXE(38, 45, 16), ADAMANT_THROWNAXE(39, 46, 23), RUNE_THROWNAXE(41, 48, 26),

	/* Throwing darts */
	BRONZE_DART(226, 232, 31), IRON_DART(227, 233, 3), STEEL_DART(228, 234, 4), BLACK_DART(34, 273, 6), MITHRIL_DART(229, 235, 7), ADAMANT_DART(230, 236, 10), RUNE_DART(231, 237, 14), DRAGON_DART(1122, 1123, 30),

	/* Throwing javelins */
	BRONZE_JAVELIN(200, 206, 6), IRON_JAVELIN(201, 207, 10), STEEL_JAVELIN(202, 208, 12), MITHRIL_JAVELIN(203, 209, 18), ADAMANT_JAVELIN(204, 210, 28), RUNE_JAVELIN(205, 211, 42),

	/* Karils bolt racks */
	BOLT_RACK(27, 28, 55),

	/* Crossbow Bolts */
	BOLTS(27, 28, 10), BARBED_BOLTS(27, 28, 12), 
	
	OPAL_BOLTS(27, 28, 14), JADE_BOLTS(27, 28, 30), PEARL_BOLTS(27, 28, 48), TOPAZ_BOLTS(27, 28, 66), SAPPHIRE_BOLTS(27, 28, 83), EMERALD_BOLTS(27, 28, 85), RUBY_BOLTS(27, 28, 103),
	DIAMOND_BOLTS(27, 28, 105), DRAGON_BOLTS(27, 28, 117), ONYX_BOLTS(27, 28, 120),
	BRONZE_BOLTS(27, 28, 10), BLURITE_BOLTS(27, 28, 28), IRON_BOLTS(27, 28, 46), STEEL_BOLTS(27, 28, 64), BLACK_BOLTS(27, 28, 75), MITHRIL_BOLTS(27, 28, 82), ADAMANT_BOLTS(27, 28, 100), RUNITE_BOLTS(27, 28, 115),
	
	/* Obby rings */
	TOKTZ(442, -1, 49);

	static RangedAmmo[] BOLT_AMMO = {BARBED_BOLTS, BRONZE_BOLTS, BLURITE_BOLTS, IRON_BOLTS, STEEL_BOLTS, BLACK_BOLTS, MITHRIL_BOLTS, ADAMANT_BOLTS, RUNITE_BOLTS, OPAL_BOLTS, JADE_BOLTS, PEARL_BOLTS, TOPAZ_BOLTS, SAPPHIRE_BOLTS, EMERALD_BOLTS, RUBY_BOLTS, DIAMOND_BOLTS, DRAGON_BOLTS, ONYX_BOLTS};
	static RangedAmmo[] ARROW_AMMO = {BRONZE_ARROW, IRON_ARROW, STEEL_ARROW, MITHRIL_ARROW, ADAMANT_ARROW, RUNE_ARROW, DRAGON_ARROW, ICE_ARROWS, BROAD_ARROW, BRONZE_FIRE_ARROWS, IRON_FIRE_ARROWS, STEEL_FIRE_ARROWS, MITHRIL_FIRE_ARROWS, ADAMANT_FIRE_ARROWS, RUNE_FIRE_ARROWS, DRAGON_FIRE_ARROWS};
	static RangedAmmo[] DARK_BOW_AMMO = {BRONZE_ARROW, IRON_ARROW, STEEL_ARROW, MITHRIL_ARROW, ADAMANT_ARROW, RUNE_ARROW, DRAGON_ARROW, ICE_ARROWS, BROAD_ARROW, BRONZE_FIRE_ARROWS, IRON_FIRE_ARROWS, STEEL_FIRE_ARROWS, MITHRIL_FIRE_ARROWS, ADAMANT_FIRE_ARROWS, RUNE_FIRE_ARROWS, DRAGON_FIRE_ARROWS};
	static RangedAmmo[] KNIFE_AMMO = {BRONZE_KNIFE, IRON_KNIFE, STEEL_KNIFE, BLACK_KNIFE, MITHRIL_KNIFE, ADAMANT_KNIFE, RUNE_KNIFE};
	static RangedAmmo[] DART_AMMO = {BRONZE_DART, IRON_DART, STEEL_DART, BLACK_DART, MITHRIL_DART, ADAMANT_DART, RUNE_DART, DRAGON_DART};
	static RangedAmmo[] BRUTAL_AMMO = {BRONZE_BRUTAL, IRON_BRUTAL, STEEL_BRUTAL, MITHRIL_BRUTAL, ADAMANT_BRUTAL, RUNE_BRUTAL};
	static RangedAmmo[] THROWNAXE_AMMO = {BRONZE_THROWNAXE, IRON_THROWNAXE, STEEL_THROWNAXE, MITHRIL_THROWNAXE, ADAMANT_THROWNAXE, RUNE_THROWNAXE};
	static RangedAmmo[] JAVELIN_AMMO = {BRONZE_JAVELIN, IRON_JAVELIN, STEEL_JAVELIN, MITHRIL_JAVELIN, ADAMANT_JAVELIN, RUNE_JAVELIN};

	private final int projectileId, graphicId, rangeStrength;

	RangedAmmo(int projectileId, int graphicId, int rangeStrength) {
		this.graphicId = graphicId;
		this.projectileId = projectileId;
		this.rangeStrength = rangeStrength;
	}

	public int getRangeStrength() {
		return rangeStrength;
	}

	public int getProjectileId() {
		return projectileId;
	}

	public int getGraphicId() {
		return graphicId;
	}
	
	public static RangedAmmo getArrowForEquipped(int equipped) {
		switch(equipped) {
		    case 882:
			return BRONZE_ARROW;
		    case 884:
			return IRON_ARROW;
		    case 886:
			return STEEL_ARROW;
		    case 888:
			return MITHRIL_ARROW;
		    case 890:
			return ADAMANT_ARROW;
		    case 892:
			return RUNE_ARROW;
		    case 877:
			return BRONZE_BOLTS;
		    case 9140:
			return IRON_BOLTS;
		    case 9141:
			return STEEL_BOLTS;
		    case 9142:
			return MITHRIL_BOLTS;
		    case 9143:
			return ADAMANT_BOLTS;
		    case 9144:
			return RUNITE_BOLTS;
		    default:
			return null;
		}
	}
	
	public static int getDarkBowPullGfx(RangedAmmo rangedAmmo) {
		if (rangedAmmo.getGraphicId() == 26) {
			return 1113;
		}
		switch(rangedAmmo.getProjectileId()) {
			case 10: //bronze
				return 1104;
			case 9: //iron
				return 1105;
			case 11: //steel
				return 1106;
			case 12: //mithril
				return 1107;
			case 13: //adamant
				return 1108;
			case 15: //rune
				return 1109;
			case 16: //ice
				return 1110;
			case 1120: //dragon
				return 1111;
			case 326: //broad
				return 1112;
		}
		return 0;
	}
	
	public enum FireArrowData {
		BRONZE(882, 598, 942),
		IRON(884, 2532, 2533),
		STEEL(886, 2534, 2535),
		MITHRIL(888, 2536, 2537),
		ADAMANT(890, 2538, 2539),
		RUNE(892, 2540, 2541),
		DRAGON(11212, 11217, 11222);
		
		private int originalId;
		private int dampId;
		private int litId;
		FireArrowData(int originalId, int dampId, int litId) {
			this.originalId = originalId;
			this.dampId = dampId;
			this.litId = litId;
		}
		
		public static int dampIdForOriginalId(int id) {
			for(FireArrowData f : FireArrowData.values()) {
				if(f.getOriginalId() == id)
					return f.getDampId();
			}
			return -1;
		}
		
		public static int litIdForDampId(int id) {
			for(FireArrowData f : FireArrowData.values()) {
				if(f.getDampId() == id)
					return f.getLitId();
			}
			return -1;
		}
		
		public int getOriginalId() {
			return this.originalId;
		}
		
		public int getDampId() {
			return this.dampId;
		}
		
		public int getLitId() {
			return this.litId;
		}
		
	}

	public static RangedAmmo getRangedAmmo(Player player, Weapon weapon, boolean sendMessage) {
		RangedAmmoType ammoType = weapon.getAmmoType();
		if (ammoType == null) {
			player.getActionSender().sendMessage("That weapon is not configured properly, please report to staff!");
			return null;
		}
		int equipmentSlot = ammoType.getEquipmentSlot();
		Item ammoItem = player.getEquipment().getItemContainer().get(equipmentSlot);
		if (ammoItem == null) {
			if (sendMessage)
				player.getActionSender().sendMessage(CombatManager.NO_AMMO_MESSAGE);
			return null;
		}
		String ammoName = ItemDefinition.forId(ammoItem.getId()).getName().toLowerCase().replaceAll(" ", "_");
		RangedAmmo[] rangedAmmos = ammoType.getRangedAmmos();
		for (RangedAmmo ammo : rangedAmmos) {
			if(ammoName.contains("fire")) {
				if(ammoItem.getId() == 598 || ((ammoItem.getId()&1) == 0 && ammoItem.getId() != 11222 && ammoItem.getId() != 942) || ammoItem.getId() == 11217) {
					player.getDialogue().sendPlayerChat("These arrows are useless to fire without actually", "being on fire themselves.");
					return null;
				}
			}
			if (ammoName.contains(ammo.name().toLowerCase())) {
				if (equipmentSlot != Constants.WEAPON) {
					Item weaponItem = player.getEquipment().getItemContainer().get(Constants.WEAPON);
					if (weaponItem == null)
						return null;
					boolean wrongAmmo = true;
					if (ammoName.contains("ogre")) {
						String weaponName = player.getEquippedWeapon().name().toLowerCase();
						wrongAmmo = !weaponName.contains("ogre");
					} else {
						player.getEquipment().getRequirements(weaponItem.getId());
						int weaponRequiredLevel = player.getEquipment().getRangeLevelReq();
						player.getEquipment().getRequirements(ammoItem.getId());
						int ammoRequiredLevel = player.getEquipment().getRangeLevelReq();
						wrongAmmo = ammoRequiredLevel > weaponRequiredLevel;
					}
					if (wrongAmmo) {
						if (sendMessage)
							player.getActionSender().sendMessage(CombatManager.AMMO_COMPATIBILITY_MESSAGE);
						return null;
					}
				}
				return ammo;
			}
		}
		if (sendMessage)
			player.getActionSender().sendMessage(CombatManager.WRONG_AMMO_MESSAGE);
		return null;
	}

}
