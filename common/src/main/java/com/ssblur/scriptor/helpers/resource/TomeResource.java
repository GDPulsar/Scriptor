package com.ssblur.scriptor.helpers.resource;

import com.ssblur.scriptor.api.word.Action;
import com.ssblur.scriptor.api.word.Descriptor;
import com.ssblur.scriptor.api.word.Subject;
import com.ssblur.scriptor.error.WordNotFoundException;
import com.ssblur.scriptor.registry.words.WordRegistry;
import com.ssblur.scriptor.word.PartialSpell;
import com.ssblur.scriptor.word.Spell;

import java.util.ArrayList;
import java.util.List;

public class TomeResource {

  String name;
  String author;
  SpellResource spell;
  String item;
  int tier;

  public String getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }
  public int getTier() { return tier; }

  public String getItem() { return item; }

  public Spell getSpell() {
    List<PartialSpell> spells = new ArrayList<>();

    for(var spell: spell.spells) {
      Action action = WordRegistry.INSTANCE.actionRegistry.get(spell.action);
      if (action == null)
        throw new WordNotFoundException(spell.action);

      ArrayList<Descriptor> descriptors = new ArrayList<>();
      for (String string : spell.descriptors) {
        Descriptor descriptor = WordRegistry.INSTANCE.descriptorRegistry.get(string);
        if (descriptor == null)
          throw new WordNotFoundException(string);
        descriptors.add(descriptor);
      }

      spells.add(new PartialSpell(action, descriptors.toArray(Descriptor[]::new)));
    }

    Subject subject = WordRegistry.INSTANCE.subjectRegistry.get(spell.subject);
    if(subject == null)
      throw new WordNotFoundException(spell.subject);

    return new Spell(subject, spells.toArray(PartialSpell[]::new));
  }
}
