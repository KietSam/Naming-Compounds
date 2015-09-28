public enum Element {
   HYDROGEN("Hydrogen", "H", 1, "nm"),
   HELIUM("Helium", "He", 0, "nm"),
   LITHIUM("Lithium", "Li", 1, "m"),
   BERYLIUM("Berylium", "Be", 2, "m"),
   BORON("Boron", "B", 3, "nm"),
   CARBON("Carbon", "C", 4, "nm"),
   NITROGEN("Nitrogen", "N", -3, "nm"),
   OXYGEN("Oxide", "O", -2, "nm"),
   FLUORINE("Fluorine", "F", -1, "nm"),
   NEON("Neon", "Ne", 0, "nm"),
   SODIUM("Sodium", "Na", 1, "m"),
   MAGNESIUM("Magnesium", "Mg", 2, "m"),
   ALUMINUM("Aluminum", "Al", 3, "m"),
   SILICON("Silicon", "Si", 4, "nm"),
   PHOSPHOROUS("Phosphorous", "P", -3, "nm"),
   SULFUR("Sulfur", "S", -2, "nm"),
   CHLORINE("Chlorine", "Cl", -1, "nm"),
   ARGON("Argon", "Ar", 0, "nm"),
   POTASSIUM("Potassium", "K", 1, "m"),
   CALCIUM("Calcium", "Ca", 2, "m"),
   SCANDIUM("Scandium", "Sc", "tm"), //TM
   TITANIUM("Titanium", "Ti", "tm"),
   VANADIUM("Vanadium", "V", "tm"),
   CHROMIUM("Chromium", "Cr", "tm"),
   MANGANESE("Manganese", "Mn", "tm"), //TM
   IRON("Iron", "Fe", "tm"), //TM
   COBALT("Cobalt", "Co", "tm"), //TM
   NICKEL("Nickel", "Ni", "tm"), //TM
   COPPER("Copper", "Cu", "tm"), //TM
   ZINC("Zinc", "Zn", 2, "tm"),
   GALLIUM("Gallium", "Ga", 3, "tm"),
   ARSENIC("Arsenic", "As", -3, "nm"),
   SELENIUM("Selenium", "Se", -2, "nm"),
   BROMINE("Bromine", "Br", -1, "nm"),
   KRYPTON("Krypton", "Kr", 0, "nm"),
   RUBIDIUM("Rubidium", "Rb", 1, "m"),
   STRONTIUM("Strontium", "Sr", 2, "m"),
   YTTRIUM("Yttrium", "Y", "tm"),
   ZIRCONIUM("Zirconium", "Zr", "tm"),
   NIOBIUM("Niobium", "Nb", "tm"),
   MOLYBDENUM("Molybdenum", "Mo", "tm"),
   TECHNETIUM("Technetium", "Te", "tm"),
   RUTHENIUM("Ruthenium", "Ru", "tm"),
   RHODIUM("Rhodium", "Rh", "tm"),
   PALLADIUM("Palladium", "Pd", "tm"),
   SILVER("Silver", "Ag", 1, "tm"),
   CADMIUM("Cadmium", "Cd", 2, "tm"),
   INDIUM("Indium", "In", "tm"),
   TIN("Tin", "Sn", "tm"), //TM
   ANTIMONY("Antimony", "Sb", -3, "m"),
   TELLURIUM("Tellurium", "Te", -2, "nm"),
   IODINE("Iodine", "I", -1, "nm"),
   XENON("Xenon", "Xe", 0, "nm"),
   CAESIUM("Caesium", "Cs", 1, "m"),
   BARIUM("Barium", "Ba", 2, "m"),
   //SKIPPED 57-77
   PLATINUM("Platinum", "Pt", "tm"),
   GOLD("Gold", "Au", "tm"), //TM
   MERCURY("Mercury", "Hg", "tm"), //TM
   THALLIUM("Thallium", "Tl", 3, "m"),
   LEAD("Lead", "Pb", "tm"), //TM
   BISMUTH("Bismuth", "Bi", "tm"), //TM
   POLONIUM("Polonium", "Po", "tm"),
   
   //NEW
   AMMONIUM("Ammonium", "NH4", 1, "pi"),
   CHLORATE("Chlorate", "ClO3", -1, "pi"),
   PERMANGANATE("Permanganate", "MnO4", -1, "pi"),
   HYDROXIDE("Hydroxide", "OH", -1, "pi"),
   SULFATE("Sulfate", "SO4", -2, "pi"),
   SULFITE("Sulfite", "SO3", -2, "pi"),
   CHROMATE("Chromate", "CrO4", -2, "pi"),
   DICHROMATE("Dichromate", "Cr2O7", -2, "pi");
   
   /*
   nm = nonmetal
   tm = transitional metal
   m = metal
   pi = polyatomic ion
   */
   
   private String name;
   private String symbol;
   private int charge;
   private String type;
   
   private Element (String name, String symbol, int charge, String type) {
      this.name = name;
      this.symbol = symbol;
      this.charge = charge;
      this.type = type;
   }
   
   private Element (String name, String symbol, String type) {
      this.name = name;
      this.symbol = symbol;
      this.type = type;
      charge = -1;
   }
   
   public String getName(){ return name; }
   
   public String getSymbol(){ return symbol; }
   
   public int getCharge() { return charge; }
   
   public String getType () { return type; }
   
}