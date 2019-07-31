(ns org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator.enums InequalityHandling]))

(def STOP_EVERYONE
  "Enum Constant.

  Parallel iterator will stop everything once one of producers runs out of data

  type: org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling"
  InequalityHandling/STOP_EVERYONE)

(def PASS_NULL
  "Enum Constant.

  Parallel iterator will keep returning true on hasNext(), but next() will return null instead of DataSet

  type: org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling"
  InequalityHandling/PASS_NULL)

(def RESET
  "Enum Constant.

  Parallel iterator will silently reset underlying producer

  type: org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling"
  InequalityHandling/RESET)

(def RELOCATE
  "Enum Constant.

  Parallel iterator will ignore this producer, and will use other producers.
  PLEASE NOTE: This option will invoke cross-device relocation in multi-device systems.

  type: org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling"
  InequalityHandling/RELOCATE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (InequalityHandling c : InequalityHandling.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling[]`"
  ([]
    (InequalityHandling/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling [^java.lang.String name]
    (InequalityHandling/valueOf name)))

