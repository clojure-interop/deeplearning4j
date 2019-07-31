(ns org.nd4j.linalg.api.memory.enums.LearningPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums LearningPolicy]))

(def FIRST_LOOP
  "Enum Constant.

  This policy means - we learn during 1 cycle,
  and allocate workspace memory right after it's done.

  type: org.nd4j.linalg.api.memory.enums.LearningPolicy"
  LearningPolicy/FIRST_LOOP)

(def OVER_TIME
  "Enum Constant.

  This policy means - we learn during multiple cycles,
  and allocate after WorkspaceConfiguration.cyclesBeforeInitialization
  or after manual call to MemoryWorkspace.initializeWorkspace

  type: org.nd4j.linalg.api.memory.enums.LearningPolicy"
  LearningPolicy/OVER_TIME)

(def NONE
  "Enum Constant.

  This policy means - no learning is assumed, WorkspaceConfiguration.initialSize value will be primary determinant for workspace size

  type: org.nd4j.linalg.api.memory.enums.LearningPolicy"
  LearningPolicy/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (LearningPolicy c : LearningPolicy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.LearningPolicy[]`"
  ([]
    (LearningPolicy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.LearningPolicy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.LearningPolicy [^java.lang.String name]
    (LearningPolicy/valueOf name)))

