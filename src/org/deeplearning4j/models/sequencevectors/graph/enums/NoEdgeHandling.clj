(ns org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.enums NoEdgeHandling]))

(def SELF_LOOP_ON_DISCONNECTED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling"
  NoEdgeHandling/SELF_LOOP_ON_DISCONNECTED)

(def EXCEPTION_ON_DISCONNECTED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling"
  NoEdgeHandling/EXCEPTION_ON_DISCONNECTED)

(def PADDING_ON_DISCONNECTED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling"
  NoEdgeHandling/PADDING_ON_DISCONNECTED)

(def CUTOFF_ON_DISCONNECTED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling"
  NoEdgeHandling/CUTOFF_ON_DISCONNECTED)

(def RESTART_ON_DISCONNECTED
  "Enum Constant.

  type: org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling"
  NoEdgeHandling/RESTART_ON_DISCONNECTED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (NoEdgeHandling c : NoEdgeHandling.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling[]`"
  ([]
    (NoEdgeHandling/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.models.sequencevectors.graph.enums.NoEdgeHandling [^java.lang.String name]
    (NoEdgeHandling/valueOf name)))

