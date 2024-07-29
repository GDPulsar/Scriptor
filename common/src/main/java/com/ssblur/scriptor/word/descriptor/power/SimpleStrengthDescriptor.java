package com.ssblur.scriptor.word.descriptor.power;

import com.ssblur.scriptor.api.word.Descriptor;

public class SimpleStrengthDescriptor extends Descriptor implements StrengthDescriptor {
  Cost cost;
  double strength;
  boolean allowDuplication = false;

  public SimpleStrengthDescriptor(double cost, double strength) {
    this.cost = new Cost(cost, COSTTYPE.MULTIPLICATIVE);
    this.strength = strength;
  }

  @Override
  public Cost cost() {
    return cost;
  }

  @Override
  public double strengthModifier() {
    return strength;
  }

  public SimpleStrengthDescriptor allowDuplication() {
    allowDuplication = true;
    return this;
  }

  @Override
  public boolean allowsDuplicates() {
    return allowDuplication;
  }
}
