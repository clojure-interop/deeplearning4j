(ns org.deeplearning4j.ui.stats.sbe.MetaAttribute
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe MetaAttribute]))

(def EPOCH
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MetaAttribute"
  MetaAttribute/EPOCH)

(def TIME_UNIT
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MetaAttribute"
  MetaAttribute/TIME_UNIT)

(def SEMANTIC_TYPE
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MetaAttribute"
  MetaAttribute/SEMANTIC_TYPE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MetaAttribute c : MetaAttribute.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.stats.sbe.MetaAttribute[]`"
  ([]
    (MetaAttribute/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.stats.sbe.MetaAttribute [^java.lang.String name]
    (MetaAttribute/valueOf name)))

