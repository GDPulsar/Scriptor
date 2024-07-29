package com.ssblur.scriptor.word.descriptor.duration;

import com.ssblur.scriptor.api.word.Descriptor;

public class SimpleDurationDescriptor extends Descriptor implements DurationDescriptor {
  Cost cost;
  double duration;
  boolean duplicates;

  public SimpleDurationDescriptor(Cost cost, double duration) {
    this.cost = cost;
    this.duration = duration;
    this.duplicates = false;
  }

  @Override
  public Cost cost() {
    return cost;
  }

  @Override
  public double durationModifier() {
    return duration;
  }

  @Override
  public boolean allowsDuplicates() {
    return duplicates;
  }

  public SimpleDurationDescriptor allowDuplication() {
    this.duplicates = true;
    return this;
  }
}
