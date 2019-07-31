(ns org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.enums WalkDirection]))

(def FORWARD_ONLY
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection"
  WalkDirection/FORWARD_ONLY)

(def FORWARD_PREFERRED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection"
  WalkDirection/FORWARD_PREFERRED)

(def FORWARD_UNIQUE
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection"
  WalkDirection/FORWARD_UNIQUE)

(def RANDOM
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection"
  WalkDirection/RANDOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (WalkDirection c : WalkDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection[]`"
  ([]
    (WalkDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.models.sequencevectors.graph.enums.WalkDirection [^java.lang.String name]
    (WalkDirection/valueOf name)))

