(ns org.nd4j.linalg.api.memory.enums.AllocationPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums AllocationPolicy]))

(def STRICT
  "Enum Constant.

  This policy means - we're allocating exact values we specify for WorkspaceConfiguration.initialSize, or learn during loops

  type: org.nd4j.linalg.api.memory.enums.AllocationPolicy"
  AllocationPolicy/STRICT)

(def OVERALLOCATE
  "Enum Constant.

  This policy means - we'll be overallocating memory, following WorkspaceConfiguration.overallocationLimit

  type: org.nd4j.linalg.api.memory.enums.AllocationPolicy"
  AllocationPolicy/OVERALLOCATE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (AllocationPolicy c : AllocationPolicy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.AllocationPolicy[]`"
  ([]
    (AllocationPolicy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.AllocationPolicy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.AllocationPolicy [^java.lang.String name]
    (AllocationPolicy/valueOf name)))

