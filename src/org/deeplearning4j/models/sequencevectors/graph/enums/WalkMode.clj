(ns org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.enums WalkMode]))

(def RANDOM
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode"
  WalkMode/RANDOM)

(def WEIGHTED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode"
  WalkMode/WEIGHTED)

(def POPULARITY
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode"
  WalkMode/POPULARITY)

(def NEAREST
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode"
  WalkMode/NEAREST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (WalkMode c : WalkMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode[]`"
  ([]
    (WalkMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.models.sequencevectors.graph.enums.WalkMode [^java.lang.String name]
    (WalkMode/valueOf name)))

