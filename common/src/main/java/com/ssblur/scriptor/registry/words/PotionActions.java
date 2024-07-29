package com.ssblur.scriptor.registry.words;

import com.ssblur.scriptor.api.word.Action;
import com.ssblur.scriptor.api.word.Word;
import com.ssblur.scriptor.word.action.potions.*;
import net.minecraft.world.effect.MobEffects;

public class PotionActions {
  private static final WordRegistry INSTANCE = WordRegistry.INSTANCE;

  public final Action POISON_POTION = INSTANCE.register("poison",
    new PotionAction(MobEffects.POISON, 30, 3d/4d, 3, new Word.Cost(8, Word.COSTTYPE.ADDITIVE)));
  public final Action SLOW_POTION = INSTANCE.register("slow",
    new PotionAction(MobEffects.MOVEMENT_SLOWDOWN, 40, 1, 5, new Word.Cost(6, Word.COSTTYPE.ADDITIVE)));
  public final Action REGENERATION_POTION = INSTANCE.register("regeneration",
    new PotionAction(MobEffects.REGENERATION, 15, 3d/4d, 2, new Word.Cost(8, Word.COSTTYPE.ADDITIVE)));
  public final Action WITHER_POTION = INSTANCE.register("wither", new WitherAction());
  public final Action SPEED_POTION = INSTANCE.register("speed",
    new PotionAction(MobEffects.MOVEMENT_SPEED, 40, 1d, 5, new Word.Cost(6, Word.COSTTYPE.ADDITIVE)));
  public final Action HASTE_POTION = INSTANCE.register("haste",
    new PotionAction(MobEffects.DIG_SPEED, 25, 1d, 2, new Word.Cost(8, Word.COSTTYPE.ADDITIVE)));
  public final Action STRENGTH_POTION = INSTANCE.register("strength", new StrengthAction());
  public final Action JUMP_BOOST_POTION = INSTANCE.register("jump_boost",
    new PotionAction(MobEffects.JUMP, 30, 1d, 5, new Word.Cost(9, Word.COSTTYPE.ADDITIVE)));
  public final Action RESISTANCE_POTION = INSTANCE.register("resistance",
    new PotionAction(MobEffects.DAMAGE_RESISTANCE, 25, 1d/2d, 3, new Word.Cost(8, Word.COSTTYPE.ADDITIVE)));
  public final Action FIRE_RESISTANCE_POTION = INSTANCE.register("fire_resistance",
    new PotionAction(MobEffects.FIRE_RESISTANCE, 15, 1, 0, new Word.Cost(10, Word.COSTTYPE.ADDITIVE)));
  public final Action WATER_BREATHING_POTION = INSTANCE.register("water_breathing",
    new PotionAction(MobEffects.WATER_BREATHING, 40, 1, 0, new Word.Cost(6, Word.COSTTYPE.ADDITIVE)));
  public final Action NIGHT_VISION_POTION = INSTANCE.register("night_vision",
    new PotionAction(MobEffects.NIGHT_VISION, 40, 1, 0, new Word.Cost(6, Word.COSTTYPE.ADDITIVE)));
  public final Action WEAKNESS_POTION = INSTANCE.register("weakness",
    new PotionAction(MobEffects.WEAKNESS, 25, 1d/2d, 3, new Word.Cost(6, Word.COSTTYPE.ADDITIVE)));
  public final Action PHASING_POTION = INSTANCE.register("phasing", new PhasingAction());
  public final Action WILD_PHASING_POTION = INSTANCE.register("wild_phasing", new WildPhasingAction());

}
